import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { jsPDF } from "jspdf";

@Component({
  selector: 'app-fatture',
  templateUrl: './fatture.component.html',
  styleUrls: ['./fatture.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class FattureComponent implements OnInit {

  constructor() { }

  doc = new jsPDF();

  createPDF(){
  // Default export is a4 paper, portrait, using millimeters for units
  this.doc.text("Hello world!", 10, 10);
  this.doc.save("a4.pdf");
  }

  importPDF(){
  }


  ngOnInit(): void {
  }

}
