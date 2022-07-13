package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "camicie")
public class Camicie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int camiciaBimbo;

    @Column
    private int camiciaCerimonia;

    @Column
    private int camiciaDonna;

    @Column
    private int camiciaJeans;

    @Column
    private int camiciaPelle;

    @Column
    private int camiciaPiegata;

    @Column
    private int camiciaSetaDonna;

    @Column
    private int camiciaSetaUomo;

    @Column
    private int camiciaSoloStiro;

    @Column
    private int camiciaUomo;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser camiciaUtente;

    public long getId() {
        return id;
    }

    public int getCamiciaBimbo() {
        return camiciaBimbo;
    }

    public void setCamiciaBimbo(int camiciaBimbo) {
        this.camiciaBimbo = camiciaBimbo;
    }

    public int getCamiciaCerimonia() {
        return camiciaCerimonia;
    }

    public void setCamiciaCerimonia(int camiciaCerimonia) {
        this.camiciaCerimonia = camiciaCerimonia;
    }

    public int getCamiciaDonna() {
        return camiciaDonna;
    }

    public void setCamiciaDonna(int camiciaDonna) {
        this.camiciaDonna = camiciaDonna;
    }

    public int getCamiciaJeans() {
        return camiciaJeans;
    }

    public void setCamiciaJeans(int camiciaJeans) {
        this.camiciaJeans = camiciaJeans;
    }

    public int getCamiciaPelle() {
        return camiciaPelle;
    }

    public void setCamiciaPelle(int camiciaPelle) {
        this.camiciaPelle = camiciaPelle;
    }

    public int getCamiciaPiegata() {
        return camiciaPiegata;
    }

    public void setCamiciaPiegata(int camiciaPiegata) {
        this.camiciaPiegata = camiciaPiegata;
    }

    public int getCamiciaSetaDonna() {
        return camiciaSetaDonna;
    }

    public void setCamiciaSetaDonna(int camiciaSetaDonna) {
        this.camiciaSetaDonna = camiciaSetaDonna;
    }

    public int getCamiciaSetaUomo() {
        return camiciaSetaUomo;
    }

    public void setCamiciaSetaUomo(int camiciaSetaUomo) {
        this.camiciaSetaUomo = camiciaSetaUomo;
    }

    public int getCamiciaSoloStiro() {
        return camiciaSoloStiro;
    }

    public void setCamiciaSoloStiro(int camiciaSoloStiro) {
        this.camiciaSoloStiro = camiciaSoloStiro;
    }

    public int getCamiciaUomo() {
        return camiciaUomo;
    }

    public void setCamiciaUomo(int camiciaUomo) {
        this.camiciaUomo = camiciaUomo;
    }

    public DAOUser getCamiciaUtente() {
        return camiciaUtente;
    }

    public void setCamiciaUtente(DAOUser camiciaUtente) {
        this.camiciaUtente = camiciaUtente;
    }
}