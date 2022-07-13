package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "gonne")
public class Gonne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int gonna;

    @Column
    private int gonnaJeans;

    @Column
    private int gonnaPelle;

    @Column
    private int gonnaPieghe;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser gonnaUtente;

    public long getId() {
        return id;
    }

    public int getGonna() {
        return gonna;
    }

    public void setGonna(int gonna) {
        this.gonna = gonna;
    }

    public int getGonnaJeans() {
        return gonnaJeans;
    }

    public void setGonnaJeans(int gonnaJeans) {
        this.gonnaJeans = gonnaJeans;
    }

    public int getGonnaPelle() {
        return gonnaPelle;
    }

    public void setGonnaPelle(int gonnaPelle) {
        this.gonnaPelle = gonnaPelle;
    }

    public int getGonnaPieghe() {
        return gonnaPieghe;
    }

    public void setGonnaPieghe(int gonnaPieghe) {
        this.gonnaPieghe = gonnaPieghe;
    }

    public DAOUser getGonnaUtente() {
        return gonnaUtente;
    }

    public void setGonnaUtente(DAOUser gonnaUtente) {
        this.gonnaUtente = gonnaUtente;
    }
}