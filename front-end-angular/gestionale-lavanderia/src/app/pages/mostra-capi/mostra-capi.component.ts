import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
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
  selector: 'app-mostra-capi',
  templateUrl: './mostra-capi.component.html',
  styleUrls: ['./mostra-capi.component.css']
})
export class MostraCapiComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private dressArray: DressArrayService, private _snackBar: MatSnackBar) { }

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

  ngOnInit(): void {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.capiOfUser = window.history.state.capiOfUser
    console.log(this.capiOfUser)
    console.log(this.singleUser)
    if(this.capiOfUser?.abiti){
      this.abiti = this.capiOfUser.abiti
    }
    if(this.capiOfUser?.pantaloni){
      this.pantaloni = this.capiOfUser.pantaloni
    }
  }



}
