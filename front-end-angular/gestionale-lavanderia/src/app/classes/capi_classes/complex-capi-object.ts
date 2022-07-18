import { User } from "../user";
import { Abiti } from "./abiti";
import { Camicie } from "./camicie";
import { Cappelli } from "./cappelli";
import { GiaccheEGiacconi } from "./giacche-egiacconi";
import { Gonne } from "./gonne";
import { Maglie } from "./maglie";
import { Pantaloni } from "./pantaloni";
import { PigiamaEVestaglie } from "./pigiama-evestaglie";
import { Scarpe } from "./scarpe";
import { Tappeti } from "./tappeti";
import { Tende } from "./tende";
import { TrapunteEPiumoni } from "./trapunte-epiumoni";
import { Varie } from "./varie";

export class ComplexCapiObject {
    pantaloni: Pantaloni;
    gonne: Gonne;
    camicie: Camicie;
    cappelli: Cappelli;
    abiti: Abiti;
    giaccheEGiacconi: GiaccheEGiacconi;
    trapunteEPiumoni: TrapunteEPiumoni;
    maglie: Maglie;
    pigiamaEVestaglie: PigiamaEVestaglie;
    scarpe: Scarpe;
    tappeti: Tappeti;
    tende: Tende;
    varie: Varie;
    user: User;
    date: String;
}
