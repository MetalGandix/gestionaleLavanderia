package gestionaleLavanderia.magistralThesis.model.Capi;
import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "tappeti")
public class Tappeti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int tappeto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser tappetoUtente;

    public long getId() {
        return id;
    }

    public int getTappeto() {
        return tappeto;
    }

    public void setTappeto(int tappeto) {
        this.tappeto = tappeto;
    }

    public DAOUser getTappetoUtente() {
        return tappetoUtente;
    }

    public void setTappetoUtente(DAOUser tappetoUtente) {
        this.tappetoUtente = tappetoUtente;
    }
}
