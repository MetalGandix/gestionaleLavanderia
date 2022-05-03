import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ViewChild, ViewEncapsulation } from '@angular/core';
import { jsPDF } from "jspdf";
import { map } from 'rxjs';

@Component({
  selector: 'app-fatture',
  templateUrl: './fatture.component.html',
  styleUrls: ['./fatture.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class FattureComponent{

  @ViewChild('pdfViewerOnDemand') pdfViewerOnDemand
  @ViewChild('pdfViewerAutoLoad') pdfViewerAutoLoad

  doc = new jsPDF();

  constructor(private http: HttpClient) {
    let url = "api/document/getmypdf"; // Or your url
    this.downloadFile(url).subscribe(
      (res) => {
        this.pdfViewerAutoLoad.pdfSrc = res; // pdfSrc can be Blob or Uint8Array
        this.pdfViewerAutoLoad.refresh(); // Ask pdf viewer to load/refresh pdf
      }
    );
  }

  downloadFile(url: string): any {
    return this.http.get(url, { responseType: 'blob' })
      .pipe(
        map((result: any) => {
          return result;
        })
      );
  }

  createPDF() { //jspdf
    // Default export is a4 paper, portrait, using millimeters for units
    this.doc.text("Hello world!", 10, 10);
    this.doc.save("a4.pdf");
  }

  openPdf() { //ng2-pdfjs.viewer
    let url = "url to fetch pdf as byte array";
    this.downloadFile(url).subscribe(
      (res: any) => {
        this.pdfViewerOnDemand.pdfSrc = res; // pdfSrc can be Blob or Uint8Array
        this.pdfViewerOnDemand.refresh(); // Ask pdf viewer to load/reresh pdf
      }
    )
  }

}