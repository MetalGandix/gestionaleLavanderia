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


  articleGeyById: Articolo = new Articolo()
  singleUser: User
  capiOfUser: ComplexCapiObject
  articoloUtente: Articolo = new Articolo()
  arrayValuesName: string[] = []
  dix: any = []
  arrayValuesNumber: number[] = []
  dataConsegna: Date
  dataVisualizzata: string
  listArticoli: Articolo[] = []
  nameToSplit: any //Il nome maiuscolo
  id: number = -1 //Questo id è l'id di ogni elemento nel dix


  ngOnInit() {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.setDix()
  }

  changeConsegnato(element) {
    if (this.dix[element].consegnato) {
      this.dix[element].consegnato = false
    } else {
      this.dix[element].consegnato = true
    }
    console.log(this.dix[element].consegnato)
  }

  changeReady(element) {
    if (this.dix[element].ready) {
      this.dix[element].ready = false
    } else {
      this.dix[element].ready = true
    }
  }

  setDix(){
    this.capiService.findArticoloForSingleUser(this.singleUser.username).subscribe(capi => {
      this.listArticoli = capi
      console.log(this.listArticoli)
    }).add(() => {
      this.listArticoli.forEach(articolo => {
        //Qua prendo ogni articolo presente nella lista di articoli
        this.articoloUtente = articolo
        //Creo un id da assegnare al dizionario
        for (const property in this.articoloUtente) {
          //Itero in tutto l'oggetto articolo finchè non trovo valori maggiori di 0
          if (this.articoloUtente[property] != 0 && this.articoloUtente[property] != null && this.articoloUtente[property] < 1000) {
            const [year, month, day] = this.articoloUtente.date.split('-');
            this.dataVisualizzata = day + "/" + month + "/" + year
            this.id++
            console.log("Name: " + property, "Number: " + this.articoloUtente[property])
            this.nameToSplit = property.replace(/([a-z])([A-Z])/g, '$1 $2').toUpperCase();
            this.dix.push({
              idArticolo: this.articoloUtente.id,
              normalName: property, //Il nome da passare a changeArticle
              name: this.nameToSplit,
              value: this.articoloUtente[property],
              id: this.id,
              ready: false,
              consegnato: false,
              scadenza: this.dataVisualizzata
            })
          }
        }
        console.log("Dizionario: ", this.dix)
      })
    }
    )
  }

  changeArticle(articleId: number, name: string, idDix: number) {
    this.capiService.getArticleByIf(articleId).subscribe(article => {
      this.articleGeyById = article
      for (const property in this.articleGeyById) {
        if (property == name) {
          this.articleGeyById[property]--
          console.log(this.articleGeyById[property])
        }
      }
    }).add(() =>{
      this.capiService.changeArticle(this.articleGeyById).subscribe().add(() =>{
        //Una volta finita la subscribe, rimuovo dal dix l'elemento con l'indice idDix
        this.dix.splice(idDix)
      })
      }
    )
  }
}