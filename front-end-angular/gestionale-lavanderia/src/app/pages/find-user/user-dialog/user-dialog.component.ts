import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { FindUserComponent } from '../find-user.component';
import { User } from 'src/app/classes/user';

@Component({
  selector: 'app-user-dialog',
  templateUrl: './user-dialog.component.html',
  styleUrls: ['./user-dialog.component.css']
})
export class UserDialogComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public data: FindUserComponent) { }

  singleUser: User

  ngOnInit(): void {
    //Cast da data: FindUserComponent a data: User
    this.singleUser = this.data as unknown as User
  }

}