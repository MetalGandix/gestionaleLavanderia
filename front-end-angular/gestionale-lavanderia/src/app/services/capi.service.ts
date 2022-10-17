import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { CapiInfo } from '../classes/capi-info';
import { Articolo } from '../classes/capi_classes/articolo';
import { ComplexCapiObject } from '../classes/capi_classes/complex-capi-object';
import { Categoria } from '../classes/categoria';
import { SottoCategoria } from '../classes/sotto-categoria';
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

  public findArticoloForSingleUser(id: number): Observable<Articolo[]> {
    return this.http.get<Articolo[]>(this.globalVariables.url + "getAllArticoliFromUser/" + id);
  }

  public insertDressForUser(complexCapiObject: ComplexCapiObject) {
    return this.http.post<ComplexCapiObject>(this.globalVariables.url + "insertDress", complexCapiObject);
  }

  public getArticleById(id: number): Observable<Articolo>{
    return this.http.get<Articolo>(this.globalVariables.url + "findArticleById/" + id);
  }

  public deleteArticleFromUser(articolo: Articolo) {
    return this.http.post<Articolo>(this.globalVariables.url + "deleteArticleFromUser", articolo);
  }

  public getInfoAboutArticle(id: number): Observable<CapiInfo>{
    return this.http.get<CapiInfo>(this.globalVariables.url + "getAllInfoOfArticle/" + id);
  }

  public getAllArticles(): Observable<Articolo[]>{
    return this.http.get<Articolo[]>(this.globalVariables.url + "getAllArticles")
  }

  public getLastNLavorazione(): Observable<number>{
    return this.http.get<number>(this.globalVariables.url + "getLastNLavorazione")
  }

  public deleteArticle(id: number): Observable<number>{
    return this.http.get<number>(this.globalVariables.url + "deleteArticle/" + id)
  }

  public getCategories(): Observable<Categoria[]>{
    return this.http.get<Categoria[]>(this.globalVariables.url + "getAllCategories")
  }

  public getSubCatFromId(id: number): Observable<SottoCategoria>{
    return this.http.get<SottoCategoria>(this.globalVariables.url + "getSubCategoryById/" + id)
  }

  public getAllsubCat(): Observable<SottoCategoria[]>{
    return this.http.get<SottoCategoria[]>(this.globalVariables.url + "getAllSubCat")
  }

  public changeArticleInfo(articolo: Articolo): Observable<Articolo>{
    return this.http.put<Articolo>(this.globalVariables.url + "changeArticle", articolo)
  }
}