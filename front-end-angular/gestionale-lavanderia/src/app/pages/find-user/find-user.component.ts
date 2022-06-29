import { Component, OnInit } from '@angular/core';
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

  constructor(private serviceUser: UserService, private capiService: CapiService) { }

  userList: User[] = []
  userFiltredList: User[] = []
  userSearched: string;
  userClicked: string;
  userSingle: User
  capiOfUser: ComplexCapiObject


  ngOnInit() {
    this.serviceUser.findAllUser().subscribe(lista => {
      this.userList = lista
    })
  }

  findUserLike(){
    this.serviceUser.findUtenteFiltrato(this.userSearched).subscribe(filteredUsers => {
      this.userFiltredList = filteredUsers
    })
  }

  findCapiSingleUser(username: string){
    this.capiService.findCapiForSingleUser(username).subscribe(x => {
      this.capiOfUser = x
      console.log(this.capiOfUser)
    })
  }
}
