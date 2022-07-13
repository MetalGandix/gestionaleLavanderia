package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "scarpe")
public class Scarpe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    @Column
    private int ciabatte;

    @Column
    private int clark;

    @Column
    private int converse;

    @Column
    private int hogan;

    @Column
    private int nike;

    @Column
    private int scarpeDaGinnastica;

    @Column
    private int scarponcini;

    @Column
    private int impermeabili;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser scarpeUtente;

    public int getCiabatte() {
        return ciabatte;
    }

    public void setCiabatte(int ciabatte) {
        this.ciabatte = ciabatte;
    }

    public int getClark() {
        return clark;
    }

    public void setClark(int clark) {
        this.clark = clark;
    }

    public int getConverse() {
        return converse;
    }

    public void setConverse(int converse) {
        this.converse = converse;
    }

    public int getHogan() {
        return hogan;
    }

    public void setHogan(int hogan) {
        this.hogan = hogan;
    }

    public int getNike() {
        return nike;
    }

    public void setNike(int nike) {
        this.nike = nike;
    }

    public int getScarpeDaGinnastica() {
        return scarpeDaGinnastica;
    }

    public void setScarpeDaGinnastica(int scarpeDaGinnastica) {
        this.scarpeDaGinnastica = scarpeDaGinnastica;
    }

    public int getScarponcini() {
        return scarponcini;
    }

    public void setScarponcini(int scarponcini) {
        this.scarponcini = scarponcini;
    }

    public int getImpermeabili() {
        return impermeabili;
    }

    public void setImpermeabili(int impermeabili) {
        this.impermeabili = impermeabili;
    }

    public DAOUser getScarpeUtente() {
        return scarpeUtente;
    }

    public void setScarpeUtente(DAOUser scarpeUtente) {
        this.scarpeUtente = scarpeUtente;
    }
}