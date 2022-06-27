import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/classes/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-find-user',
  templateUrl: './find-user.component.html',
  styleUrls: ['./find-user.component.css']
})
export class FindUserComponent implements OnInit {

  constructor(private serviceUser: UserService) { }

  userList: User[] = []
  userFiltredList: User[] = []
  userSearched: string;

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
}
