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

    private int pantaloneDivisa;

    private int pantaloneDonna;

    private int pantaloneSoloStiro;

    private int pantaloneUomo;

    private int pantalonePelle;

    public int getPantaloneDivisa() {
        return pantaloneDivisa;
    }

    public void setPantaloneDivisa(int pantaloneDivisa) {
        this.pantaloneDivisa = pantaloneDivisa;
    }

    public int getPantaloneDonna() {
        return pantaloneDonna;
    }

    public void setPantaloneDonna(int pantaloneDonna) {
        this.pantaloneDonna = pantaloneDonna;
    }

    public int getPantaloneSoloStiro() {
        return pantaloneSoloStiro;
    }

    public void setPantaloneSoloStiro(int pantaloneSoloStiro) {
        this.pantaloneSoloStiro = pantaloneSoloStiro;
    }

    public int getPantaloneUomo() {
        return pantaloneUomo;
    }

    public void setPantaloneUomo(int pantaloneUomo) {
        this.pantaloneUomo = pantaloneUomo;
    }

    public int getPantalonePelle() {
        return pantalonePelle;
    }

    public void setPantalonePelle(int pantalonePelle) {
        this.pantalonePelle = pantalonePelle;
    }

    public int getTutaDonna() {
        return tutaDonna;
    }

    public void setTutaDonna(int tutaDonna) {
        this.tutaDonna = tutaDonna;
    }

    private int tutaDonna;

    public DAOUser getPantaloniUtente() {
        return pantaloniUtente;
    }

    public void setPantaloniUtente(DAOUser pantaloniUtente) {
        this.pantaloniUtente = pantaloniUtente;
    }
}
