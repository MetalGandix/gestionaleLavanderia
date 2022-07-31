import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Articolo } from 'src/app/classes/capi_classes/articolo';
import { ComplexCapiObject } from 'src/app/classes/capi_classes/complex-capi-object';
import { Categoria } from 'src/app/classes/categoria';
import { SottoCategoria } from 'src/app/classes/sotto-categoria';
import { User } from 'src/app/classes/user';
import { CapiService } from 'src/app/services/capi.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-consegna-capi',
  templateUrl: './consegna-capi.component.html',
  styleUrls: ['./consegna-capi.component.css']
})
export class ConsegnaCapiComponent implements OnInit {

  constructor(private serviceUser: UserService, private capiService: CapiService, private router: Router, private _snackBar: MatSnackBar) { }

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
  stringNamesArray: any[] = []
  categories: Categoria[] = []
  selectedCategory: number = 1;
  subCategories: {[key: number]: SottoCategoria[]} = {}
  pageIndex = 0;
  pageSize = 0;
  selectedSubCategories: {[key: number]: number} = {}
  subCategoryArray: SottoCategoria[] = []
  subCategory: SottoCategoria = new SottoCategoria()
  numArray: any[] = []
  dixStringsLateral: {[key: number]: number} = {}
  contatoreDizionarioStringhe: number = 0;
  idDizionario: number = 0;
  selectedSubCategoriesList: {[key: string]: number} = {}
  dixSubCategoryLenght :any;
  disabledButton: boolean = false;


  ngOnInit() {
    if (window.history.state.singleUser == undefined || window.history.state.singleUser == null) {
      this.router.navigate(["/find-user"])
    }
    this.singleUser = window.history.state.singleUser
    this.capiOfUser = window.history.state.capiOfUser
    this.onPageChange({ pageIndex: 0, pageSize: 15 })
    this.capiService.getLastNLavorazione().subscribe(lastLavorationNumber => {
      this.capiToAdd.nLavorazione = lastLavorationNumber + 1
      this.numLavorazione = lastLavorationNumber + 1
    })
    this.capiService.getAllsubCat().subscribe(allSubCat => {
      this.subCategoryArray = allSubCat
    })
    this.capiService.getCategories().subscribe(listCat => {
      this.categories = listCat
      for(const category of this.categories){
        this.subCategories[category.id] = category.sottocategorie
      }
    })
    this.propertyStringArray.length = 6
  }

  onPageChange($event) {
    this.pageSize = $event.pageSize
    this.pageIndex = $event.pageIndex
  }

  selectSubCategory(sottoCategoria: SottoCategoria){
    if(!this.selectedSubCategories[sottoCategoria.id]){
      this.selectedSubCategories[sottoCategoria.id] = 0
    }
    this.selectedSubCategories[sottoCategoria.id]++
    if(!this.selectedSubCategoriesList[sottoCategoria.descrizione]){
      this.selectedSubCategoriesList[sottoCategoria.descrizione] = 0
    }
    this.selectedSubCategoriesList[sottoCategoria.descrizione]++
    this.dixSubCategoryLenght = Object.values(this.selectedSubCategoriesList).reduce((a, b) => a + b, 0)
  }

  selectCategory(id) {
   this.selectedCategory = id
   this.pageIndex = 0
   this.showSubCategory(id)
  }

  showSubCategory(id: number){
    this.propertyStringArray = this.subCategories[id]
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
    this.disabledButton = true
  }

  selectFromList(number) {
    this.choiceMenuList = number
  }

  insertIntoUser() {
    for(let key in this.selectedSubCategories){
      this.numArray.push({
        id: parseInt(key, 10)-1,
        valore: this.selectedSubCategories[key]
      })
    }
    this.numArray.forEach(elem => {
      let articolo = new Articolo()
      articolo.sottocategoria = this.subCategoryArray[elem.id]
      articolo.quantity = elem.valore
      this.arrayArticoli.push(articolo)
    })
    this.arrayArticoli.forEach(singleArticle => {
      if (singleArticle != null) {
        this.articolo = singleArticle
      }
      this.capiToAdd.user = this.singleUser
      this.capiToAdd.articolo = singleArticle
      this.capiService.insertDressForUser(this.capiToAdd).subscribe().add(() => {
        this._snackBar.open("Panni inseriti correttamente", "Chiudi", {
          panelClass: ['blue-snackbar']
        })._dismissAfter(4000), this.arrayArticoli.splice(0, this.arrayArticoli.length)
      })
    })
    this.selectedSubCategories = {}
    this.numArray = []
  }

}