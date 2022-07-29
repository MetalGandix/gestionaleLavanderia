import { Component, OnInit } from '@angular/core';
import { Articolo } from 'src/app/classes/capi_classes/articolo';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
import { User } from 'src/app/classes/user';
import { CapiService } from 'src/app/services/capi.service';

@Component({
  selector: 'app-get-all-capi',
  templateUrl: './get-all-capi.component.html',
  styleUrls: ['./get-all-capi.component.css']
})
export class GetAllCapiComponent implements OnInit {

  constructor(private capiService: CapiService) { }

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
    this.setDix()
  }

  changeConsegnato(element) {
    if (this.dix[element].consegnato) {
      this.dix[element].consegnato = false
    } else {
      this.dix[element].consegnato = true
    }
  }

  changeReady(element) {
    if (this.dix[element].ready) {
      this.dix[element].ready = false
    } else {
      this.dix[element].ready = true
    }
  }

  setDix(){
    this.capiService.getAllArticles().subscribe
    (capi => {
      this.listArticoli = capi
    }).add(() => {
      this.listArticoli.forEach(articolo => {
        //Qua prendo ogni articolo presente nella lista di articoli
        this.articoloUtente = articolo
        //Creo un id da assegnare al dizionario
        for (const property in this.articoloUtente) {
          //Itero in tutto l'oggetto articolo finchè non trovo valori maggiori di 0
          if (this.articoloUtente[property] != 0 && this.articoloUtente[property] != null && property != "id" && property != "servizio" && property != "date" && property != "numeroLavorazione" && property != "note" && property != "articoliUtente" && property != "prezzo") {
            const [year, month, day] = this.articoloUtente.date.split('-');
            this.dataVisualizzata = day + "/" + month + "/" + year
            this.id++
            this.nameToSplit = property.replace(/([a-z])([A-Z])/g, '$1 $2').toUpperCase();
            this.dix.push({
              idDatabase: this.articoloUtente.id,
              idArticolo: this.articoloUtente.numeroLavorazione,
              normalName: property, //Il nome da passare a changeArticle
              name: this.nameToSplit,
              value: this.articoloUtente[property],
              id: this.id,
              ready: this.articoloUtente.pronto,
              consegnato: this.articoloUtente.consegnato,
              scadenza: this.dataVisualizzata,
              note: this.articoloUtente.note,
              servizio: this.articoloUtente.servizio,
              price: this.articoloUtente.prezzo
            })
          }
        }
        console.log("Dizionario: ", this.dix)
      })
    }
    )
  }

  changeArticle(articleId: number, name: string) {
    this.capiService.getArticleById(articleId).subscribe(article => {
      this.articleGeyById = article
      for (const property in this.articleGeyById) {
        if (property == name) {
          this.articleGeyById[property]--
        }
      }
    }).add(() =>{
      this.capiService.changeArticle(this.articleGeyById).subscribe().add(() =>{
        //Una volta finita la subscribe, rimuovo dal dix l'elemento con l'indice idDix
        this.dix.splice(0,this.dix.length)
        this.setDix()
      })
      }
    )
  }

}