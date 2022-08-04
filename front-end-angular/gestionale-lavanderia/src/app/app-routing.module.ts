import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AddUserComponent } from './pages/add-user/add-user.component';
import { ConsegnaCapiComponent } from './pages/consegna-capi/consegna-capi.component';
import { FattureComponent } from './pages/fatture/fatture.component';
import { FindUserComponent } from './pages/find-user/find-user.component';
import { GetAllCapiComponent } from './pages/get-all-capi/get-all-capi.component';
import { MostraCapiComponent } from './pages/mostra-capi/mostra-capi.component';
import { RitiroCapiComponent } from './pages/ritiro-capi/ritiro-capi.component';

const routes: Routes = [
  {path: '', redirectTo: '/find-user', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'consegna-capi', component: ConsegnaCapiComponent },
  { path: 'ritiro-capi', component: RitiroCapiComponent },
  { path: 'fatture', component: FattureComponent },
  { path: 'find-user', component: FindUserComponent },
  { path: 'add-user', component: AddUserComponent },
  { path: 'mostra-capi', component: MostraCapiComponent },
  { path: 'get-all-capi', component: GetAllCapiComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
