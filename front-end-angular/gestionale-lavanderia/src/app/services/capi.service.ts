import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CapiInfo } from '../classes/capi-info';
import { Articolo } from '../classes/capi_classes/articolo';
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

  public findArticoloForSingleUser(username: string): Observable<Articolo[]> {
    return this.http.get<Articolo[]>(this.globalVariables.url + "getAllArticoliFromUser/" + username);
  }

  public insertDressForUser(complexCapiObject: ComplexCapiObject) {
    return this.http.post<ComplexCapiObject>(this.globalVariables.url + "insertDress", complexCapiObject);
  }

  public getArticleByIf(id: number): Observable<Articolo>{
    return this.http.get<Articolo>(this.globalVariables.url + "findArticleById/" + id);
  }

  public changeArticle(articolo: Articolo) {
    return this.http.post<Articolo>(this.globalVariables.url + "changeArticoloFromUser", articolo);
  }

  public getInfoAboutArticle(id: number): Observable<CapiInfo>{
    return this.http.get<CapiInfo>(this.globalVariables.url + "getAllInfoOfArticle/" + id);
  }

}