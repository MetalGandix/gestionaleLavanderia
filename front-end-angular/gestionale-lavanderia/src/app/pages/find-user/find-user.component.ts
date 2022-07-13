import { Component, OnInit } from '@angular/core';
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

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router) { }

  userList: User[] = []
  userFiltredList: User[] = []
  userSearched: string;
  userClicked: string;
  singleUser: User
  capiOfUser: ComplexCapiObject

  ngOnInit() {
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userList = lista
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

}
