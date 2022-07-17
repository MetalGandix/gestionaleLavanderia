import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { FindUserComponent } from '../find-user.component';

@Component({
  selector: 'app-user-dialog',
  templateUrl: './user-dialog.component.html',
  styleUrls: ['./user-dialog.component.css']
})
export class UserDialogComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<FindUserComponent>) { }

  ngOnInit(): void {
  }

}
