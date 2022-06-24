import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { map } from 'rxjs';
import jwt_decode from 'jwt-decode';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private httpClient:HttpClient, private router: Router, private location: Location) { 
  }

authenticate(username, password) {
 return this.httpClient.post<any>('http://localhost:8080/authenticate',{username,password}).pipe(
   map(
     userData => {
     sessionStorage.setItem('username',username);
     let tokenStr= userData.token;
     sessionStorage.setItem('token', tokenStr);
     sessionStorage.setItem('Role', userData.utente.authorities[0].authority);
     return userData;
     }
   )

 );
}

isUserLoggedIn() {
 let user = sessionStorage.getItem('token');
 let username = sessionStorage.getItem('username');
 return !(user && username === null)
}

logOut() {
 //window.location.reload()
 sessionStorage.removeItem('username');
 sessionStorage.removeItem('token');
 sessionStorage.removeItem('Role');
 this.router.navigate(['/home']).then(() => {
   window.location.reload();
 });
}

getRole(){
 let token = jwt_decode(sessionStorage.getItem('token'));
 return token['role'];
}
}