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
    private String camiciaBimbo;

    @Column
    private String camiciaCerimonia;

    @Column
    private String camiciaDonna;

    @Column
    private String camiciaJeans;

    @Column
    private String camiciaPelle;

    @Column
    private String camiciaPiegata;

    @Column
    private String camiciaSetaDonna;

    @Column
    private String camiciaSetaUomo;

    @Column
    private String camiciaSoloStiro;

    @Column
    private String camiciaUomo;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser camiciaUtente;

    public long getId() {
        return id;
    }

    public String getCamiciaBimbo() {
        return camiciaBimbo;
    }

    public void setCamiciaBimbo(String camiciaBimbo) {
        this.camiciaBimbo = camiciaBimbo;
    }

    public String getCamiciaCerimonia() {
        return camiciaCerimonia;
    }

    public void setCamiciaCerimonia(String camiciaCerimonia) {
        this.camiciaCerimonia = camiciaCerimonia;
    }

    public String getCamiciaDonna() {
        return camiciaDonna;
    }

    public void setCamiciaDonna(String camiciaDonna) {
        this.camiciaDonna = camiciaDonna;
    }

    public String getCamiciaJeans() {
        return camiciaJeans;
    }

    public void setCamiciaJeans(String camiciaJeans) {
        this.camiciaJeans = camiciaJeans;
    }

    public String getCamiciaPelle() {
        return camiciaPelle;
    }

    public void setCamiciaPelle(String camiciaPelle) {
        this.camiciaPelle = camiciaPelle;
    }

    public String getCamiciaPiegata() {
        return camiciaPiegata;
    }

    public void setCamiciaPiegata(String camiciaPiegata) {
        this.camiciaPiegata = camiciaPiegata;
    }

    public String getCamiciaSetaDonna() {
        return camiciaSetaDonna;
    }

    public void setCamiciaSetaDonna(String camiciaSetaDonna) {
        this.camiciaSetaDonna = camiciaSetaDonna;
    }

    public String getCamiciaSetaUomo() {
        return camiciaSetaUomo;
    }

    public void setCamiciaSetaUomo(String camiciaSetaUomo) {
        this.camiciaSetaUomo = camiciaSetaUomo;
    }

    public String getCamiciaSoloStiro() {
        return camiciaSoloStiro;
    }

    public void setCamiciaSoloStiro(String camiciaSoloStiro) {
        this.camiciaSoloStiro = camiciaSoloStiro;
    }

    public String getCamiciaUomo() {
        return camiciaUomo;
    }

    public void setCamiciaUomo(String camiciaUomo) {
        this.camiciaUomo = camiciaUomo;
    }

    public DAOUser getCamiciaUtente() {
        return camiciaUtente;
    }

    public void setCamiciaUtente(DAOUser camiciaUtente) {
        this.camiciaUtente = camiciaUtente;
    }
}