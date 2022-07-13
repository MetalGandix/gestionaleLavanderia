import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DressArrayService {

  public pantaloni_array = [{ name: "Pantalone divisa", icon: "assets//images//pantalone_divisa.png", value: 1 }, { name: "Pantalone donna", icon: "", value: 2 },
  { name: "Pantalone solo stiro", icon: "", value: 3 }, { name: "Pantalone uomo", icon: "assets//images//jeans_uomo.png", value: 4 }, { name: "Pantaloni pelle", icon: "", value: 5 }, { name: "Tuta donna", icon: "", value: 6 }]

}
