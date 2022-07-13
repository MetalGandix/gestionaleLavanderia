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

}
