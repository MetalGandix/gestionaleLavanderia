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
  dictionaryCost: any[] = [];
  sommaDizionario: number = 0;

  contract(username: string) {
    this.moneySum = 0
    this.allMoney = []
    this.capiService.findArticoloForSingleUser(username).subscribe(capi => {
      this.listArticoli = capi
    }).add(() => {
      let numberToSum: number = 0;
      this.listArticoli.forEach(articolo => {
        let date = new Date(articolo.initialDate);
        numberToSum += articolo.prezzo
        this.dictionaryMonthValue[date.getMonth()] = numberToSum
      })
      console.log(this.dictionaryMonthValue)
      let dataOdierna: Date = new Date()
      console.log(dataOdierna.getMonth())
      for (let key in this.dictionaryMonthValue) {
        if (dataOdierna.getMonth().toString() == key) {
          if (this.dictionaryMonthValue[key] > 100) {
            this.moneySum = this.dictionaryMonthValue[key]
            console.log(this.moneySum)
          }
        }
      }
      this.smartContractService.convertAllMoney(this.moneySum)
    }
    )
  }

  sum(obj) {
    this.sommaDizionario = 0;
    for (var el of obj) {
      if (obj.hasOwnProperty(el)) {
        debugger
        this.sommaDizionario += parseFloat(obj[el]);
      }
    }
    return this.sommaDizionario;
  }

  openDialog(username: string): void {
    this.serviceUser.findUtenteSingolo(username).subscribe(user => {
      this.singleUser = user
      this.dialog.open(UserDialogComponent, {
        width: '500px',
        data: this.singleUser
      });
    })
  }

  ngOnInit() {
    this.onPageChange({ pageIndex: 0, pageSize: 8 })
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userFiltredList = lista
    })
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
    })
  }

  findCapiSingleUser(username: string) {
    this.capiService.findCapiForSingleUser(username).subscribe(x => {
      this.capiOfUser = x
    })
  }

  goToAggiungiCapi(username: string) {
    this.serviceUser.findUtenteSingolo(username).subscribe(user => {
      this.singleUser = user
    }).add(() => {
      this.router.navigate(["/consegna-capi"], {
        state: { singleUser: this.singleUser, capiOfUser: this.capiOfUser }
      })
    })
  }

  goToMostraCapi(username: string) {
    this.serviceUser.findUtenteSingolo(username).subscribe(user => {
      this.singleUser = user
    }).add(() => {
      this.router.navigate(["/mostra-capi"], {
        state: { singleUser: this.singleUser, capiOfUser: this.capiOfUser }
      })
    })
  }

  deleteUser(username: string) {
    this.serviceUser.deleteUser(username).subscribe().add(
      this._snackBar.open("Utente rimosso correttamente", "Chiudi", {
        panelClass: ['blue-snackbar']
      })._dismissAfter(4000)
    )
    this.findUserLike()
  }

}
