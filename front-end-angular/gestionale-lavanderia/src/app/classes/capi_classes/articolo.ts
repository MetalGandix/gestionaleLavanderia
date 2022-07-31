import { SottoCategoria } from "../sotto-categoria";
import { User } from "../user";

export class Articolo {
    id: number;
    date: string;
    articoliUtente: User;
    servizio: string;
    prezzo: number;
    pronto: boolean = false;
    consegnato: boolean = false;
    note: string;
    numeroLavorazione: number = 0;
    sottocategoria: SottoCategoria;
    quantity: number = 0;
}
