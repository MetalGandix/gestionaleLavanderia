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
    private int babyDol;

    @Column
    private int cardigan;
    
    @Column
    private int felpa;

    @Column
    private int magliaBimbo;

    @Column
    private int magliaDonna;

    @Column
    private int magliaUomo;

    @Column
    private int maglioneCotone;

    @Column
    private int maglioneLana;

    @Column
    private int tShirt;

    @Column
    private int tShirtColorata;

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

    public int getBabyDol() {
        return babyDol;
    }

    public void setBabyDol(int babyDol) {
        this.babyDol = babyDol;
    }

    public int getCardigan() {
        return cardigan;
    }

    public void setCardigan(int cardigan) {
        this.cardigan = cardigan;
    }

    public int getFelpa() {
        return felpa;
    }

    public void setFelpa(int felpa) {
        this.felpa = felpa;
    }

    public int getMagliaBimbo() {
        return magliaBimbo;
    }

    public void setMagliaBimbo(int magliaBimbo) {
        this.magliaBimbo = magliaBimbo;
    }

    public int getMagliaDonna() {
        return magliaDonna;
    }

    public void setMagliaDonna(int magliaDonna) {
        this.magliaDonna = magliaDonna;
    }

    public int getMagliaUomo() {
        return magliaUomo;
    }

    public void setMagliaUomo(int magliaUomo) {
        this.magliaUomo = magliaUomo;
    }

    public int getMaglioneCotone() {
        return maglioneCotone;
    }

    public void setMaglioneCotone(int maglioneCotone) {
        this.maglioneCotone = maglioneCotone;
    }

    public int getMaglioneLana() {
        return maglioneLana;
    }

    public void setMaglioneLana(int maglioneLana) {
        this.maglioneLana = maglioneLana;
    }

    public int gettShirt() {
        return tShirt;
    }

    public void settShirt(int tShirt) {
        this.tShirt = tShirt;
    }

    public int gettShirtColorata() {
        return tShirtColorata;
    }

    public void settShirtColorata(int tShirtColorata) {
        this.tShirtColorata = tShirtColorata;
    }



}
