import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
import { User } from 'src/app/classes/user';
import { CapiService } from 'src/app/services/capi.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-find-user',
  templateUrl: './find-user.component.html',
  styleUrls: ['./find-user.component.css']
})
export class FindUserComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private _snackBar: MatSnackBar) { }

  userList: User[] = []
  userFiltredList: User[] = []
  userSearched: string;
  userClicked: string;
  singleUser: User
  capiOfUser: ComplexCapiObject

  ngOnInit() {
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userFiltredList = lista
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
      console.log(this.capiOfUser)
    })
  }

  findUtenteSingolo(username: string) {
    this.findCapiSingleUser(username)
    this.serviceUser.findUtenteSingolo(username).subscribe(user => {
      this.singleUser = user
    }).add(() => {
      // retrieve objects of logged user
      this.goToConsegnaCapi()
    })
  }

  goToConsegnaCapi() {
    this.router.navigate(["/consegna-capi"], {
      state: { singleUser: this.singleUser, capiOfUser: this.capiOfUser }
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
