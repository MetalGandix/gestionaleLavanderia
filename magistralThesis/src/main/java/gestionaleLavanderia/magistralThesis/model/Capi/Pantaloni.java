package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "pantaloni")
public class Pantaloni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser pantaloniUtente;

    public DAOUser getPantaloniUtente() {
        return pantaloniUtente;
    }

    public void setPantaloniUtente(DAOUser pantaloniUtente) {
        this.pantaloniUtente = pantaloniUtente;
    }
}
