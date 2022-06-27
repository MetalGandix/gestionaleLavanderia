import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../classes/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url: string

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080/';
  } 

  public findAllUser(): Observable<User[]> {
    return this.http.get<User[]>(this.url + "vediUtenti");
  }

  public findUtenteSingolo(username: string): Observable<User[]> {
    return this.http.get<User[]>(this.url + "vediUtenti/" + username);
  }

  public findUtenteFiltrato(username: string): Observable<User[]> {
    return this.http.get<User[]>(this.url + "getSpecificUsers/" + username)
  }

}
