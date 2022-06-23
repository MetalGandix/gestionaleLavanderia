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
    private String gonna;

    @Column
    private String gonnaJeans;

    @Column
    private String gonnaPelle;

    @Column
    private String gonnaPieghe;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser gonnaUtente;

    public long getId() {
        return id;
    }

    public String getGonna() {
        return gonna;
    }

    public void setGonna(String gonna) {
        this.gonna = gonna;
    }

    public String getGonnaJeans() {
        return gonnaJeans;
    }

    public void setGonnaJeans(String gonnaJeans) {
        this.gonnaJeans = gonnaJeans;
    }

    public String getGonnaPelle() {
        return gonnaPelle;
    }

    public void setGonnaPelle(String gonnaPelle) {
        this.gonnaPelle = gonnaPelle;
    }

    public String getGonnaPieghe() {
        return gonnaPieghe;
    }

    public void setGonnaPieghe(String gonnaPieghe) {
        this.gonnaPieghe = gonnaPieghe;
    }

    public DAOUser getGonnaUtente() {
        return gonnaUtente;
    }

    public void setGonnaUtente(DAOUser gonnaUtente) {
        this.gonnaUtente = gonnaUtente;
    }
}