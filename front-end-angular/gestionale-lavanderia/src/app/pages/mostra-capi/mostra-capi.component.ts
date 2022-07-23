import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Articolo } from 'src/app/classes/capi_classes/articolo';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
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
  articoloUtente: Articolo = new Articolo()
  arrayValuesName: string[] = []
  dix: any = []
  arrayValuesNumber: number[] = []
  dataConsegna: Date
  dataVisualizzata: string
  

  ngOnInit() {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.capiService.findArticoloForSingleUser(this.singleUser.username).subscribe(capi => {
      this.articoloUtente = capi
      console.log(this.articoloUtente)
    }).add(() => {
      let id = -1
      for (const property in this.articoloUtente) {
        if (this.articoloUtente[property] != 0 && this.articoloUtente[property] != null && this.articoloUtente[property] < 1000) {
          id++
          console.log("Name: " + property, "Number: " + this.articoloUtente[property])
          this.dix.push({
            name: property,
            value: this.articoloUtente[property],
            id: id,
            ready: false,
            consegnato: false
          })
          console.log(this.dix)
        }
      }
      const [year, month, day] = this.articoloUtente.date.split('-');
      this.dataVisualizzata = day + "/" + month + "/" + year
      //Qua per poter fare la scadenza con il boolean rosso o verde
      const date = new Date(+year, +month - 1, +day);
      this.dataConsegna = date
    }
    )
  }

  changeConsegnato(element){
    if(this.dix[element].consegnato){
      this.dix[element].consegnato = false
    }else{
      this.dix[element].consegnato = true
    }
    console.log(this.dix[element].consegnato)
  }

  changeReady(element){
    if(this.dix[element].ready){
      this.dix[element].ready = false
    }else{
      this.dix[element].ready = true
    }
  }
}