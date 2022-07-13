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
    private int cappottoBimbo;

    @Column
    private int cappottoDonna;

    @Column
    private int cappottoUnisex;

    @Column
    private int cappottoUomo;

    @Column
    private int giaccaDonna;

    @Column
    private int giaccaUomo;

    @Column
    private int giacconeCortoDonna;

    @Column
    private int giacconeCortoUomo;

    @Column
    private int giacconeCotone;

    @Column
    private int giacconeLungoDonna;

    @Column
    private int giacconeLungoUomo;

    @Column
    private int giacconeUnisex;

    @Column
    private int giubbetto;

    @Column
    private int giubbettoJeans;

    @Column
    private int giubbinoEstivoUnisex;

    @Column
    private int impermeabileUnisex;

    @Column
    private int internoGiaccone;

    @Column
    private int montone;

    @Column
    private int pellicciaSintetica;

    @Column
    private int piumino7_8Donna;

    @Column
    private int piumino7_8Uomo;

    @Column
    private int piuminoCortoDonna;

    @Column
    private int piuminoCortoUomo;

    @Column
    private int piuminoLungoDonna;

    @Column
    private int piuminoLungoUomo;

    @Column
    private int soprabito;

    @Column
    private int tranch;

    @Column
    private int woolrich;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser giaccheEGiacconiUtente;

    public long getId() {
        return id;
    }


    public int getCappottoBimbo() {
        return cappottoBimbo;
    }

    public void setCappottoBimbo(int cappottoBimbo) {
        this.cappottoBimbo = cappottoBimbo;
    }

    public int getCappottoDonna() {
        return cappottoDonna;
    }

    public void setCappottoDonna(int cappottoDonna) {
        this.cappottoDonna = cappottoDonna;
    }

    public int getCappottoUnisex() {
        return cappottoUnisex;
    }

    public void setCappottoUnisex(int cappottoUnisex) {
        this.cappottoUnisex = cappottoUnisex;
    }

    public int getCappottoUomo() {
        return cappottoUomo;
    }

    public void setCappottoUomo(int cappottoUomo) {
        this.cappottoUomo = cappottoUomo;
    }

    public int getGiaccaDonna() {
        return giaccaDonna;
    }

    public void setGiaccaDonna(int giaccaDonna) {
        this.giaccaDonna = giaccaDonna;
    }

    public int getGiaccaUomo() {
        return giaccaUomo;
    }

    public void setGiaccaUomo(int giaccaUomo) {
        this.giaccaUomo = giaccaUomo;
    }

    public int getGiacconeCortoDonna() {
        return giacconeCortoDonna;
    }

    public void setGiacconeCortoDonna(int giacconeCortoDonna) {
        this.giacconeCortoDonna = giacconeCortoDonna;
    }

    public int getGiacconeCortoUomo() {
        return giacconeCortoUomo;
    }

    public void setGiacconeCortoUomo(int giacconeCortoUomo) {
        this.giacconeCortoUomo = giacconeCortoUomo;
    }

    public int getGiacconeCotone() {
        return giacconeCotone;
    }

    public void setGiacconeCotone(int giacconeCotone) {
        this.giacconeCotone = giacconeCotone;
    }

    public int getGiacconeLungoDonna() {
        return giacconeLungoDonna;
    }

    public void setGiacconeLungoDonna(int giacconeLungoDonna) {
        this.giacconeLungoDonna = giacconeLungoDonna;
    }

    public int getGiacconeLungoUomo() {
        return giacconeLungoUomo;
    }

    public void setGiacconeLungoUomo(int giacconeLungoUomo) {
        this.giacconeLungoUomo = giacconeLungoUomo;
    }

    public int getGiacconeUnisex() {
        return giacconeUnisex;
    }

    public void setGiacconeUnisex(int giacconeUnisex) {
        this.giacconeUnisex = giacconeUnisex;
    }

    public int getGiubbetto() {
        return giubbetto;
    }

    public void setGiubbetto(int giubbetto) {
        this.giubbetto = giubbetto;
    }

    public int getGiubbettoJeans() {
        return giubbettoJeans;
    }

    public void setGiubbettoJeans(int giubbettoJeans) {
        this.giubbettoJeans = giubbettoJeans;
    }

    public int getGiubbinoEstivoUnisex() {
        return giubbinoEstivoUnisex;
    }

    public void setGiubbinoEstivoUnisex(int giubbinoEstivoUnisex) {
        this.giubbinoEstivoUnisex = giubbinoEstivoUnisex;
    }

    public int getImpermeabileUnisex() {
        return impermeabileUnisex;
    }

    public void setImpermeabileUnisex(int impermeabileUnisex) {
        this.impermeabileUnisex = impermeabileUnisex;
    }

    public int getInternoGiaccone() {
        return internoGiaccone;
    }

    public void setInternoGiaccone(int internoGiaccone) {
        this.internoGiaccone = internoGiaccone;
    }

    public int getMontone() {
        return montone;
    }

    public void setMontone(int montone) {
        this.montone = montone;
    }

    public int getPellicciaSintetica() {
        return pellicciaSintetica;
    }

    public void setPellicciaSintetica(int pellicciaSintetica) {
        this.pellicciaSintetica = pellicciaSintetica;
    }

    public int getPiumino7_8Donna() {
        return piumino7_8Donna;
    }

    public void setPiumino7_8Donna(int piumino7_8Donna) {
        this.piumino7_8Donna = piumino7_8Donna;
    }

    public int getPiumino7_8Uomo() {
        return piumino7_8Uomo;
    }

    public void setPiumino7_8Uomo(int piumino7_8Uomo) {
        this.piumino7_8Uomo = piumino7_8Uomo;
    }

    public int getPiuminoCortoDonna() {
        return piuminoCortoDonna;
    }

    public void setPiuminoCortoDonna(int piuminoCortoDonna) {
        this.piuminoCortoDonna = piuminoCortoDonna;
    }

    public int getPiuminoCortoUomo() {
        return piuminoCortoUomo;
    }

    public void setPiuminoCortoUomo(int piuminoCortoUomo) {
        this.piuminoCortoUomo = piuminoCortoUomo;
    }

    public int getPiuminoLungoDonna() {
        return piuminoLungoDonna;
    }

    public void setPiuminoLungoDonna(int piuminoLungoDonna) {
        this.piuminoLungoDonna = piuminoLungoDonna;
    }

    public int getPiuminoLungoUomo() {
        return piuminoLungoUomo;
    }

    public void setPiuminoLungoUomo(int piuminoLungoUomo) {
        this.piuminoLungoUomo = piuminoLungoUomo;
    }

    public int getSoprabito() {
        return soprabito;
    }

    public void setSoprabito(int soprabito) {
        this.soprabito = soprabito;
    }

    public int getTranch() {
        return tranch;
    }

    public void setTranch(int tranch) {
        this.tranch = tranch;
    }

    public int getWoolrich() {
        return woolrich;
    }

    public void setWoolrich(int woolrich) {
        this.woolrich = woolrich;
    }

    public DAOUser getGiaccheEGiacconiUtente() {
        return giaccheEGiacconiUtente;
    }

    public void setGiaccheEGiacconiUtente(DAOUser giaccheEGiacconiUtente) {
        this.giaccheEGiacconiUtente = giaccheEGiacconiUtente;
    }
}