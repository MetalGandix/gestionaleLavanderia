import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ComplexCapiObject } from '../classes/capi_classes/complex-capi-object';
import { User } from '../classes/user';
import { GlobalVariablesService } from './global variables/global-variables.service';

@Injectable({
  providedIn: 'root'
})
export class CapiService {


  constructor(private http: HttpClient, private globalVariables: GlobalVariablesService) {
  } 

  public findCapiForSingleUser(username: string): Observable<ComplexCapiObject> {
    return this.http.get<ComplexCapiObject>(this.globalVariables.url + "getAllCapiFromUser/" + username);
  }

  public insertDressForUser(complexCapiObject: ComplexCapiObject){
    return this.http.post<ComplexCapiObject>(this.globalVariables.url + "insertDress", complexCapiObject);
  }

}
