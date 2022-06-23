package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "maglie")
public class Maglie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String babyDol;

    @Column
    private String cardigan;
    
    @Column
    private String felpa;

    @Column
    private String magliaBimbo;

    @Column
    private String magliaDonna;

    @Column
    private String magliaUomo;

    @Column
    private String maglioneCotone;

    @Column
    private String maglioneLana;

    @Column
    private String tShirt;

    @Column
    private String tShirtColorata;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser magliaUtente;

    public long getId() {
        return id;
    }
    
    public DAOUser getMagliaUtente() {
        return magliaUtente;
    }

    public void setMagliaUtente(DAOUser magliaUtente) {
        this.magliaUtente = magliaUtente;
    }

    public String getBabyDol() {
        return babyDol;
    }

    public void setBabyDol(String babyDol) {
        this.babyDol = babyDol;
    }

    public String getCardigan() {
        return cardigan;
    }

    public void setCardigan(String cardigan) {
        this.cardigan = cardigan;
    }

    public String getFelpa() {
        return felpa;
    }

    public void setFelpa(String felpa) {
        this.felpa = felpa;
    }

    public String getMagliaBimbo() {
        return magliaBimbo;
    }

    public void setMagliaBimbo(String magliaBimbo) {
        this.magliaBimbo = magliaBimbo;
    }

    public String getMagliaDonna() {
        return magliaDonna;
    }

    public void setMagliaDonna(String magliaDonna) {
        this.magliaDonna = magliaDonna;
    }

    public String getMagliaUomo() {
        return magliaUomo;
    }

    public void setMagliaUomo(String magliaUomo) {
        this.magliaUomo = magliaUomo;
    }

    public String getMaglioneCotone() {
        return maglioneCotone;
    }

    public void setMaglioneCotone(String maglioneCotone) {
        this.maglioneCotone = maglioneCotone;
    }

    public String getMaglioneLana() {
        return maglioneLana;
    }

    public void setMaglioneLana(String maglioneLana) {
        this.maglioneLana = maglioneLana;
    }

    public String gettShirt() {
        return tShirt;
    }

    public void settShirt(String tShirt) {
        this.tShirt = tShirt;
    }

    public String gettShirtColorata() {
        return tShirtColorata;
    }

    public void settShirtColorata(String tShirtColorata) {
        this.tShirtColorata = tShirtColorata;
    }



}
