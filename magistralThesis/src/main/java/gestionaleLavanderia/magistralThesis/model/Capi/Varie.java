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
    private int accappatoi;

    @Column
    private int accessori;

    @Column
    private int bambolaStoffa;

    @Column
    private int borsa;

    @Column
    private int calzini;

    @Column
    private int canottaUnisex;

    @Column
    private int capoConRiporti;

    @Column
    private int cinturaDiPelle;

    @Column
    private int cinturaDiStoffa;

    @Column
    private int copriDivano;

    @Column
    private int copriPoltrona;

    @Column
    private int copriSedia;

    @Column
    private int doppioPetto;

    @Column
    private int foulard;

    @Column
    private int giccaPelle;

    @Column
    private int giletConTasche;

    @Column
    private int giletDiPelle;

    @Column
    private int guantiLana;

    @Column
    private int guantiPelle;

    @Column
    private int guantiUomo;

    @Column
    private int pigiamaBimbo;

    @Column
    private int scarponcino;
    
    @Column
    private int sciarpa;

    @Column
    private int sciarpaBambino;

    @Column
    private int sciarpaDiCotone;

    @Column
    private int sciarpaDiSeta;

    @Column
    private int tovagliaRettangolare;

    @Column
    private int tovagliaRotonda;

    @Column
    private int tutaSciBimbo;

    @Column
    private int tutaSciAdulto;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser varieUtente;

    public long getId() {
        return id;
    }

    public int getAccappatoi() {
        return accappatoi;
    }

    public void setAccappatoi(int accappatoi) {
        this.accappatoi = accappatoi;
    }

    public int getAccessori() {
        return accessori;
    }

    public void setAccessori(int accessori) {
        this.accessori = accessori;
    }

    public int getBambolaStoffa() {
        return bambolaStoffa;
    }

    public void setBambolaStoffa(int bambolaStoffa) {
        this.bambolaStoffa = bambolaStoffa;
    }

    public int getBorsa() {
        return borsa;
    }

    public void setBorsa(int borsa) {
        this.borsa = borsa;
    }

    public int getCalzini() {
        return calzini;
    }

    public void setCalzini(int calzini) {
        this.calzini = calzini;
    }

    public int getCanottaUnisex() {
        return canottaUnisex;
    }

    public void setCanottaUnisex(int canottaUnisex) {
        this.canottaUnisex = canottaUnisex;
    }

    public int getCapoConRiporti() {
        return capoConRiporti;
    }

    public void setCapoConRiporti(int capoConRiporti) {
        this.capoConRiporti = capoConRiporti;
    }

    public int getCinturaDiPelle() {
        return cinturaDiPelle;
    }

    public void setCinturaDiPelle(int cinturaDiPelle) {
        this.cinturaDiPelle = cinturaDiPelle;
    }

    public int getCinturaDiStoffa() {
        return cinturaDiStoffa;
    }

    public void setCinturaDiStoffa(int cinturaDiStoffa) {
        this.cinturaDiStoffa = cinturaDiStoffa;
    }

    public int getCopriDivano() {
        return copriDivano;
    }

    public void setCopriDivano(int copriDivano) {
        this.copriDivano = copriDivano;
    }

    public int getCopriPoltrona() {
        return copriPoltrona;
    }

    public void setCopriPoltrona(int copriPoltrona) {
        this.copriPoltrona = copriPoltrona;
    }

    public int getCopriSedia() {
        return copriSedia;
    }

    public void setCopriSedia(int copriSedia) {
        this.copriSedia = copriSedia;
    }

    public int getDoppioPetto() {
        return doppioPetto;
    }

    public void setDoppioPetto(int doppioPetto) {
        this.doppioPetto = doppioPetto;
    }

    public int getFoulard() {
        return foulard;
    }

    public void setFoulard(int foulard) {
        this.foulard = foulard;
    }

    public int getGiccaPelle() {
        return giccaPelle;
    }

    public void setGiccaPelle(int giccaPelle) {
        this.giccaPelle = giccaPelle;
    }

    public int getGiletConTasche() {
        return giletConTasche;
    }

    public void setGiletConTasche(int giletConTasche) {
        this.giletConTasche = giletConTasche;
    }

    public int getGiletDiPelle() {
        return giletDiPelle;
    }

    public void setGiletDiPelle(int giletDiPelle) {
        this.giletDiPelle = giletDiPelle;
    }

    public int getGuantiLana() {
        return guantiLana;
    }

    public void setGuantiLana(int guantiLana) {
        this.guantiLana = guantiLana;
    }

    public int getGuantiPelle() {
        return guantiPelle;
    }

    public void setGuantiPelle(int guantiPelle) {
        this.guantiPelle = guantiPelle;
    }

    public int getGuantiUomo() {
        return guantiUomo;
    }

    public void setGuantiUomo(int guantiUomo) {
        this.guantiUomo = guantiUomo;
    }


    public int getPigiamaBimbo() {
        return pigiamaBimbo;
    }

    public void setPigiamaBimbo(int pigiamaBimbo) {
        this.pigiamaBimbo = pigiamaBimbo;
    }

    public int getScarponcino() {
        return scarponcino;
    }

    public void setScarponcino(int scarponcino) {
        this.scarponcino = scarponcino;
    }

    public int getSciarpa() {
        return sciarpa;
    }

    public void setSciarpa(int sciarpa) {
        this.sciarpa = sciarpa;
    }

    public int getSciarpaBambino() {
        return sciarpaBambino;
    }

    public void setSciarpaBambino(int sciarpaBambino) {
        this.sciarpaBambino = sciarpaBambino;
    }

    public int getSciarpaDiCotone() {
        return sciarpaDiCotone;
    }

    public void setSciarpaDiCotone(int sciarpaDiCotone) {
        this.sciarpaDiCotone = sciarpaDiCotone;
    }

    public int getSciarpaDiSeta() {
        return sciarpaDiSeta;
    }

    public void setSciarpaDiSeta(int sciarpaDiSeta) {
        this.sciarpaDiSeta = sciarpaDiSeta;
    }

    public int getTovagliaRettangolare() {
        return tovagliaRettangolare;
    }

    public void setTovagliaRettangolare(int tovagliaRettangolare) {
        this.tovagliaRettangolare = tovagliaRettangolare;
    }

    public int getTovagliaRotonda() {
        return tovagliaRotonda;
    }

    public void setTovagliaRotonda(int tovagliaRotonda) {
        this.tovagliaRotonda = tovagliaRotonda;
    }

    public int getTutaSciBimbo() {
        return tutaSciBimbo;
    }

    public void setTutaSciBimbo(int tutaSciBimbo) {
        this.tutaSciBimbo = tutaSciBimbo;
    }

    public int getTutaSciAdulto() {
        return tutaSciAdulto;
    }

    public void setTutaSciAdulto(int tutaSciAdulto) {
        this.tutaSciAdulto = tutaSciAdulto;
    }

    public DAOUser getVarieUtente() {
        return varieUtente;
    }

    public void setVarieUtente(DAOUser varieUtente) {
        this.varieUtente = varieUtente;
    }

}
