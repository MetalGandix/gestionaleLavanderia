package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "varie")
public class Varie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String accappatoi;

    @Column
    private String accessori;

    @Column
    private String bambolaStoffa;

    @Column
    private String borsa;

    @Column
    private String calzini;

    @Column
    private String canottaUnisex;

    @Column
    private String capoConRiporti;

    @Column
    private String cinturaDiPelle;

    @Column
    private String cinturaDiStoffa;

    @Column
    private String copriDivano;

    @Column
    private String copriPoltrona;

    @Column
    private String copriSedia;

    @Column
    private String doppioPetto;

    @Column
    private String foulard;

    @Column
    private String giccaPelle;

    @Column
    private String giletConTasche;

    @Column
    private String giletDiPelle;

    @Column
    private String guantiLana;

    @Column
    private String guantiPelle;

    @Column
    private String guantiUomo;

    @Column
    private String pigiamaBimbo;

    @Column
    private String scarponcino;
    
    @Column
    private String sciarpa;

    @Column
    private String sciarpaBambino;

    @Column
    private String sciarpaDiCotone;

    @Column
    private String sciarpaDiSeta;

    @Column
    private String tovagliaRettangolare;

    @Column
    private String tovagliaRotonda;

    @Column
    private String tutaSciBimbo;

    @Column
    private String tutaSciAdulto;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser varieUtente;

    public long getId() {
        return id;
    }

    public String getAccappatoi() {
        return accappatoi;
    }

    public void setAccappatoi(String accappatoi) {
        this.accappatoi = accappatoi;
    }

    public String getAccessori() {
        return accessori;
    }

    public void setAccessori(String accessori) {
        this.accessori = accessori;
    }

    public String getBambolaStoffa() {
        return bambolaStoffa;
    }

    public void setBambolaStoffa(String bambolaStoffa) {
        this.bambolaStoffa = bambolaStoffa;
    }

    public String getBorsa() {
        return borsa;
    }

    public void setBorsa(String borsa) {
        this.borsa = borsa;
    }

    public String getCalzini() {
        return calzini;
    }

    public void setCalzini(String calzini) {
        this.calzini = calzini;
    }

    public String getCanottaUnisex() {
        return canottaUnisex;
    }

    public void setCanottaUnisex(String canottaUnisex) {
        this.canottaUnisex = canottaUnisex;
    }

    public String getCapoConRiporti() {
        return capoConRiporti;
    }

    public void setCapoConRiporti(String capoConRiporti) {
        this.capoConRiporti = capoConRiporti;
    }

    public String getCinturaDiPelle() {
        return cinturaDiPelle;
    }

    public void setCinturaDiPelle(String cinturaDiPelle) {
        this.cinturaDiPelle = cinturaDiPelle;
    }

    public String getCinturaDiStoffa() {
        return cinturaDiStoffa;
    }

    public void setCinturaDiStoffa(String cinturaDiStoffa) {
        this.cinturaDiStoffa = cinturaDiStoffa;
    }

    public String getCopriDivano() {
        return copriDivano;
    }

    public void setCopriDivano(String copriDivano) {
        this.copriDivano = copriDivano;
    }

    public String getCopriPoltrona() {
        return copriPoltrona;
    }

    public void setCopriPoltrona(String copriPoltrona) {
        this.copriPoltrona = copriPoltrona;
    }

    public String getCopriSedia() {
        return copriSedia;
    }

    public void setCopriSedia(String copriSedia) {
        this.copriSedia = copriSedia;
    }

    public String getDoppioPetto() {
        return doppioPetto;
    }

    public void setDoppioPetto(String doppioPetto) {
        this.doppioPetto = doppioPetto;
    }

    public String getFoulard() {
        return foulard;
    }

    public void setFoulard(String foulard) {
        this.foulard = foulard;
    }

    public String getGiccaPelle() {
        return giccaPelle;
    }

    public void setGiccaPelle(String giccaPelle) {
        this.giccaPelle = giccaPelle;
    }

    public String getGiletConTasche() {
        return giletConTasche;
    }

    public void setGiletConTasche(String giletConTasche) {
        this.giletConTasche = giletConTasche;
    }

    public String getGiletDiPelle() {
        return giletDiPelle;
    }

    public void setGiletDiPelle(String giletDiPelle) {
        this.giletDiPelle = giletDiPelle;
    }

    public String getGuantiLana() {
        return guantiLana;
    }

    public void setGuantiLana(String guantiLana) {
        this.guantiLana = guantiLana;
    }

    public String getGuantiPelle() {
        return guantiPelle;
    }

    public void setGuantiPelle(String guantiPelle) {
        this.guantiPelle = guantiPelle;
    }

    public String getGuantiUomo() {
        return guantiUomo;
    }

    public void setGuantiUomo(String guantiUomo) {
        this.guantiUomo = guantiUomo;
    }


    public String getPigiamaBimbo() {
        return pigiamaBimbo;
    }

    public void setPigiamaBimbo(String pigiamaBimbo) {
        this.pigiamaBimbo = pigiamaBimbo;
    }

    public String getScarponcino() {
        return scarponcino;
    }

    public void setScarponcino(String scarponcino) {
        this.scarponcino = scarponcino;
    }

    public String getSciarpa() {
        return sciarpa;
    }

    public void setSciarpa(String sciarpa) {
        this.sciarpa = sciarpa;
    }

    public String getSciarpaBambino() {
        return sciarpaBambino;
    }

    public void setSciarpaBambino(String sciarpaBambino) {
        this.sciarpaBambino = sciarpaBambino;
    }

    public String getSciarpaDiCotone() {
        return sciarpaDiCotone;
    }

    public void setSciarpaDiCotone(String sciarpaDiCotone) {
        this.sciarpaDiCotone = sciarpaDiCotone;
    }

    public String getSciarpaDiSeta() {
        return sciarpaDiSeta;
    }

    public void setSciarpaDiSeta(String sciarpaDiSeta) {
        this.sciarpaDiSeta = sciarpaDiSeta;
    }

    public String getTovagliaRettangolare() {
        return tovagliaRettangolare;
    }

    public void setTovagliaRettangolare(String tovagliaRettangolare) {
        this.tovagliaRettangolare = tovagliaRettangolare;
    }

    public String getTovagliaRotonda() {
        return tovagliaRotonda;
    }

    public void setTovagliaRotonda(String tovagliaRotonda) {
        this.tovagliaRotonda = tovagliaRotonda;
    }

    public String getTutaSciBimbo() {
        return tutaSciBimbo;
    }

    public void setTutaSciBimbo(String tutaSciBimbo) {
        this.tutaSciBimbo = tutaSciBimbo;
    }

    public String getTutaSciAdulto() {
        return tutaSciAdulto;
    }

    public void setTutaSciAdulto(String tutaSciAdulto) {
        this.tutaSciAdulto = tutaSciAdulto;
    }

    public DAOUser getVarieUtente() {
        return varieUtente;
    }

    public void setVarieUtente(DAOUser varieUtente) {
        this.varieUtente = varieUtente;
    }

}
