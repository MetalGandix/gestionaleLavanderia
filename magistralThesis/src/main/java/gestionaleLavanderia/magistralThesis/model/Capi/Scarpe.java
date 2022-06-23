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
    private String ciabatte;

    @Column
    private String clark;

    @Column
    private String converse;

    @Column
    private String hogan;

    @Column
    private String nike;

    @Column
    private String scarpeDaGinnastica;

    @Column
    private String scarponcini;

    @Column
    private String impermeabili;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser scarpeUtente;

    public String getCiabatte() {
        return ciabatte;
    }

    public void setCiabatte(String ciabatte) {
        this.ciabatte = ciabatte;
    }

    public String getClark() {
        return clark;
    }

    public void setClark(String clark) {
        this.clark = clark;
    }

    public String getConverse() {
        return converse;
    }

    public void setConverse(String converse) {
        this.converse = converse;
    }

    public String getHogan() {
        return hogan;
    }

    public void setHogan(String hogan) {
        this.hogan = hogan;
    }

    public String getNike() {
        return nike;
    }

    public void setNike(String nike) {
        this.nike = nike;
    }

    public String getScarpeDaGinnastica() {
        return scarpeDaGinnastica;
    }

    public void setScarpeDaGinnastica(String scarpeDaGinnastica) {
        this.scarpeDaGinnastica = scarpeDaGinnastica;
    }

    public String getScarponcini() {
        return scarponcini;
    }

    public void setScarponcini(String scarponcini) {
        this.scarponcini = scarponcini;
    }

    public String getImpermeabili() {
        return impermeabili;
    }

    public void setImpermeabili(String impermeabili) {
        this.impermeabili = impermeabili;
    }

    public DAOUser getScarpeUtente() {
        return scarpeUtente;
    }

    public void setScarpeUtente(DAOUser scarpeUtente) {
        this.scarpeUtente = scarpeUtente;
    }
}