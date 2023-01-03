import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { FindUserComponent } from '../find-user.component';
import { User } from 'src/app/classes/user';
import { UserService } from 'src/app/services/user-service/user.service';

@Component({
  selector: 'app-user-dialog',
  templateUrl: './user-dialog.component.html',
  styleUrls: ['./user-dialog.component.css']
})
export class UserDialogComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public data: FindUserComponent,private userService: UserService) { }

  singleUser: User

  ngOnInit(): void {
    //Cast da data: FindUserComponent a data: User
    this.singleUser = this.data as unknown as User
  }

  modifyUser(){
    this.userService.saveUser(this.singleUser).subscribe()
  }

}
