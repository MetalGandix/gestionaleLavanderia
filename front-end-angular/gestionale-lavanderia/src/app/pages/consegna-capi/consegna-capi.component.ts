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
  finalArray: any[] = []
  categories: Categoria[] = []
  selectedCategory: number = 1;
  subCategories: {[key: number]: SottoCategoria[]} = {}
  pageIndex = 0;
  pageSize = 0;
  selectedSubCategories: {[key: number]: number} = {}

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
    this.capiService.getCategories().subscribe(listCat => {
      this.categories = listCat
      for(const category of this.categories){
        this.subCategories[category.id] = category.sottocategorie
      }
      console.log(this.subCategories)
    })
    console.log(this.capiOfUser)
  }

  onPageChange($event) {
    this.pageSize = $event.pageSize
    this.pageIndex = $event.pageIndex
  }

  selectSubCategory(id){
    if(!this.selectedSubCategories[id]){
      this.selectedSubCategories[id] = 0
    }
    this.selectedSubCategories[id]++
    console.log(this.selectedSubCategories)
    for(let key in this.selectedSubCategories){
      console.log(key,":", this.selectedSubCategories[key])
    }
  }

  selectCategory(id) {
   this.selectedCategory = id
   this.pageIndex = 0
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
    for(let key in this.selectedSubCategories){
       this.capiService.getSubCatFromId(parseInt(key, 10)).subscribe(subCat => {
        this.articolo.sottocategoria = subCat
        this.arrayArticoli.push(this.articolo)
      })
    }
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