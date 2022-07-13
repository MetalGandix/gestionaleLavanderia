package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "tende")
public class Tende {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int calateTenda;

    @Column
    private int mantovana;

    @Column
    private int tenda;

    @Column
    private int tendaCampeggio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser tendeUtente;

    public DAOUser getTendeUtente() {
        return tendeUtente;
    }

    public void setTendeUtente(DAOUser tendeUtente) {
        this.tendeUtente = tendeUtente;
    }

    public long getId() {
        return id;
    }

    public int getCalateTenda() {
        return calateTenda;
    }

    public void setCalateTenda(int calateTenda) {
        this.calateTenda = calateTenda;
    }

    public int getMantovana() {
        return mantovana;
    }

    public void setMantovana(int mantovana) {
        this.mantovana = mantovana;
    }

    public int getTenda() {
        return tenda;
    }

    public void setTenda(int tenda) {
        this.tenda = tenda;
    }

    public int getTendaCampeggio() {
        return tendaCampeggio;
    }

    public void setTendaCampeggio(int tendaCampeggio) {
        this.tendaCampeggio = tendaCampeggio;
    }

}
