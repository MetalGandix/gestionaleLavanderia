import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Articolo } from 'src/app/classes/capi_classes/articolo';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
import { User } from 'src/app/classes/user';
import { CapiService } from 'src/app/services/capi-service/capi.service';
import { SmartContractService } from 'src/app/services/smart-contract-service/smart-contract.service';
import { UserService } from 'src/app/services/user-service/user.service';
import { UserDialogComponent } from './user-dialog/user-dialog.component';

@Component({
  selector: 'app-find-user',
  templateUrl: './find-user.component.html',
  styleUrls: ['./find-user.component.css']
})
export class FindUserComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private _snackBar: MatSnackBar, public dialog: MatDialog, private smartContractService: SmartContractService) { }

  userList: User[] = []
  userFiltredList: User[] = []
  userSearched: string;
  userClicked: string;
  singleUser: User
  capiOfUser: ComplexCapiObject
  listArticoli: Articolo[] = []
  allMoney: number[] = []
  moneySum: number = 0;
  pageIndex = 0;
  pageSize = 0;
  dictionaryMonthValue: { [key: number]: number } = {}
  dictionaryUserMoney: any[] = []
  sommaDizionario: number = 0;

  calculateMoney(user: User) {
    this.moneySum = 0
    this.allMoney = []
    this.listArticoli = []
    this.capiService.findArticoloForSingleUser(user.id).subscribe(capi => {
      this.dictionaryMonthValue = {}
      this.listArticoli = capi
      let numberToSum: number = 0;
      this.listArticoli.forEach(articolo => {
        let date = new Date(articolo.initialDate);
        numberToSum += articolo.prezzo
        this.dictionaryMonthValue[date.getMonth()] = numberToSum
      })
      let dataOdierna: Date = new Date()
      for (let key in this.dictionaryMonthValue) {
        //Se l'if è vero significa che una transazione è già stata eseguita in questo mese.
        if(user.lastPaidEthMonth != dataOdierna.getMonth()){ 
        //Se l'if è vero significa che nel dizionario ci sono articoli con quel mese inserito
        if (dataOdierna.getMonth().toString() == key) {      
          //Se l'if è vero signifca che il cliente ha speso + di 100 euro quindi sarà possibile effettuare una transazione nel suo portafoglio
          if (this.dictionaryMonthValue[key] > 99) {        
            user.money = this.dictionaryMonthValue[key]
            user.canReceiveEth = true
            user.paidMonth = false
          } else {
            user.money = this.dictionaryMonthValue[key]
          }
        }
      }else{
        user.money = this.dictionaryMonthValue[key]
      }
    }
    })
  }

  contract(user: User) {
    let date = new Date()
    this.smartContractService.convertAllMoney(user.money)
    user.paidMonth = true
    user.lastPaidEthMonth = date.getMonth()
    this.serviceUser.saveUser(user).subscribe().add(()=> {
      this.findUsers()
    })
  }

  //Apre un dialog con le info dell'utente
  openDialog(id: number): void {
    this.serviceUser.findUtenteSingolo(id).subscribe(user => {
      this.singleUser = user
      this.dialog.open(UserDialogComponent, {
        width: '500px',
        data: this.singleUser
      });
    })
  }

  createUserPage(){
    this.onPageChange({ pageIndex: 0, pageSize: 8 })
    this.findUsers()
  }

  //Carica la lista degli utenti e per ognuno di essi calcola quanti soldi hanno e se possono ricevere ether.
  findUsers(){
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userFiltredList = lista
      this.userFiltredList.forEach(user => {
        user.money = 0
        this.calculateMoney(user)
      })
    })
  }

  ngOnInit() {
    this.createUserPage()
  }

  onPageChange($event) {
    this.pageSize = $event.pageSize
    this.pageIndex = $event.pageIndex
  }

  showUserInfo() {
    this.serviceUser.findUtenteFiltrato(this.userSearched).subscribe(filteredUsers => {
      this.userFiltredList = filteredUsers
    })
  }

  removeFilter() {
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userFiltredList = lista
    })
  }

  findUserLike() {
    this.serviceUser.findUtenteFiltrato(this.userSearched).subscribe(filteredUsers => {
      this.userFiltredList = filteredUsers
      this.userFiltredList.forEach(user => {
        user.money = 0
        this.calculateMoney(user)
      })
    })
  }

  findCapiSingleUser(username: string) {
    this.capiService.findCapiForSingleUser(username).subscribe(x => {
      this.capiOfUser = x
    })
  }

  goToAggiungiCapi(id: number) {
    this.serviceUser.findUtenteSingolo(id).subscribe(user => {
      this.singleUser = user
    }).add(() => {
      this.router.navigate(["/consegna-capi"], {
        state: { singleUser: this.singleUser, capiOfUser: this.capiOfUser }
      })
    })
  }

  goToMostraCapi(id: number) {
    this.serviceUser.findUtenteSingolo(id).subscribe(user => {
      this.singleUser = user
    }).add(() => {
      this.router.navigate(["/mostra-capi"], {
        state: { singleUser: this.singleUser, capiOfUser: this.capiOfUser }
      })
    })
  }

  deleteUser(id: number) {
    this.serviceUser.deleteUser(id).subscribe().add(() => {
      this._snackBar.open("Utente rimosso correttamente", "Chiudi", {
        panelClass: ['blue-snackbar']
      })._dismissAfter(4000), this.createUserPage()
    }
    )
  }

}
