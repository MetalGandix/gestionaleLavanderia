package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

@Entity
@Table(name = "capi")
public class Capi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String pantaloni;

    @Column
    private String gonne;

    @Column
    private String camicie;

    @Column
    private String cappelli;

    @Column
    private String abiti;

    @Column
    private String giaccheEgiacconi;

    @Column
    private String trapunteEPiumoni;

    @Column
    private String maglie;

    @Column
    private String pigiamiEVestaglie;

    @Column
    private String scarpe;
    
    @Column
    private String tappeti;

    @Column
    private String tende;

    @Column
    private String varie;

    @Column String immagineUrl;

    public String getImmagineUrl() {
        return immagineUrl;
    }

    public void setImmagineUrl(String immagineUrl) {
        this.immagineUrl = immagineUrl;
    }

    public long getId() {
        return id;
    }
    
    public String getPantaloni() {
        return pantaloni;
    }

    public void setPantaloni(String pantaloni) {
        this.pantaloni = pantaloni;
    }

    public String getGonne() {
        return gonne;
    }

    public void setGonne(String gonne) {
        this.gonne = gonne;
    }

    public String getCamicie() {
        return camicie;
    }

    public void setCamicie(String camicie) {
        this.camicie = camicie;
    }

    public String getCappelli() {
        return cappelli;
    }

    public void setCappelli(String cappelli) {
        this.cappelli = cappelli;
    }

    public String getAbiti() {
        return abiti;
    }

    public void setAbiti(String abiti) {
        this.abiti = abiti;
    }

    public String getGiaccheEgiacconi() {
        return giaccheEgiacconi;
    }

    public void setGiaccheEgiacconi(String giaccheEgiacconi) {
        this.giaccheEgiacconi = giaccheEgiacconi;
    }

    public String getTrapunteEPiumoni() {
        return trapunteEPiumoni;
    }

    public void setTrapunteEPiumoni(String trapunteEPiumoni) {
        this.trapunteEPiumoni = trapunteEPiumoni;
    }

    public String getMaglie() {
        return maglie;
    }

    public void setMaglie(String maglie) {
        this.maglie = maglie;
    }

    public String getPigiamiEVestaglie() {
        return pigiamiEVestaglie;
    }

    public void setPigiamiEVestaglie(String pigiamiEVestaglie) {
        this.pigiamiEVestaglie = pigiamiEVestaglie;
    }

    public String getScarpe() {
        return scarpe;
    }

    public void setScarpe(String scarpe) {
        this.scarpe = scarpe;
    }

    public String getTappeti() {
        return tappeti;
    }

    public void setTappeti(String tappeti) {
        this.tappeti = tappeti;
    }

    public String getTende() {
        return tende;
    }

    public void setTende(String tende) {
        this.tende = tende;
    }

    public String getVarie() {
        return varie;
    }

    public void setVarie(String varie) {
        this.varie = varie;
    }


}
