package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "pigiami_e_vestaglie")
public class PigiamaEVestaglie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int vestaglia;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser vestagliaUtente;
     
    public long getId() {
        return id;
    }

    public int getVestaglia() {
        return vestaglia;
    }

    public void setVestaglia(int vestaglia) {
        this.vestaglia = vestaglia;
    }

    public DAOUser getVestagliaUtente() {
        return vestagliaUtente;
    }

    public void setVestagliaUtente(DAOUser vestagliaUtente) {
        this.vestagliaUtente = vestagliaUtente;
    }


}
