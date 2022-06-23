package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "giacche_e_giacconi")
public class GiaccheEGiacconi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String cappottoBimbo;

    @Column
    private String cappottoDonna;

    @Column
    private String cappottoUnisex;

    @Column
    private String cappottoUomo;

    @Column
    private String giaccaDonna;

    @Column
    private String giaccaUomo;

    @Column
    private String giacconeCortoDonna;

    @Column
    private String giacconeCortoUomo;

    @Column
    private String giacconeCotone;

    @Column
    private String giacconeLungoDonna;

    @Column
    private String giacconeLungoUomo;

    @Column
    private String giacconeUnisex;

    @Column
    private String giubbetto;

    @Column
    private String giubbettoJeans;

    @Column
    private String giubbinoEstivoUnisex;

    @Column
    private String impermeabileUnisex;

    @Column
    private String internoGiaccone;

    @Column
    private String montone;

    @Column
    private String pellicciaSintetica;

    @Column
    private String piumino7_8Donna;

    @Column
    private String piumino7_8Uomo;

    @Column
    private String piuminoCortoDonna;

    @Column
    private String piuminoCortoUomo;

    @Column
    private String piuminoLungoDonna;

    @Column
    private String piuminoLungoUomo;

    @Column
    private String soprabito;

    @Column
    private String tranch;

    @Column
    private String woolrich;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser giaccheEGiacconiUtente;

    public long getId() {
        return id;
    }


    public String getCappottoBimbo() {
        return cappottoBimbo;
    }

    public void setCappottoBimbo(String cappottoBimbo) {
        this.cappottoBimbo = cappottoBimbo;
    }

    public String getCappottoDonna() {
        return cappottoDonna;
    }

    public void setCappottoDonna(String cappottoDonna) {
        this.cappottoDonna = cappottoDonna;
    }

    public String getCappottoUnisex() {
        return cappottoUnisex;
    }

    public void setCappottoUnisex(String cappottoUnisex) {
        this.cappottoUnisex = cappottoUnisex;
    }

    public String getCappottoUomo() {
        return cappottoUomo;
    }

    public void setCappottoUomo(String cappottoUomo) {
        this.cappottoUomo = cappottoUomo;
    }

    public String getGiaccaDonna() {
        return giaccaDonna;
    }

    public void setGiaccaDonna(String giaccaDonna) {
        this.giaccaDonna = giaccaDonna;
    }

    public String getGiaccaUomo() {
        return giaccaUomo;
    }

    public void setGiaccaUomo(String giaccaUomo) {
        this.giaccaUomo = giaccaUomo;
    }

    public String getGiacconeCortoDonna() {
        return giacconeCortoDonna;
    }

    public void setGiacconeCortoDonna(String giacconeCortoDonna) {
        this.giacconeCortoDonna = giacconeCortoDonna;
    }

    public String getGiacconeCortoUomo() {
        return giacconeCortoUomo;
    }

    public void setGiacconeCortoUomo(String giacconeCortoUomo) {
        this.giacconeCortoUomo = giacconeCortoUomo;
    }

    public String getGiacconeCotone() {
        return giacconeCotone;
    }

    public void setGiacconeCotone(String giacconeCotone) {
        this.giacconeCotone = giacconeCotone;
    }

    public String getGiacconeLungoDonna() {
        return giacconeLungoDonna;
    }

    public void setGiacconeLungoDonna(String giacconeLungoDonna) {
        this.giacconeLungoDonna = giacconeLungoDonna;
    }

    public String getGiacconeLungoUomo() {
        return giacconeLungoUomo;
    }

    public void setGiacconeLungoUomo(String giacconeLungoUomo) {
        this.giacconeLungoUomo = giacconeLungoUomo;
    }

    public String getGiacconeUnisex() {
        return giacconeUnisex;
    }

    public void setGiacconeUnisex(String giacconeUnisex) {
        this.giacconeUnisex = giacconeUnisex;
    }

    public String getGiubbetto() {
        return giubbetto;
    }

    public void setGiubbetto(String giubbetto) {
        this.giubbetto = giubbetto;
    }

    public String getGiubbettoJeans() {
        return giubbettoJeans;
    }

    public void setGiubbettoJeans(String giubbettoJeans) {
        this.giubbettoJeans = giubbettoJeans;
    }

    public String getGiubbinoEstivoUnisex() {
        return giubbinoEstivoUnisex;
    }

    public void setGiubbinoEstivoUnisex(String giubbinoEstivoUnisex) {
        this.giubbinoEstivoUnisex = giubbinoEstivoUnisex;
    }

    public String getImpermeabileUnisex() {
        return impermeabileUnisex;
    }

    public void setImpermeabileUnisex(String impermeabileUnisex) {
        this.impermeabileUnisex = impermeabileUnisex;
    }

    public String getInternoGiaccone() {
        return internoGiaccone;
    }

    public void setInternoGiaccone(String internoGiaccone) {
        this.internoGiaccone = internoGiaccone;
    }

    public String getMontone() {
        return montone;
    }

    public void setMontone(String montone) {
        this.montone = montone;
    }

    public String getPellicciaSintetica() {
        return pellicciaSintetica;
    }

    public void setPellicciaSintetica(String pellicciaSintetica) {
        this.pellicciaSintetica = pellicciaSintetica;
    }

    public String getPiumino7_8Donna() {
        return piumino7_8Donna;
    }

    public void setPiumino7_8Donna(String piumino7_8Donna) {
        this.piumino7_8Donna = piumino7_8Donna;
    }

    public String getPiumino7_8Uomo() {
        return piumino7_8Uomo;
    }

    public void setPiumino7_8Uomo(String piumino7_8Uomo) {
        this.piumino7_8Uomo = piumino7_8Uomo;
    }

    public String getPiuminoCortoDonna() {
        return piuminoCortoDonna;
    }

    public void setPiuminoCortoDonna(String piuminoCortoDonna) {
        this.piuminoCortoDonna = piuminoCortoDonna;
    }

    public String getPiuminoCortoUomo() {
        return piuminoCortoUomo;
    }

    public void setPiuminoCortoUomo(String piuminoCortoUomo) {
        this.piuminoCortoUomo = piuminoCortoUomo;
    }

    public String getPiuminoLungoDonna() {
        return piuminoLungoDonna;
    }

    public void setPiuminoLungoDonna(String piuminoLungoDonna) {
        this.piuminoLungoDonna = piuminoLungoDonna;
    }

    public String getPiuminoLungoUomo() {
        return piuminoLungoUomo;
    }

    public void setPiuminoLungoUomo(String piuminoLungoUomo) {
        this.piuminoLungoUomo = piuminoLungoUomo;
    }

    public String getSoprabito() {
        return soprabito;
    }

    public void setSoprabito(String soprabito) {
        this.soprabito = soprabito;
    }

    public String getTranch() {
        return tranch;
    }

    public void setTranch(String tranch) {
        this.tranch = tranch;
    }

    public String getWoolrich() {
        return woolrich;
    }

    public void setWoolrich(String woolrich) {
        this.woolrich = woolrich;
    }

    public DAOUser getGiaccheEGiacconiUtente() {
        return giaccheEGiacconiUtente;
    }

    public void setGiaccheEGiacconiUtente(DAOUser giaccheEGiacconiUtente) {
        this.giaccheEGiacconiUtente = giaccheEGiacconiUtente;
    }
}