import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { isEmpty } from 'rxjs';
import { Articolo } from 'src/app/classes/capi_classes/articolo';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
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

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private dressArray: DressArrayService, private _snackBar: MatSnackBar) { }

  capiToAdd: ComplexCapiObject = new ComplexCapiObject()
  singleUser: User
  capiOfUser: ComplexCapiObject
  articolo: Articolo = new Articolo()
  choiceMenuList: number
  selectedItems: any[] = []
  numberClicked: number[] = []
  extractedString: string
  arrayProvvisorio: { property: string, icon: string, value: number, id: number }[]
  datePickerDate: String
  arrayArticoli: Articolo[] = []
  numLavorazione: number = 0;
  propertyStringArray: any[] = []
  propertyArray: any[] = []
  counter = 0;
  finalArray: any[] = []

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
  cappelli_array = this.dressArray.cappelli_array

  ngOnInit() {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.capiOfUser = window.history.state.capiOfUser
    this.onPageChange({ pageIndex: 0, pageSize: 12 })
    this.capiService.getLastNLavorazione().subscribe(lastLavorationNumber => {
      this.capiToAdd.nLavorazione = lastLavorationNumber + 1
      this.numLavorazione = lastLavorationNumber + 1
    })
    let id: number = 0
    for (const property in this.articolo) {
      if (property != "id" && property != "servizio" && property != "date" && property != "numeroLavorazione" && property != "note" && property != "articoliUtente" && property != "prezzo") {
        this.propertyStringArray.push({
          id: id++,
          property: property,
          value: this.articolo[property]
        })
      }
    }
    console.log(this.capiOfUser)
  }

  onPageChange($event) {
    this.arrayProvvisorio = this.propertyStringArray.slice($event.pageIndex * $event.pageSize, $event.pageIndex * $event.pageSize + $event.pageSize);
  }

  //Creo un dizionario per le property e un array per gli articoli, controllo nell'array delle property se la property esiste, in tal caso sostituisco un oggetto
  //temporaneo con i valori dell'articolo e poi scambio il value usando il dizionario delle property
  selectDress(name, id) {
    this.articolo = new Articolo()
    if (this.arrayArticoli.length == 0) {
      for (const property in this.articolo) {
        if (property == name) {
          this.articolo[property]++
          this.articolo.id = id
          this.propertyArray.push({
            id: this.articolo.id,
            property: property,
            value: this.articolo[property]
          })
          this.arrayArticoli.push(this.articolo)
        }
      }
    }else{
      let canPush: boolean = true
      for (const property in this.articolo) {
        if (property == name) {
          this.articolo[property]++
          this.articolo.id = id
          this.propertyArray.forEach(e => {
            if(e.id === this.articolo.id){
              e.value++
              canPush = false
            }
          })
          if(canPush == true){
            this.propertyArray.push({
              id: this.articolo.id,
              property: property,
              value: this.articolo[property]
            })
          this.arrayArticoli.push(this.articolo)
          }
        }
      }
    }
    let tempArticolo = new Articolo()
    tempArticolo = this.arrayArticoli[id]
    for(const property in tempArticolo){
      if(property == name)
      tempArticolo[property] = this.propertyArray[id].value
    }
    this.arrayArticoli[id] = tempArticolo
    this.finalArray = this.arrayArticoli.filter(n => n)
    // this.arrayArticoli.forEach(element => {
    //   if(element !== undefined){
    //     if(isEmpty())
    //     this.finalArray.push(element)
    //   }
    // })
    console.log(this.propertyArray)
    console.log(this.arrayArticoli)
  }

  onDateChange(value) {
    var splitted: string[] = value.toLocaleDateString().split("/", 3);
    if (splitted[1].length == 1) {
      splitted[1] = "0" + splitted[1]
    }
    if (splitted[0].length == 1) {
      splitted[0] = "0" + splitted[0]
    }
    this.datePickerDate = splitted[0] + "/" + splitted[1] + "/" + splitted[2]
    this.capiToAdd.date = this.datePickerDate
    console.log(this.datePickerDate)
  }

  selectFromList(number) {
    this.choiceMenuList = number
  }

  insertIntoUser() {
    this.arrayArticoli.forEach(singleArticle => {
      if (singleArticle != null) {
        this.capiToAdd.articolo = singleArticle
      }
      this.capiToAdd.user = this.singleUser
      this.capiService.insertDressForUser(this.capiToAdd).subscribe().add(() => {
        this._snackBar.open("Panni inseriti correttamente", "Chiudi", {
          panelClass: ['blue-snackbar']
        })._dismissAfter(4000), this.arrayArticoli.splice(0, this.arrayArticoli.length)
      })
    })
  }

}