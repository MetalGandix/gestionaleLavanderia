import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AddUserComponent } from './pages/add-user/add-user.component';
import { ConsegnaCapiComponent } from './pages/consegna-capi/consegna-capi.component';
import { FattureComponent } from './pages/fatture/fatture.component';
import { FindUserComponent } from './pages/find-user/find-user.component';
import { RitiroCapiComponent } from './pages/ritiro-capi/ritiro-capi.component';
import { StatisticheComponent } from './pages/statistiche/statistiche.component';

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'consegna-capi', component: ConsegnaCapiComponent },
  { path: 'ritiro-capi', component: RitiroCapiComponent },
  { path: 'statistiche', component: StatisticheComponent },
  { path: 'fatture', component: FattureComponent },
  { path: 'find-user', component: FindUserComponent },
  { path: 'add-user', component: AddUserComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
