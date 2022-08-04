import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Articolo } from 'src/app/classes/capi_classes/articolo';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
import { User } from 'src/app/classes/user';
import { CapiService } from 'src/app/services/capi-service/capi.service';
import { UserService } from 'src/app/services/user-service/user.service';

@Component({
  selector: 'app-mostra-capi',
  templateUrl: './mostra-capi.component.html',
  styleUrls: ['./mostra-capi.component.css']
})
export class MostraCapiComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private _snackBar: MatSnackBar) { }


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
  articolo: Articolo = new Articolo()
  note: string;
  pronto: boolean = false;


  ngOnInit() {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.getInfos()
  }

  changeConsegnato(element) {
    if (element.consegnato) {
      element.consegnato = false
    } else {
      element.consegnato = true
    }
  }

  changeReady(element) {
    if (element.pronto) {
      element.pronto = false
    } else {
      element.pronto = true
    }
  }

  changeNota(element ,note: string){
    element.note = note
  }

  changeServizio(element, servizio: string){
    element.servizio = servizio
  }

  changePrezzo(element: Articolo, prezzo: number){
    element.prezzo = prezzo
  }

  changeArticle(articolo: Articolo){
    this.capiService.changeArticleInfo(articolo).subscribe().add(()=>
      this._snackBar.open("Articolo modificato", "Chiudi", {
        panelClass: ['blue-snackbar']
      })._dismissAfter(4000)
    )
  }

  changeQuantity(element: Articolo, quantity: number){
    element.quantity = quantity
  }

  getInfos(){
    this.capiService.findArticoloForSingleUser(this.singleUser.username).subscribe(capi => {
      this.listArticoli = capi
    }
    )
  }

  deleteArticle(articleId: number, name: string) {
    this.capiService.getArticleById(articleId).subscribe(article => {
      this.articleGeyById = article
      for (const property in this.articleGeyById) {
        if (property == name) {
          this.articleGeyById[property]--
        }
      }
    }).add(() =>{
      this.capiService.deleteArticleFromUser(this.articleGeyById).subscribe().add(() =>{
        //Una volta finita la subscribe, rimuovo dal dix l'elemento con l'indice idDix
        this.listArticoli.splice(0,this.listArticoli.length)
        this.getInfos()
        this._snackBar.open("Articolo eliminato", "Chiudi", {
          panelClass: ['blue-snackbar']
        })._dismissAfter(4000)
      })
      }
    )
  }
}