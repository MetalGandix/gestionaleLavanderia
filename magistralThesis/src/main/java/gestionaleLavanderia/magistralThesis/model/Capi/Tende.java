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
    private String calateTenda;

    @Column
    private String mantovana;

    @Column
    private String tenda;

    @Column
    private String tendaCampeggio;

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

    public String getCalateTenda() {
        return calateTenda;
    }

    public void setCalateTenda(String calateTenda) {
        this.calateTenda = calateTenda;
    }

    public String getMantovana() {
        return mantovana;
    }

    public void setMantovana(String mantovana) {
        this.mantovana = mantovana;
    }

    public String getTenda() {
        return tenda;
    }

    public void setTenda(String tenda) {
        this.tenda = tenda;
    }

    public String getTendaCampeggio() {
        return tendaCampeggio;
    }

    public void setTendaCampeggio(String tendaCampeggio) {
        this.tendaCampeggio = tendaCampeggio;
    }

}
