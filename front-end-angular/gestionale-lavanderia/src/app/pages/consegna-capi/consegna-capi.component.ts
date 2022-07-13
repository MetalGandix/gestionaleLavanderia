import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Abiti } from 'src/app/classes/capi_classes/abiti';
import { Camicie } from 'src/app/classes/capi_classes/camicie';
import { Cappelli } from 'src/app/classes/capi_classes/cappelli';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
import { GiaccheEGiacconi } from 'src/app/classes/capi_classes/giacche-egiacconi';
import { Gonne } from 'src/app/classes/capi_classes/gonne';
import { Maglie } from 'src/app/classes/capi_classes/maglie';
import { Pantaloni } from 'src/app/classes/capi_classes/pantaloni';
import { PigiamaEVestaglie } from 'src/app/classes/capi_classes/pigiama-evestaglie';
import { Scarpe } from 'src/app/classes/capi_classes/scarpe';
import { Tappeti } from 'src/app/classes/capi_classes/tappeti';
import { Tende } from 'src/app/classes/capi_classes/tende';
import { TrapunteEPiumoni } from 'src/app/classes/capi_classes/trapunte-epiumoni';
import { Varie } from 'src/app/classes/capi_classes/varie';
import { User } from 'src/app/classes/user';
import { CapiService } from 'src/app/services/capi.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-consegna-capi',
  templateUrl: './consegna-capi.component.html',
  styleUrls: ['./consegna-capi.component.css']
})
export class ConsegnaCapiComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router) { }

  capiToAdd: ComplexCapiObject = new ComplexCapiObject()
  singleUser: User
  capiOfUser: ComplexCapiObject
  pantaloni: Pantaloni = new Pantaloni()

  pantaloni_array = [{name:"Pantalone divisa", icon:"assets//images//pantalone_divisa.png", value: 1},{name:"Pantalone donna", icon:"", value: 2},
  {name:"Pantalone solo stiro", icon:"", value: 3},{name:"Pantalone uomo", icon:"assets//images//jeans_uomo.png", value: 4},{name:"Pantaloni pelle", icon:"", value: 5},{name:"Tuta donna", icon:"", value: 6}]

  ngOnInit(){
    if(window.history.state.singleUser == undefined || window.history.state.singleUser == null){
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.capiOfUser = window.history.state.capiOfUser
    console.log(this.capiOfUser)
  }

  insertPantaloni(){
    this.pantaloni.pantaloneDivisa
  }

  insertIntoUser(abiti: Abiti, camicie: Camicie, cappelli: Cappelli, giaccheEGiacconi: GiaccheEGiacconi, gonne: Gonne, maglie: Maglie, pantaloni: Pantaloni, pigiamaEVestaglie: PigiamaEVestaglie, scarpe: Scarpe, tappeti: Tappeti, tende: Tende, trapunteEPiumoni: TrapunteEPiumoni, varie: Varie) {
    if (abiti != null || !undefined) {
      this.capiToAdd.abiti = abiti
    }
    if (camicie != null || !undefined) {
      this.capiToAdd.camicie = camicie
    }
    if (cappelli != null || !undefined) {
      this.capiToAdd.cappelli = cappelli
    }
    if (giaccheEGiacconi != null || !undefined) {
      this.capiToAdd.giaccheEGiacconi = giaccheEGiacconi
    }
    if (gonne != null || !undefined) {
      this.capiToAdd.gonne = gonne
    }
    if (maglie != null || !undefined) {
      this.capiToAdd.maglie = maglie
    }
    if (pantaloni != null || !undefined) {
      this.capiToAdd.pantaloni = pantaloni
    }
    if (pigiamaEVestaglie != null || !undefined) {
      this.capiToAdd.pigiamaEVestaglie = pigiamaEVestaglie
    }
    if (scarpe != null || !undefined) {
      this.capiToAdd.scarpe = scarpe
    }
    if (tappeti != null || !undefined) {
      this.capiToAdd.tappeti = tappeti
    }
    if (tende != null || !undefined) {
      this.capiToAdd.tende = tende
    }
    if (trapunteEPiumoni != null || !undefined) {
      this.capiToAdd.trapunteEPiumoni = trapunteEPiumoni
    }
    if (varie != null || !undefined) {
      this.capiToAdd.varie = varie
    }
    this.capiService.insertDressForUser(this.capiToAdd).subscribe()
  }

  sendTest(){
    this.capiToAdd.pantaloni = this.pantaloni
    this.capiService.insertDressForUser(this.capiToAdd).subscribe()
  }

  insert(number){
    if(number == 1){
      this.pantaloni.pantaloneDivisa++
    }
    if(number == 2){
      this.pantaloni.pantaloneDonna++
    }
    if(number == 3){
      this.pantaloni.pantaloneSoloStiro++
    }
    if(number == 4){
      this.pantaloni.pantaloneUomo++
    }
    if(number == 5){
      this.pantaloni.pantalonePelle++
    }
    if(number == 6){
      this.pantaloni.tutaDonna++
    }
    this.pantaloni.pantaloniUtente = this.singleUser
    console.log(this.pantaloni)
  }
}
