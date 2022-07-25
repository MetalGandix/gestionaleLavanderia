import { Articolo } from "./capi_classes/articolo";

export class CapiInfo {
    id: number;
    service: string;
    price: number = 0;
    ready: boolean = false;
    delivered: boolean = false;
    notes: string;
    article: Articolo;
}
