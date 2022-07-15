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
import { DressArrayService } from 'src/app/services/arrays/dress-array.service';
import { CapiService } from 'src/app/services/capi.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-consegna-capi',
  templateUrl: './consegna-capi.component.html',
  styleUrls: ['./consegna-capi.component.css']
})
export class ConsegnaCapiComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private dressArray: DressArrayService) { }

  capiToAdd: ComplexCapiObject = new ComplexCapiObject()
  singleUser: User
  capiOfUser: ComplexCapiObject
  abiti: Abiti = new Abiti()
  camicie: Camicie = new Camicie()
  cappelli: Cappelli = new Cappelli()
  giaccheEGiacconi: GiaccheEGiacconi = new GiaccheEGiacconi()
  gonne: Gonne = new Gonne()
  maglie: Maglie = new Maglie()
  pantaloni: Pantaloni = new Pantaloni()
  pigiamaEVestaglie: PigiamaEVestaglie = new PigiamaEVestaglie()
  scarpe: Scarpe = new Scarpe()
  tappeti: Tappeti = new Tappeti()
  tende: Tende = new Tende()
  trapunteEPiumoni: TrapunteEPiumoni = new TrapunteEPiumoni()
  varie: Varie = new Varie()
  choiceMenuList: number
  selectedItems: string[] = []

  //Array taken from service "dress-array"
  principal_array = this.dressArray.dress_array
  pantaloni_array = this.dressArray.pantaloni_array
  maglie_array = this.dressArray.maglie_array
  varie_array = this.dressArray.varie_array
  pigiami_array = this.dressArray.pigiami_array
  scarpe_array = this.dressArray.scarpe_array
  tappeti_array = this.dressArray.tappeti_array
  tende_array = this.dressArray.tende_array
  trapunteEPiumoni_array = this.dressArray.trapunteEPiumoni_array
  giaccheEGiaccone_array = this.dressArray.giaccheEGiacconi_array
  gonne_array = this.dressArray.gonne_array
  camicie_array = this.dressArray.camicie_array
  abiti_array = this.dressArray.abiti_array

  ngOnInit() {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.capiOfUser = window.history.state.capiOfUser
    console.log(this.capiOfUser)
  }

  insertIntoUser() {
    if (this.abiti != null) {
      this.capiToAdd.abiti = this.abiti
    }
    if (this.camicie != null) {
      this.capiToAdd.camicie = this.camicie
    }
    if (this.cappelli != null) {
      this.capiToAdd.cappelli = this.cappelli
    }
    if (this.giaccheEGiacconi != null) {
      this.capiToAdd.giaccheEGiacconi = this.giaccheEGiacconi
    }
    if (this.gonne != null) {
      this.capiToAdd.gonne = this.gonne
    }
    if (this.maglie != null) {
      this.capiToAdd.maglie = this.maglie
    }
    if (this.pantaloni != null) {
      this.capiToAdd.pantaloni = this.pantaloni
    }
    if (this.pigiamaEVestaglie != null) {
      this.capiToAdd.pigiamaEVestaglie = this.pigiamaEVestaglie
    }
    if (this.scarpe != null) {
      this.capiToAdd.scarpe = this.scarpe
    }
    if (this.tappeti != null) {
      this.capiToAdd.tappeti = this.tappeti
    }
    if (this.tende != null) {
      this.capiToAdd.tende = this.tende
    }
    if (this.trapunteEPiumoni != null) {
      this.capiToAdd.trapunteEPiumoni = this.trapunteEPiumoni
    }
    if (this.varie != null) {
      this.capiToAdd.varie = this.varie
    }
    this.capiService.insertDressForUser(this.capiToAdd).subscribe()
  }

  insertPantaloni(number, name) {
    if (number == 1) {
      this.pantaloni.pantaloneDivisa++
    }
    if (number == 2) {
      this.pantaloni.pantaloneDonna++
    }
    if (number == 3) {
      this.pantaloni.pantaloneSoloStiro++
    }
    if (number == 4) {
      this.pantaloni.pantaloneUomo++
    }
    if (number == 5) {
      this.pantaloni.pantalonePelle++
    }
    if (number == 6) {
      this.pantaloni.tutaDonna++
    }
    this.pantaloni.pantaloniUtente = this.singleUser
    console.log(this.pantaloni)
  }

  insertMaglie(number, name) {
    if (number == 1) {
      this.maglie.babyDol++
    }
    if (number == 2) {
      this.maglie.cardigan++
    }
    if (number == 3) {
      this.maglie.felpa++
    }
    if (number == 4) {
      this.maglie.magliaBimbo++
    }
    if (number == 5) {
      this.maglie.magliaDonna++
    }
    if (number == 6) {
      this.maglie.magliaUomo++
    }
    if (number == 7) {
      this.maglie.maglioneCotone++
    }
    if (number == 8) {
      this.maglie.maglioneLana++
    }
    if (number == 9) {
      this.maglie.tShirt++
    }
    if (number == 10) {
      this.maglie.tShirtColorata++
    }
    this.maglie.magliaUtente = this.singleUser
    if(!this.selectedItems.includes(name)){
    this.selectedItems.push(name)
    }
    console.log(this.maglie)
  }

  selectFromList(number) {
    this.choiceMenuList = number
  }
}
