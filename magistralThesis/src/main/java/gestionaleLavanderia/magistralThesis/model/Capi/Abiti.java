package gestionaleLavanderia.magistralThesis.model.Capi;
import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "abiti")
public class Abiti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int abitoDonnaSerale;

    @Column
    private int abitoDonna;

    @Column
    private int abitoLungo;

    @Column
    private int abitoPizzo;

    @Column
    private int abitoSposa;

    @Column
    private int abitoUomo;

    @Column
    private int cravatta;

    @Column
    private int divisaPoliziaLocale;

    @Column
    private int divisaCarabiniere;

    @Column
    private int divisaFinanza;

    @Column
    private int divisaPolizia;

    @Column
    private int giletUomo;

    @Column
    private int tailleurGonna;

    @Column
    private int tailleurPantaloni;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser abitiUtente;

    public long getId() {
        return id;
    }

    public int getAbitoDonnaSerale() {
        return abitoDonnaSerale;
    }

    public void setAbitoDonnaSerale(int abitoDonnaSerale) {
        this.abitoDonnaSerale = abitoDonnaSerale;
    }

    public int getAbitoDonna() {
        return abitoDonna;
    }

    public void setAbitoDonna(int abitoDonna) {
        this.abitoDonna = abitoDonna;
    }

    public int getAbitoLungo() {
        return abitoLungo;
    }

    public void setAbitoLungo(int abitoLungo) {
        this.abitoLungo = abitoLungo;
    }

    public int getAbitoPizzo() {
        return abitoPizzo;
    }

    public void setAbitoPizzo(int abitoPizzo) {
        this.abitoPizzo = abitoPizzo;
    }

    public int getAbitoSposa() {
        return abitoSposa;
    }

    public void setAbitoSposa(int abitoSposa) {
        this.abitoSposa = abitoSposa;
    }

    public int getAbitoUomo() {
        return abitoUomo;
    }

    public void setAbitoUomo(int abitoUomo) {
        this.abitoUomo = abitoUomo;
    }

    public int getCravatta() {
        return cravatta;
    }

    public void setCravatta(int cravatta) {
        this.cravatta = cravatta;
    }

    public int getDivisaPoliziaLocale() {
        return divisaPoliziaLocale;
    }

    public void setDivisaPoliziaLocale(int divisaPoliziaLocale) {
        this.divisaPoliziaLocale = divisaPoliziaLocale;
    }

    public int getDivisaCarabiniere() {
        return divisaCarabiniere;
    }

    public void setDivisaCarabiniere(int divisaCarabiniere) {
        this.divisaCarabiniere = divisaCarabiniere;
    }

    public int getDivisaFinanza() {
        return divisaFinanza;
    }

    public void setDivisaFinanza(int divisaFinanza) {
        this.divisaFinanza = divisaFinanza;
    }

    public int getDivisaPolizia() {
        return divisaPolizia;
    }

    public void setDivisaPolizia(int divisaPolizia) {
        this.divisaPolizia = divisaPolizia;
    }

    public int getGiletUomo() {
        return giletUomo;
    }

    public void setGiletUomo(int giletUomo) {
        this.giletUomo = giletUomo;
    }

    public int getTailleurGonna() {
        return tailleurGonna;
    }

    public void setTailleurGonna(int tailleurGonna) {
        this.tailleurGonna = tailleurGonna;
    }

    public int getTailleurPantaloni() {
        return tailleurPantaloni;
    }

    public void setTailleurPantaloni(int tailleurPantaloni) {
        this.tailleurPantaloni = tailleurPantaloni;
    }

    public DAOUser getAbitiUtente() {
        return abitiUtente;
    }

    public void setAbitiUtente(DAOUser abitiUtente) {
        this.abitiUtente = abitiUtente;
    }
}
