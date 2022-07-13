package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "cappelli")
public class Cappelli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int berretto;

    @Column
    private int cappello;

    @Column
    private int cappelloPelle;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser cappelloUtente;

    public long getId() {
        return id;
    }

    public int getBerretto() {
        return berretto;
    }

    public void setBerretto(int berretto) {
        this.berretto = berretto;
    }

    public int getCappello() {
        return cappello;
    }

    public void setCappello(int cappello) {
        this.cappello = cappello;
    }

    public int getCappelloPelle() {
        return cappelloPelle;
    }

    public void setCappelloPelle(int cappelloPelle) {
        this.cappelloPelle = cappelloPelle;
    }

    public DAOUser getCappelloUtente() {
        return cappelloUtente;
    }

    public void setCappelloUtente(DAOUser cappelloUtente) {
        this.cappelloUtente = cappelloUtente;
    }
}