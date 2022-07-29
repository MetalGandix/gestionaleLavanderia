import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';
import { SidebarComponent } from './layout/sidebar/sidebar.component';
import { RitiroCapiComponent } from './pages/ritiro-capi/ritiro-capi.component';
import { ConsegnaCapiComponent } from './pages/consegna-capi/consegna-capi.component';
import { StatisticheComponent } from './pages/statistiche/statistiche.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule, MAT_DATE_LOCALE } from '@angular/material/core';
import { HttpClientModule } from '@angular/common/http';
import { MatTableModule } from '@angular/material/table'
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatButtonToggleModule } from '@angular/material/button-toggle';
import { MatTabsModule } from '@angular/material/tabs';
import { FattureComponent } from './pages/fatture/fatture.component';
import { MatCardModule } from '@angular/material/card';
import { PdfJsViewerModule } from 'ng2-pdfjs-viewer'; // <-- Import PdfJsViewerModule module
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { FindUserComponent } from './pages/find-user/find-user.component';
import { MatListModule } from '@angular/material/list';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { AddUserComponent } from './pages/add-user/add-user.component';
import { MostraCapiComponent } from './pages/mostra-capi/mostra-capi.component';
import { MatMenuModule } from '@angular/material/menu';
import { MatDialogModule } from '@angular/material/dialog';
import { UserDialogComponent } from './pages/find-user/user-dialog/user-dialog.component';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { GetAllCapiComponent } from './pages/get-all-capi/get-all-capi.component';
import { NgxPrintModule } from 'ngx-print';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    RitiroCapiComponent,
    ConsegnaCapiComponent,
    StatisticheComponent,
    FattureComponent,
    FindUserComponent,
    AddUserComponent,
    MostraCapiComponent,
    UserDialogComponent,
    GetAllCapiComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatButtonModule,
    MatIconModule,
    MatDividerModule,
    HttpClientModule,
    MatNativeDateModule,
    ReactiveFormsModule,
    MatTableModule,
    MatPaginatorModule,
    MatButtonToggleModule,
    MatTabsModule,
    MatCardModule,
    PdfJsViewerModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatListModule,
    MatSnackBarModule,
    MatMenuModule,
    MatDialogModule,
    MatCheckboxModule,
    NgxPrintModule
  ],
  providers: [{ provide: MAT_DATE_LOCALE, useValue: 'en-GB' }],
  bootstrap: [AppComponent]
})
export class AppModule { }