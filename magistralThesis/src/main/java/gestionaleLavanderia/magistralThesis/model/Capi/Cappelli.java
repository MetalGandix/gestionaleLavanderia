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
    private String berretto;

    @Column
    private String cappello;

    @Column
    private String cappelloPelle;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser cappelloUtente;

    public long getId() {
        return id;
    }

    public String getBerretto() {
        return berretto;
    }

    public void setBerretto(String berretto) {
        this.berretto = berretto;
    }

    public String getCappello() {
        return cappello;
    }

    public void setCappello(String cappello) {
        this.cappello = cappello;
    }

    public String getCappelloPelle() {
        return cappelloPelle;
    }

    public void setCappelloPelle(String cappelloPelle) {
        this.cappelloPelle = cappelloPelle;
    }

    public DAOUser getCappelloUtente() {
        return cappelloUtente;
    }

    public void setCappelloUtente(DAOUser cappelloUtente) {
        this.cappelloUtente = cappelloUtente;
    }
}