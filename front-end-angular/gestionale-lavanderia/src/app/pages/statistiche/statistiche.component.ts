import { Component, Input, OnInit, ViewChild, ViewEncapsulation } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ThemePalette } from '@angular/material/core';
import { MatDatepickerInputEvent } from '@angular/material/datepicker';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-statistiche',
  templateUrl: './statistiche.component.html',
  styleUrls: ['./statistiche.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class StatisticheComponent{

  campaignOne: FormGroup;

  @Input()color: ThemePalette

  constructor(){
    const today = new Date();
    const month = today.getMonth();
    const year = today.getFullYear();

    this.campaignOne = new FormGroup({
      start: new FormControl(new Date(year, month, 13)),
      end: new FormControl(new Date(year, month, 16)),
    });
  }

  displayedColumnsNastri: string[] = ['Lavorazione', 'Numero', 'Nastro', 'Posizione', 'Prodotto', 'Servizio', 'Cliente'];
  nastroTable = new MatTableDataSource<PeriodicElement>(ELEMENT_DATA);

  displayedColumnsCapiInEntrata: String[] = ["Data", "Orario", "Lavorazione", "Numero", "Prodotto", "Servizio", "DataRiconoscimento", "Cliente"]
  capiInEntrataTable = new MatTableDataSource<capiInEntrata>(CAPI_IN_ENTRATA);

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  events: string[] = [];

  addEvent(type: string, event: MatDatepickerInputEvent<Date>) {
    this.events.push(`${type}: ${event.value}`);
    console.log(this.events)
  }

  public selectedTable: number = 0;

  ngAfterViewInit() {
    this.nastroTable.paginator = this.paginator;
    this.capiInEntrataTable.paginator = this.paginator
  }

  selectTable(){
    console.log(this.selectedTable)
  }
}

export interface capiInEntrata {
  Data: String;
  Orario: string;
  Lavorazione: string;
  Numero: string;
  Prodotto: string;
  Servizio: string;
  DataRiconoscimento: string;
  Cliente: string
}

export interface PeriodicElement {
  Lavorazione: string;
  Numero: string;
  Nastro: number;
  Posizione: string;
  Prodotto: string;
  Servizio: string;
  Cliente: string;
}

const CAPI_IN_ENTRATA: capiInEntrata[] = [
  {Data: "03/05/2022", Orario: "11:00", Lavorazione: "0002", Numero: '11', Prodotto: "Pantalone grigio", Servizio: "Servizio z", DataRiconoscimento: "05/05/2022", Cliente:"Mauro Gambetti"}
]

const ELEMENT_DATA: PeriodicElement[] = [
  {Lavorazione: "0008", Numero: '11',  Nastro:0, Posizione: "0", Prodotto: "Pantalone uomo", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0002", Numero: '22',  Nastro:0, Posizione: "0", Prodotto: "Maglia uomo", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0004", Numero: '33',  Nastro:0, Posizione: "0", Prodotto: "Camicia solo stiro", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0005", Numero: '44',  Nastro:0, Posizione: "0", Prodotto: "Giacca uomo", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0018", Numero: '55',  Nastro:0, Posizione: "0", Prodotto: "Piumino 7/8 uomo", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0028", Numero: '66',  Nastro:0, Posizione: "0", Prodotto: "Gonna donna", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0038", Numero: '77',  Nastro:0, Posizione: "0", Prodotto: "Leggins donna", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0048", Numero: '88',  Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0058", Numero: '99',  Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0068", Numero: '123', Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0078", Numero: '234', Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0088", Numero: '345', Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0098", Numero: '456', Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0118", Numero: '567', Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"},
  {Lavorazione: "0238", Numero: '678', Nastro:0, Posizione: "0", Prodotto: "aaa", Servizio:"Servizio x", Cliente:"Cliente x"}
];
