import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class CapiService {

  constructor(private httpClient:HttpClient, private router: Router, private location: Location) { 
  }

}
