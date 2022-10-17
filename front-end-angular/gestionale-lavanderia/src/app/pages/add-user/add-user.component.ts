import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { User } from 'src/app/classes/user';
import { UserService } from 'src/app/services/user-service/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  constructor(private registrazioneService: UserService, private router: Router, private _snackBar: MatSnackBar) {
    this.user = new User();
  }

  user: User;
  userExist: boolean = false;
  b1: boolean = false;
  b2: boolean = false;
  clicked: boolean = false;
  username: string;
  surname: string;
  phone: string;
  email: string;
  sesso: string;
  codiceFiscale: string;
  presentatoDa: string;
  numeroCard: string;
  scontoCard: string;
  cap: string;
  citta: string;
  regioneSociale: string;
  indirizzo: string;
  provincia: string;

  ngOnInit(): void {
  }

  submitUser() {
    this.user.username = this.username
    this.user.lastname = this.surname
    this.user.number = this.phone
    this.user.email = this.email
    this.user.password = ""
    this.user.sesso = this.sesso
    this.user.indirizzo = this.indirizzo
    this.registrazioneService.saveUser(this.user).subscribe().add(() => {
      this._snackBar.open("Utente aggiunto correttamente", "Chiudi", {
        panelClass: ['blue-snackbar']
      })._dismissAfter(4000), this.router.navigate(["/find-user"])
    }
    )
  }

  existUser() {
    if (this.user.username != '') {
      this.registrazioneService.existUser(this.user.username).subscribe(res => {
        if (res) {
          this.userExist = true;
          if (this.userExist == true) {
            console.log("Esiste")
          }
        } else {
          this.userExist = false;
          console.log("Non esiste")
        }
      })
    }
  }

}
