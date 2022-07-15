import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DressArrayService {

  //Array principale
  public dress_array = [{ name: "Pantaloni", value: 1 }, { name: "Gonne", value: 2 },
  { name: "Camicie", value: 3 }, { name: "Cappelli", value: 4 }, { name: "Abiti", value: 5 }, { name: "Giacche e giacconi", value: 6 }, { name: "Trapunte e piumoni", value: 7 }, { name: "Maglie", value: 8 }, { name: "Pigiami e vestaglie", value: 9 }, { name: "Scarpe", value: 10 }, { name: "Tappeti", value: 11 }, { name: "Tende", value: 12 }, { name: "Varie", value: 13 }]

  //Array pantaloni
  public pantaloni_array = [{ name: "Pantalone divisa", icon: "assets//images//pantalone_divisa.png", value: 1 }, { name: "Pantalone donna", icon: "", value: 2 },
  { name: "Pantalone solo stiro", icon: "", value: 3 }, { name: "Pantalone uomo", icon: "assets//images//jeans_uomo.png", value: 4 }, { name: "Pantaloni pelle", icon: "", value: 5 }, { name: "Tuta donna", icon: "", value: 6 }]

  //Array maglie
  public maglie_array = [{ name: "Baby dol", icon: "", value: 1 }, { name: "Cardigan", icon: "", value: 2 },
  { name: "Felpa", icon: "", value: 3 }, { name: "Maglia bimbo/a", icon: "", value: 4 }, { name: "Maglia donna", icon: "", value: 5 }, { name: "Maglia uomo", icon: "", value: 6 }, { name: "Maglione cotone", icon: "", value: 7 }, { name: "Maglione lana", icon: "", value: 8 }, { name: "T-shirt", icon: "", value: 9 }, { name: "T-shirt colorata", icon: "", value: 10 }]

  //Array varie
  public varie_array = [{ name: "Accappatoi", icon: "", value: 1 }, { name: "Accessori", icon: "", value: 2 },
  { name: "Bambola stoffa", icon: "", value: 3 }, { name: "Borsa", icon: "", value: 4 }, { name: "Calzini", icon: "", value: 5 }, { name: "Canotta unisex", icon: "", value: 6 }, { name: "Capo con riporti", icon: "", value: 7 }, { name: "Cintura di pelle", icon: "", value: 8 }, { name: "Cintura di stoffa", icon: "", value: 9 }, { name: "Copri divano", icon: "", value: 10 }, { name: "Copri poltrona", icon: "", value: 11 }, { name: "Copri sedia", icon: "", value: 12 }, { name: "Doppio petto", icon: "", value: 13 }, { name: "Fouldard", icon: "", value: 14 }, { name: "Giacca pelle", icon: "", value: 15 }, { name: "Gilet con tasche", icon: "", value: 16 }, { name: "Gilet di pelle", icon: "", value: 17 }, { name: "Guanti di lana", icon: "", value: 18 }, { name: "Guanti di pelle", icon: "", value: 19 }, { name: "Guanti uomo", icon: "", value: 20 },{ name: "Pigiama bimbo/a", icon: "", value: 21 }, { name: "Scarponcini", icon: "", value: 22 }, { name: "Sciarpa", icon: "", value: 23 }, { name: "Sciarpa bambino/a", icon: "", value: 24 }, { name: "Sciarpa di cotone", icon: "", value: 25 }, { name: "Sciarpa di seta", icon: "", value: 26 }, { name: "Tovaglia rettang", icon: "", value: 27 }, { name: "Tovaglia tonda", icon: "", value: 28 }, { name: "Tuta sci bimbo", icon: "", value: 29 }, { name: "Tuta sci adulto", icon: "", value: 30 }]

  //Pigiami array
  public pigiami_array = [{ name: "Vestaglia", icon: "", value: 1 }]

  //Scarpe array
  public scarpe_array = [{ name: "Ciabatte", icon: "", value: 1 }, { name: "Clark", icon: "", value: 2 },
  { name: "Converse", icon: "", value: 3 }, { name: "Hogan", icon: "", value: 4 }, { name: "Nike", icon: "", value: 5 }, { name: "Scarpe da ginnastica", icon: "", value: 6 }, { name: "Scarponcini", icon: "", value: 7 }, { name: "Timberland", icon: "", value: 8 }]

  //Tappeti array
  public tappeti_array = [{ name: "Tappeto", icon: "", value: 1 }]

  //Tende array
  public tende_array = [{ name: "Calate tenda", icon: "", value: 1 }, { name: "Mantovana", icon: "", value: 2 }, { name: "Tenda", icon: "", value: 3 }, { name: "Tenda campeggio", icon: "", value: 4 }]

  //Trapunte e piumoni Array 
  public trapunteEPiumoni_array = [{ name: "Coperta 1 piazza lana", icon: "", value: 1 }, { name: "Coperta 2 piazze lana", icon: "", value: 2 }, { name: "Coperta bambino", icon: "", value: 3 }, { name: "Coperta uncinetto", icon: "", value: 4 }, { name: "Coprimaterasso", icon: "", value: 5 }, { name: "Cuscino piuma", icon: "", value: 6 }, { name: "Cuscino sintetico", icon: "", value: 7 }, { name: "Federe", icon: "", value: 8 }, { name: "Lenzuola ad una piazza", icon: "", value: 9 }, { name: "Lenzuolo a due piazze", icon: "", value: 10 }, { name: "Merinos 2 piazze", icon: "", value: 11 }, { name: "Piumone 1P OCA", icon: "", value: 12 }, { name: "Piumone 1P sintetico", icon: "", value: 13 }, { name: "Piumone 2P OCA", icon: "", value: 14 }, { name: "Piumone 2P sintetico", icon: "", value: 15 }, { name: "Sacco a pelo 1 piazza", icon: "", value: 16 }, { name: "Sacco a pelo 2 piazze", icon: "", value: 17 }, { name: "Trapunta 1 piazza", icon: "", value: 18 }, { name: "Trapunta 2 piazze", icon: "", value: 19 }]

  //Giacche e giacconi Array   
  public giaccheEGiacconi_array = [{ name: "Cappotto bimbo", icon: "", value: 1 }, { name: "Cappotto donna", icon: "", value: 2 }, { name: "Cappotto unisex", icon: "", value: 3 }, { name: "Cappotto uomo", icon: "", value: 4 }, { name: "Giacca donna", icon: "", value: 5 }, { name: "Giacca uomo", icon: "", value: 6 }, { name: "Giaccone corto donna", icon: "", value: 7 }, { name: "Giaccone corto uomo", icon: "", value: 8 }, { name: "Giaccone cotone", icon: "", value: 9 }, { name: "Giaccone lungo donna", icon: "", value: 10 }, { name: "Giaccone lungo uomo", icon: "", value: 11 }, { name: "Giaccone unisex", icon: "", value: 12 }, { name: "Giubbetto", icon: "", value: 13 }, { name: "Giubbetto jeans", icon: "", value: 14 }, { name: "Giubbetto estivo unisex", icon: "", value: 15 }, { name: "Impermeabili unisex", icon: "", value: 16 }, { name: "Interno giaccone", icon: "", value: 17 }, { name: "Montone", icon: "", value: 18 }, { name: "Pelliccia sintetica", icon: "", value: 19 }, { name: "Piumino 7/8 donna", icon: "", value: 20 }, { name: "Piumino 7/8 uomo", icon: "", value: 21 }, { name: "Piumino corto donna", icon: "", value: 22 }, { name: "Piumino corto uomo", icon: "", value: 23 }, { name: "Piumino lungo donna", icon: "", value: 24 }, { name: "Piumino lungo uomo", icon: "", value: 25 }, { name: "Soprabito", icon: "", value: 26 }, { name: "Tranch", icon: "", value: 27 }, { name: "Woolrich", icon: "", value: 28 }]

  //Gonne Array
  public gonne_array = [{ name: "Gonna", icon: "", value: 1 }, { name: "Gonna jeans", icon: "", value: 2 }, { name: "Gonna pelle", icon: "", value: 3 }, { name: "Gonna pieghe", icon: "", value: 4 }]  

  //Camicie Array
  public camicie_array = [{ name: "Camicia bimbo", icon: "", value: 1 }, { name: "Camicia cerimonia", icon: "", value: 2 }, { name: "Camicia donna", icon: "", value: 3 }, { name: "Camicia jeans", icon: "", value: 4 }, { name: "Camicia pelle", icon: "", value: 5 }, { name: "Camicia piegata", icon: "", value: 6 }, { name: "Camicia seta donna", icon: "", value: 7 }, { name: "Camicia seta uomo", icon: "", value: 8 }, { name: "Camicia solo stiro", icon: "", value: 9 }, { name: "Camicia uomo", icon: "", value: 10 }]

  //Cappelli Array
  public cappelli_array = [{ name: "Berretto", icon: "", value: 1 }, { name: "Cappello", icon: "", value: 2 }, { name: "Cappello pelle", icon: "", value: 3 }]

  //Abiti Array   
  public abiti_array = [{ name: "+", icon: "", value: 1 }, { name: "Abito donna", icon: "", value: 2 }, { name: "Abito lungo", icon: "", value: 3 }, { name: "Abito pizzo", icon: "", value: 4 }, { name: "Abito sposa", icon: "", value: 5 }, { name: "Abito uomo", icon: "", value: 6 }, { name: "Cravatta", icon: "", value: 7 }, { name: "Divisa polizia locale", icon: "", value: 8 }, { name: "Divisa carabiniere", icon: "", value: 9 }, { name: "Divisa finanza", icon: "", value: 10 }, { name: "Divisa polizia", icon: "", value: 11 }, { name: "Gilet uomo", icon: "", value: 12 }, { name: "Tailleur gonna", icon: "", value: 13 }, { name: "Tailleur pantaloni", icon: "", value: 14 }]
}