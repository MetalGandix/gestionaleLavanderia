import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../classes/user';
import { GlobalVariablesService } from './global variables/global-variables.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private http: HttpClient, private globalVariables: GlobalVariablesService) {
  } 

  public findAllUser(): Observable<User[]> {
    return this.http.get<User[]>(this.globalVariables.url + "vediUtenti");
  }

  public findUtenteSingolo(username: string): Observable<User[]> {
    return this.http.get<User[]>(this.globalVariables.url + "vediUtenti/" + username);
  }

  public findUtenteFiltrato(username: string): Observable<User[]> {
    return this.http.get<User[]>(this.globalVariables.url + "getSpecificUsers/" + username)
  }

}
