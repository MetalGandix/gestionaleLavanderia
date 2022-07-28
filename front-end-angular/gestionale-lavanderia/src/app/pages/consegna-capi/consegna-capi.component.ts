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
  arrayProvvisorio: { name: string, icon: string, value: number }[]
  datePickerDate: String
  arrayArticoli: Articolo[] = []

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
    console.log(this.capiOfUser)
  }

  onPageChange($event) {
    this.arrayProvvisorio = this.varie_array.slice($event.pageIndex * $event.pageSize, $event.pageIndex * $event.pageSize + $event.pageSize);
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
    console.log(this.datePickerDate)
  }

  selectFromList(number) {
    this.choiceMenuList = number
  }

  insertGiaccheEGiacconi(number: number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.cappottoBimbo++
        break;
      case 2:
        this.articolo.cappottoDonna++
        break;
      case 3:
        this.articolo.cappottoUnisex++
        break;
      case 4:
        this.articolo.cappottoUomo++
        break;
      case 5:
        this.articolo.giaccaDonna++
        break;
      case 6:
        this.articolo.giaccaUomo++
        break;
      case 7:
        this.articolo.giacconeCortoDonna++
        break;
      case 8:
        this.articolo.giacconeCortoUomo++
        break;
      case 9:
        this.articolo.giacconeCotone++
        break;
      case 10:
        this.articolo.giacconeLungoDonna++
        break;
      case 11:
        this.articolo.giacconeLungoUomo++
        break;
      case 12:
        this.articolo.giacconeUnisex++
        break;
      case 13:
        this.articolo.giubbetto++
        break;
      case 14:
        this.articolo.giubbettoJeans++
        break;
      case 15:
        this.articolo.giubbinoEstivoUnisex++
        break;
      case 16:
        this.articolo.impermeabileUnisex++
        break;
      case 17:
        this.articolo.internoGiaccone++
        break;
      case 18:
        this.articolo.montone++
        break;
      case 19:
        this.articolo.pellicciaSintetica++
        break;
      case 20:
        this.articolo.piumino7_8Donna++
        break;
      case 21:
        this.articolo.piumino7_8Uomo++
        break;
      case 22:
        this.articolo.piuminoCortoDonna++
        break;
      case 23:
        this.articolo.piuminoCortoUomo++
        break;
      case 24:
        this.articolo.piuminoLungoDonna++
        break;
      case 25:
        this.articolo.piuminoLungoUomo++
        break;
      case 26:
        this.articolo.soprabito++
        break;
      case 27:
        this.articolo.tranch++
        break;
      case 28:
        this.articolo.woolrich++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
    console.log(this.selectedItems)
  }

  insertVarie(number: number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.accappatoi++
        break;
      case 2:
        this.articolo.accessori++
        break;
      case 3:
        this.articolo.bambolaStoffa++
        break;
      case 4:
        this.articolo.borsa++
        break;
      case 5:
        this.articolo.calzini++
        break;
      case 6:
        this.articolo.canottaUnisex++
        break;
      case 7:
        this.articolo.capoConRiporti++
        break;
      case 8:
        this.articolo.cinturaDiPelle++
        break;
      case 9:
        this.articolo.cinturaDiStoffa++
        break;
      case 10:
        this.articolo.copriDivano++
        break;
      case 11:
        this.articolo.copriPoltrona++
        break;
      case 12:
        this.articolo.copriSedia++
        break;
      case 13:
        this.articolo.doppioPetto++
        break;
      case 14:
        this.articolo.foulard++
        break;
      case 15:
        this.articolo.giccaPelle++
        break;
      case 16:
        this.articolo.giletConTasche++
        break;
      case 17:
        this.articolo.giletDiPelle++
        break;
      case 18:
        this.articolo.guantiLana++
        break;
      case 19:
        this.articolo.guantiPelle++
        break;
      case 20:
        this.articolo.guantiUomo++
        break;
      case 21:
        this.articolo.pigiamaBimbo++
        break;
      case 22:
        this.articolo.scarponcino++
        break;
      case 23:
        this.articolo.sciarpa++
        break;
      case 24:
        this.articolo.sciarpaBambino++
        break;
      case 25:
        this.articolo.sciarpaDiCotone++
        break;
      case 26:
        this.articolo.sciarpaDiSeta++
        break;
      case 27:
        this.articolo.tovagliaRettangolare++
        break;
      case 28:
        this.articolo.tovagliaRotonda++
        break;
      case 29:
        this.articolo.tutaSciBimbo++
        break;
      case 30:
        this.articolo.tutaSciAdulto++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertPantaloni(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.pantaloneDivisa++
        break;
      case 2:
        this.articolo.pantaloneDonna++
        break;
      case 3:
        this.articolo.pantaloneSoloStiro++
        break;
      case 4:
        this.articolo.pantaloneUomo++
        break;
      case 5:
        this.articolo.pantalonePelle++
        break;
      case 6:
        this.articolo.tutaDonna++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertPigiami(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.vestaglia++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertGonne(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.gonna++
        break
      case 2:
        this.articolo.gonnaJeans++
        break;
      case 3:
        this.articolo.gonnaPelle++
        break;
      case 4:
        this.articolo.gonnaPieghe++
        break;
    }
    if (!this.numberClicked.includes(number)) {
      this.numberClicked.push(number)
    } else {
    }
    console.log(this.numberClicked)
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertCappelli(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.berretto++
        break
      case 2:
        this.articolo.cappello++
        break;
      case 3:
        this.articolo.cappelloPelle++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertTappeti(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.tappeto++
        break
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertTende(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.calateTenda++
        break
      case 2:
        this.articolo.mantovana++
        break
      case 3:
        this.articolo.tendaCampeggio++
        break
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertScarpe(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.ciabatte++
        break
      case 2:
        this.articolo.clark++
        break;
      case 3:
        this.articolo.converse++
        break;
      case 4:
        this.articolo.hogan++
        break;
      case 5:
        this.articolo.nike++
        break;
      case 6:
        this.articolo.scarpeDaGinnastica++
        break;
      case 7:
        this.articolo.scarponcini++
        break;
      case 8:
        this.articolo.timberland++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertCamicie(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.camiciaBimbo++
        break
      case 2:
        this.articolo.camiciaCerimonia++
        break;
      case 3:
        this.articolo.camiciaDonna++
        break;
      case 4:
        this.articolo.camiciaJeans++
        break;
      case 5:
        this.articolo.camiciaPelle++
        break;
      case 6:
        this.articolo.camiciaPiegata++
        break;
      case 7:
        this.articolo.camiciaSetaDonna++
        break;
      case 8:
        this.articolo.camiciaSetaUomo++
        break;
      case 9:
        this.articolo.camiciaSoloStiro++
        break;
      case 10:
        this.articolo.camiciaUomo++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertTrapunteEPiumoni(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.coperta1PiazzaLana++
        break
      case 2:
        this.articolo.coperta2PiazzeLana++
        break;
      case 3:
        this.articolo.copertaBambino++
        break;
      case 4:
        this.articolo.copertaUncinetto++
        break;
      case 5:
        this.articolo.coprimaterasso++
        break;
      case 6:
        this.articolo.cuscinoPiuma++
        break;
      case 7:
        this.articolo.cuscinoSintetico++
        break;
      case 8:
        this.articolo.federe++
        break;
      case 9:
        this.articolo.lenzuola1Piazza++
        break;
      case 10:
        this.articolo.leunzuolo2Piazze++
        break;
      case 11:
        this.articolo.merinos2Piazze++
        break;
      case 12:
        this.articolo.piumone1PiazzaOca++
        break;
      case 13:
        this.articolo.piumone1PSintetico++
        break;
      case 14:
        this.articolo.piumone2PiazzeOca++
        break;
      case 15:
        this.articolo.piumone2PSintetico++
        break;
      case 16:
        this.articolo.saccoAPelo1Piazza++
        break;
      case 17:
        this.articolo.saccoAPelo2Piazze++
        break;
      case 18:
        this.articolo.trapunta1Piazza++
        break;
      case 19:
        this.articolo.trapunta2Piazze++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertAbiti(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.abitoDonna
        break
      case 2:
        this.articolo.abitoDonna++
        break;
      case 3:
        this.articolo.abitoLungo++
        break;
      case 4:
        this.articolo.abitoPizzo++
        break;
      case 5:
        this.articolo.abitoSposa++
        break;
      case 6:
        this.articolo.abitoUomo++
        break;
      case 7:
        this.articolo.cravatta++
        break;
      case 8:
        this.articolo.divisaPoliziaLocale++
        break;
      case 9:
        this.articolo.divisaCarabiniere++
        break;
      case 10:
        this.articolo.divisaFinanza++
        break;
      case 11:
        this.articolo.divisaPolizia++
        break;
      case 12:
        this.articolo.giletUomo++
        break;
      case 13:
        this.articolo.tailleurGonna++
        break;
      case 14:
        this.articolo.tailleurPantaloni++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertMaglie(number, name) {
    this.articolo = new Articolo()
    switch (number) {
      case 1:
        this.articolo.babyDol++
        break
      case 2:
        this.articolo.cardigan++
        break;
      case 3:
        this.articolo.felpa++
        break;
      case 4:
        this.articolo.magliaBimbo++
        break;
      case 5:
        this.articolo.magliaDonna++
        break;
      case 6:
        this.articolo.magliaUomo++
        break;
      case 7:
        this.articolo.maglioneCotone++
        break;
      case 8:
        this.articolo.maglioneLana++
        break;
      case 9:
        this.articolo.tShirt++
        break;
      case 10:
        this.articolo.tShirtColorata++
        break;
    }
    this.selectedItems.push(name)
    this.arrayArticoli.push(this.articolo);
    console.log(this.arrayArticoli)
  }

  insertIntoUser() {
    this.capiService.getLastNLavorazione().subscribe(lastLavorationNumber => {
      this.capiToAdd.nLavorazione = lastLavorationNumber
    }).add(() => {
    this.arrayArticoli.forEach(singleArticle => {
      if (singleArticle != null) {
        this.capiToAdd.articolo = singleArticle
      }
      this.capiToAdd.date = this.datePickerDate
      this.capiToAdd.user = this.singleUser
        this.capiService.insertDressForUser(this.capiToAdd).subscribe().add(() => {
          this._snackBar.open("Panni inseriti correttamente", "Chiudi", {
            panelClass: ['blue-snackbar']
          })._dismissAfter(4000), this.arrayArticoli.splice(0, this.arrayArticoli.length)
        })
      })
    })
  }

}