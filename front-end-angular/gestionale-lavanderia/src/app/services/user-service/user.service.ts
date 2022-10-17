import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/classes/user';
import { GlobalVariablesService } from '../global variables/global-variables.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private http: HttpClient, private globalVariables: GlobalVariablesService) {
  } 

  public findAllUser(): Observable<User[]> {
    return this.http.get<User[]>(this.globalVariables.url + "vediUtenti");
  }

  public findUtenteSingolo(id: number): Observable<User> {
    return this.http.get<User>(this.globalVariables.url + "vediUtenti/" + id);
  }

  public findUtenteFiltrato(username: string): Observable<User[]> {
    return this.http.get<User[]>(this.globalVariables.url + "getSpecificUsers/" + username)
  }

  public existUser(username: string) {
    return this.http.get<boolean>(this.globalVariables.url + "existUser/"+ username);
  }

  public saveUser(user: User){
    return this.http.post<User>(this.globalVariables.url + "registerUser", user);
  }

  public deleteUser(id: number){
    return this.http.delete<number>(this.globalVariables.url + "deleteUser/" + id);
  }



}
