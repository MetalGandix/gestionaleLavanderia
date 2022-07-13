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

    private String pantaloneDivisa;

    private String pantaloneDonna;

    private String pantaloneSoloStiro;

    private String pantaloneUomo;

    private String pantalonePelle;

    public String getPantaloneDivisa() {
        return pantaloneDivisa;
    }

    public void setPantaloneDivisa(String pantaloneDivisa) {
        this.pantaloneDivisa = pantaloneDivisa;
    }

    public String getPantaloneDonna() {
        return pantaloneDonna;
    }

    public void setPantaloneDonna(String pantaloneDonna) {
        this.pantaloneDonna = pantaloneDonna;
    }

    public String getPantaloneSoloStiro() {
        return pantaloneSoloStiro;
    }

    public void setPantaloneSoloStiro(String pantaloneSoloStiro) {
        this.pantaloneSoloStiro = pantaloneSoloStiro;
    }

    public String getPantaloneUomo() {
        return pantaloneUomo;
    }

    public void setPantaloneUomo(String pantaloneUomo) {
        this.pantaloneUomo = pantaloneUomo;
    }

    public String getPantalonePelle() {
        return pantalonePelle;
    }

    public void setPantalonePelle(String pantalonePelle) {
        this.pantalonePelle = pantalonePelle;
    }

    public String getTutaDonna() {
        return tutaDonna;
    }

    public void setTutaDonna(String tutaDonna) {
        this.tutaDonna = tutaDonna;
    }

    private String tutaDonna;

    public DAOUser getPantaloniUtente() {
        return pantaloniUtente;
    }

    public void setPantaloniUtente(DAOUser pantaloniUtente) {
        this.pantaloniUtente = pantaloniUtente;
    }
}
