package gestionaleLavanderia.magistralThesis.model.Capi;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

public class ComplexCapiObject {
    Pantaloni pantaloni;
    Gonne gonne;
    Camicie camicie;
    Cappelli cappelli;
    Abiti abiti;
    GiaccheEGiacconi giaccheEGiacconi;
    TrapunteEPiumoni trapunteEPiumoni;
    Maglie maglie;
    PigiamaEVestaglie pigiamaEVestaglie;
    Scarpe scarpe;
    Tappeti tappeti;
    Tende tende;
    Varie varie;
    DAOUser user;
    String date;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public DAOUser getUser() {
        return user;
    }
    public void setUser(DAOUser user) {
        this.user = user;
    }
    public Pantaloni getPantaloni() {
        return pantaloni;
    }
    public void setPantaloni(Pantaloni pantaloni) {
        this.pantaloni = pantaloni;
    }
    public Gonne getGonne() {
        return gonne;
    }
    public void setGonne(Gonne gonne) {
        this.gonne = gonne;
    }
    public Camicie getCamicie() {
        return camicie;
    }
    public void setCamicie(Camicie camicie) {
        this.camicie = camicie;
    }
    public Cappelli getCappelli() {
        return cappelli;
    }
    public void setCappelli(Cappelli cappelli) {
        this.cappelli = cappelli;
    }
    public Abiti getAbiti() {
        return abiti;
    }
    public void setAbiti(Abiti abiti) {
        this.abiti = abiti;
    }
    public GiaccheEGiacconi getGiaccheEGiacconi() {
        return giaccheEGiacconi;
    }
    public void setGiaccheEGiacconi(GiaccheEGiacconi giaccheEGiacconi) {
        this.giaccheEGiacconi = giaccheEGiacconi;
    }
    public TrapunteEPiumoni getTrapunteEPiumoni() {
        return trapunteEPiumoni;
    }
    public void setTrapunteEPiumoni(TrapunteEPiumoni trapunteEPiumoni) {
        this.trapunteEPiumoni = trapunteEPiumoni;
    }
    public Maglie getMaglie() {
        return maglie;
    }
    public void setMaglie(Maglie maglie) {
        this.maglie = maglie;
    }
    public PigiamaEVestaglie getPigiamaEVestaglie() {
        return pigiamaEVestaglie;
    }
    public void setPigiamaEVestaglie(PigiamaEVestaglie pigiamaEVestaglie) {
        this.pigiamaEVestaglie = pigiamaEVestaglie;
    }
    public Scarpe getScarpe() {
        return scarpe;
    }
    public void setScarpe(Scarpe scarpe) {
        this.scarpe = scarpe;
    }
    public Tappeti getTappeti() {
        return tappeti;
    }
    public void setTappeti(Tappeti tappeti) {
        this.tappeti = tappeti;
    }
    public Tende getTende() {
        return tende;
    }
    public void setTende(Tende tende) {
        this.tende = tende;
    }
    public Varie getVarie() {
        return varie;
    }
    public void setVarie(Varie varie) {
        this.varie = varie;
    }
}
