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

  contract(username: string){
    this.moneySum = 0
    this.allMoney = []
    this.capiService.findArticoloForSingleUser(username).subscribe(capi => {
      this.listArticoli = capi
    }).add(() => {
      this.listArticoli.forEach(articolo => {
        const date = new Date(articolo.date);
        console.log(date)
        this.allMoney.push(articolo.prezzo)
      })
      this.moneySum = this.allMoney.reduce((a, b) => a + b, 0)
      console.log(this.moneySum)
      this.smartContractService.convertAllMoney(this.moneySum)
    }
    )
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
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userFiltredList = lista
    })
  }

  showUserInfo(){
    this.serviceUser.findUtenteFiltrato(this.userSearched).subscribe(filteredUsers => {
      this.userFiltredList = filteredUsers
    })
  }

  removeFilter(){
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

  deleteUser(username: string){
    this.serviceUser.deleteUser(username).subscribe().add(
      this._snackBar.open("Utente rimosso correttamente", "Chiudi", {
        panelClass: ['blue-snackbar']
      })._dismissAfter(4000)
    )
    this.findUserLike()
  }

}
