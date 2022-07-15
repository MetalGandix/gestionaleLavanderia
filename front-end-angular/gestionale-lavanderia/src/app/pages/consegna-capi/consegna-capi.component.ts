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
  numberClicked: number[] = []
  extractedString: string

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
    console.log(this.capiOfUser)
  }

  selectFromList(number) {
    this.choiceMenuList = number
  }

  insertGiaccheEGiacconi(number: number, name) {
    switch (number) {
      case 1:
        this.giaccheEGiacconi.cappottoBimbo++
        break;
      case 2:
        this.giaccheEGiacconi.cappottoDonna++
        break;
      case 3:
        this.giaccheEGiacconi.cappottoUnisex++
        break;
      case 4:
        this.giaccheEGiacconi.cappottoUomo++
        break;
      case 5:
        this.giaccheEGiacconi.giaccaDonna++
        break;
      case 6:
        this.giaccheEGiacconi.giaccaUomo++
        break;
      case 7:
        this.giaccheEGiacconi.giacconeCortoDonna++
        break;
      case 8:
        this.giaccheEGiacconi.giacconeCortoUomo++
        break;
      case 9:
        this.giaccheEGiacconi.giacconeCotone++
        break;
      case 10:
        this.giaccheEGiacconi.giacconeLungoDonna++
        break;
      case 11:
        this.giaccheEGiacconi.giacconeLungoUomo++
        break;
      case 12:
        this.giaccheEGiacconi.giacconeUnisex++
        break;
      case 13:
        this.giaccheEGiacconi.giubbetto++
        break;
      case 14:
        this.giaccheEGiacconi.giubbettoJeans++
        break;
      case 15:
        this.giaccheEGiacconi.giubbinoEstivoUnisex++
        break;
      case 16:
        this.giaccheEGiacconi.impermeabileUnisex++
        break;
      case 17:
        this.giaccheEGiacconi.internoGiaccone++
        break;
      case 18:
        this.giaccheEGiacconi.montone++
        break;
      case 19:
        this.giaccheEGiacconi.pellicciaSintetica++
        break;
      case 20:
        this.giaccheEGiacconi.piumino7_8Donna++
        break;
      case 21:
        this.giaccheEGiacconi.piumino7_8Uomo++
        break;
      case 22:
        this.giaccheEGiacconi.piuminoCortoDonna++
        break;
      case 23:
        this.giaccheEGiacconi.piuminoCortoUomo++
        break;
      case 24:
        this.giaccheEGiacconi.piuminoLungoDonna++
        break;
      case 25:
        this.giaccheEGiacconi.piuminoLungoUomo++
        break;
      case 26:
        this.giaccheEGiacconi.soprabito++
        break;
      case 27:
        this.giaccheEGiacconi.tranch++
        break;
      case 28:
        this.giaccheEGiacconi.woolrich++
        break;
    }
    this.giaccheEGiacconi.giaccheEGiacconiUtente = this.singleUser
    this.selectedItems.push(name)
    console.log(this.selectedItems)
  }

  insertVarie(number: number, name) {
    switch (number) {
      case 1:
        this.varie.accappatoi++
        break;
      case 2:
        this.varie.accessori++
        break;
      case 3:
        this.varie.bambolaStoffa++
        break;
      case 4:
        this.varie.borsa++
        break;
      case 5:
        this.varie.calzini++
        break;
      case 6:
        this.varie.canottaUnisex++
        break;
      case 7:
        this.varie.capoConRiporti++
        break;
      case 8:
        this.varie.cinturaDiPelle++
        break;
      case 9:
        this.varie.cinturaDiStoffa++
        break;
      case 10:
        this.varie.copriDivano++
        break;
      case 11:
        this.varie.copriPoltrona++
        break;
      case 12:
        this.varie.copriSedia++
        break;
      case 13:
        this.varie.doppioPetto++
        break;
      case 14:
        this.varie.foulard++
        break;
      case 15:
        this.varie.giccaPelle++
        break;
      case 16:
        this.varie.giletConTasche++
        break;
      case 17:
        this.varie.giletDiPelle++
        break;
      case 18:
        this.varie.guantiLana++
        break;
      case 19:
        this.varie.guantiPelle++
        break;
      case 20:
        this.varie.guantiUomo++
        break;
      case 21:
        this.varie.pigiamaBimbo++
        break;
      case 22:
        this.varie.scarponcino++
        break;
      case 23:
        this.varie.sciarpa++
        break;
      case 24:
        this.varie.sciarpaBambino++
        break;
      case 25:
        this.varie.sciarpaDiCotone++
        break;
      case 26:
        this.varie.sciarpaDiSeta++
        break;
      case 27:
        this.varie.tovagliaRettangolare++
        break;
      case 28:
        this.varie.tovagliaRotonda++
        break;
      case 29:
        this.varie.tutaSciBimbo++
        break;
      case 30:
        this.varie.tutaSciAdulto++
        break;
    }
    this.varie.varieUtente = this.singleUser
    this.selectedItems.push(name)
  }

  insertPantaloni(number, name) {
    switch (number) {
      case 1:
        this.pantaloni.pantaloneDivisa++
        break;
      case 2:
        this.pantaloni.pantaloneDonna++
        break;
      case 3:
        this.pantaloni.pantaloneSoloStiro++
        break;
      case 4:
        this.pantaloni.pantaloneUomo++
        break;
      case 5:
        this.pantaloni.pantalonePelle++
        break;
      case 6:
        this.pantaloni.tutaDonna++
        break;
    }
    this.pantaloni.pantaloniUtente = this.singleUser
    this.selectedItems.push(name)
  }

  insertPigiami(number, name) {
    switch (number) {
      case 1:
        this.pigiamaEVestaglie.vestaglia++
        break;
    }
    this.pigiamaEVestaglie.vestagliaUtente = this.singleUser
    this.selectedItems.push(name)
  }

  insertGonne(number, name) {
    switch (number) {
      case 1:
        this.gonne.gonna++
        break
      case 2:
        this.gonne.gonnaJeans++
        break;
      case 3:
        this.gonne.gonnaPelle++
        break;
      case 4:
        this.gonne.gonnaPieghe++
        break;
    }
    this.gonne.gonnaUtente = this.singleUser
    if (!this.numberClicked.includes(number)) {
      this.numberClicked.push(number)
    } else {
    }
    console.log(this.numberClicked)
    this.selectedItems.push(name)
  }

  insertCappelli(number, name) {
    switch (number) {
      case 1:
        this.cappelli.berretto++
        break
      case 2:
        this.cappelli.cappello++
        break;
      case 3:
        this.cappelli.cappelloPelle++
        break;
    }
    this.cappelli.cappelloUtente = this.singleUser
    this.selectedItems.push(name)
  }

  insertTappeti(number, name) {
    switch (number) {
      case 1:
        this.tappeti.tappeto++
        break
    }
    this.tappeti.tappetoUtente = this.singleUser
    this.selectedItems.push(name)
  }

  insertTende(number, name) {
    switch (number) {
      case 1:
        this.tende.calateTenda++
        break
      case 2:
        this.tende.mantovana++
        break
      case 3:
        this.tende.tendaCampeggio++
        break
    }
    this.tende.tendeUtente = this.singleUser
    this.selectedItems.push(name)
  }

  insertScarpe(number, name) {
    switch (number) {
      case 1:
        this.scarpe.ciabatte++
        break
      case 2:
        this.scarpe.clark++
        break;
      case 3:
        this.scarpe.converse++
        break;
      case 4:
        this.scarpe.hogan++
        break;
      case 5:
        this.scarpe.nike++
        break;
      case 6:
        this.scarpe.scarpeDaGinnastica++
        break;
      case 7:
        this.scarpe.scarponcini++
        break;
      case 8:
        this.scarpe.timberland++
        break;
    }
    this.scarpe.scarpeUtente = this.singleUser
    this.selectedItems.push(name)
    console.log(this.maglie)
  }

  insertCamicie(number, name) {
    switch (number) {
      case 1:
        this.camicie.camiciaBimbo++
        break
      case 2:
        this.camicie.camiciaCerimonia++
        break;
      case 3:
        this.camicie.camiciaDonna++
        break;
      case 4:
        this.camicie.camiciaJeans++
        break;
      case 5:
        this.camicie.camiciaPelle++
        break;
      case 6:
        this.camicie.camiciaPiegata++
        break;
      case 7:
        this.camicie.camiciaSetaDonna++
        break;
      case 8:
        this.camicie.camiciaSetaUomo++
        break;
      case 9:
        this.camicie.camiciaSoloStiro++
        break;
      case 10:
        this.camicie.camiciaUomo++
        break;
    }
    this.camicie.camiciaUtente = this.singleUser
    this.selectedItems.push(name)
    console.log(this.maglie)
  }

  insertTrapunteEPiumoni(number, name) {
    switch (number) {
      case 1:
        this.trapunteEPiumoni.coperta1PiazzaLana++
        break
      case 2:
        this.trapunteEPiumoni.coperta2PiazzeLana++
        break;
      case 3:
        this.trapunteEPiumoni.copertaBambino++
        break;
      case 4:
        this.trapunteEPiumoni.copertaUncinetto++
        break;
      case 5:
        this.trapunteEPiumoni.coprimaterasso++
        break;
      case 6:
        this.trapunteEPiumoni.cuscinoPiuma++
        break;
      case 7:
        this.trapunteEPiumoni.cuscinoSintetico++
        break;
      case 8:
        this.trapunteEPiumoni.federe++
        break;
      case 9:
        this.trapunteEPiumoni.lenzuola1Piazza++
        break;
      case 10:
        this.trapunteEPiumoni.leunzuolo2Piazze++
        break;
      case 11:
        this.trapunteEPiumoni.merinos2Piazze++
        break;
      case 12:
        this.trapunteEPiumoni.piumone1PiazzaOca++
        break;
      case 13:
        this.trapunteEPiumoni.piumone1PSintetico++
        break;
      case 14:
        this.trapunteEPiumoni.piumone2PiazzeOca++
        break;
      case 15:
        this.trapunteEPiumoni.piumone2PSintetico++
        break;
      case 16:
        this.trapunteEPiumoni.saccoAPelo1Piazza++
        break;
      case 17:
        this.trapunteEPiumoni.saccoAPelo2Piazze++
        break;
      case 18:
        this.trapunteEPiumoni.trapunta1Piazza++
        break;
      case 19:
        this.trapunteEPiumoni.trapunta2Piazze++
        break;
    }
    this.trapunteEPiumoni.trapunteEPiumoniUtente = this.singleUser
    this.selectedItems.push(name)
    console.log(this.maglie)
  }

  insertAbiti(number, name) {
    switch (number) {
      case 1:
        this.abiti.abitoDonna
        break
      case 2:
        this.abiti.abitoDonna++
        break;
      case 3:
        this.abiti.abitoLungo++
        break;
      case 4:
        this.abiti.abitoPizzo++
        break;
      case 5:
        this.abiti.abitoSposa++
        break;
      case 6:
        this.abiti.abitoUomo++
        break;
      case 7:
        this.abiti.cravatta++
        break;
      case 8:
        this.abiti.divisaPoliziaLocale++
        break;
      case 9:
        this.abiti.divisaCarabiniere++
        break;
      case 10:
        this.abiti.divisaFinanza++
        break;
      case 11:
        this.abiti.divisaPolizia++
        break;
      case 12:
        this.abiti.giletUomo++
        break;
      case 13:
        this.abiti.tailleurGonna++
        break;
      case 14:
        this.abiti.tailleurPantaloni++
        break;
    }
    this.abiti.abitiUtente = this.singleUser
    this.selectedItems.push(name)
    console.log(this.maglie)
  }

  insertMaglie(number, name) {
    switch (number) {
      case 1:
        this.maglie.babyDol++
        break
      case 2:
        this.maglie.cardigan++
        break;
      case 3:
        this.maglie.felpa++
        break;
      case 4:
        this.maglie.magliaBimbo++
        break;
      case 5:
        this.maglie.magliaDonna++
        break;
      case 6:
        this.maglie.magliaUomo++
        break;
      case 7:
        this.maglie.maglioneCotone++
        break;
      case 8:
        this.maglie.maglioneLana++
        break;
      case 9:
        this.maglie.tShirt++
        break;
      case 10:
        this.maglie.tShirtColorata++
        break;
    }
    this.maglie.magliaUtente = this.singleUser
    this.selectedItems.push(name)
    console.log(this.maglie)
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


}
