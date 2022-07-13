package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

@Entity
@Table(name = "capi")
public class Capi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int pantaloni;

    @Column
    private int gonne;

    @Column
    private int camicie;

    @Column
    private int cappelli;

    @Column
    private int abiti;

    @Column
    private int giaccheEgiacconi;

    @Column
    private int trapunteEPiumoni;

    @Column
    private int maglie;

    @Column
    private int pigiamiEVestaglie;

    @Column
    private int scarpe;
    
    @Column
    private int tappeti;

    @Column
    private int tende;

    @Column
    private int varie;

    @Column int immagineUrl;

    public int getImmagineUrl() {
        return immagineUrl;
    }

    public void setImmagineUrl(int immagineUrl) {
        this.immagineUrl = immagineUrl;
    }

    public long getId() {
        return id;
    }
    
    public int getPantaloni() {
        return pantaloni;
    }

    public void setPantaloni(int pantaloni) {
        this.pantaloni = pantaloni;
    }

    public int getGonne() {
        return gonne;
    }

    public void setGonne(int gonne) {
        this.gonne = gonne;
    }

    public int getCamicie() {
        return camicie;
    }

    public void setCamicie(int camicie) {
        this.camicie = camicie;
    }

    public int getCappelli() {
        return cappelli;
    }

    public void setCappelli(int cappelli) {
        this.cappelli = cappelli;
    }

    public int getAbiti() {
        return abiti;
    }

    public void setAbiti(int abiti) {
        this.abiti = abiti;
    }

    public int getGiaccheEgiacconi() {
        return giaccheEgiacconi;
    }

    public void setGiaccheEgiacconi(int giaccheEgiacconi) {
        this.giaccheEgiacconi = giaccheEgiacconi;
    }

    public int getTrapunteEPiumoni() {
        return trapunteEPiumoni;
    }

    public void setTrapunteEPiumoni(int trapunteEPiumoni) {
        this.trapunteEPiumoni = trapunteEPiumoni;
    }

    public int getMaglie() {
        return maglie;
    }

    public void setMaglie(int maglie) {
        this.maglie = maglie;
    }

    public int getPigiamiEVestaglie() {
        return pigiamiEVestaglie;
    }

    public void setPigiamiEVestaglie(int pigiamiEVestaglie) {
        this.pigiamiEVestaglie = pigiamiEVestaglie;
    }

    public int getScarpe() {
        return scarpe;
    }

    public void setScarpe(int scarpe) {
        this.scarpe = scarpe;
    }

    public int getTappeti() {
        return tappeti;
    }

    public void setTappeti(int tappeti) {
        this.tappeti = tappeti;
    }

    public int getTende() {
        return tende;
    }

    public void setTende(int tende) {
        this.tende = tende;
    }

    public int getVarie() {
        return varie;
    }

    public void setVarie(int varie) {
        this.varie = varie;
    }


}
