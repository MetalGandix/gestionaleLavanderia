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
    private String abitoDonnaSerale;

    @Column
    private String abitoDonna;

    @Column
    private String abitoLungo;

    @Column
    private String abitoPizzo;

    @Column
    private String abitoSposa;

    @Column
    private String abitoUomo;

    @Column
    private String cravatta;

    @Column
    private String divisaPoliziaLocale;

    @Column
    private String divisaCarabiniere;

    @Column
    private String divisaFinanza;

    @Column
    private String divisaPolizia;

    @Column
    private String giletUomo;

    @Column
    private String tailleurGonna;

    @Column
    private String tailleurPantaloni;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser abitiUtente;

    public long getId() {
        return id;
    }

    public String getAbitoDonnaSerale() {
        return abitoDonnaSerale;
    }

    public void setAbitoDonnaSerale(String abitoDonnaSerale) {
        this.abitoDonnaSerale = abitoDonnaSerale;
    }

    public String getAbitoDonna() {
        return abitoDonna;
    }

    public void setAbitoDonna(String abitoDonna) {
        this.abitoDonna = abitoDonna;
    }

    public String getAbitoLungo() {
        return abitoLungo;
    }

    public void setAbitoLungo(String abitoLungo) {
        this.abitoLungo = abitoLungo;
    }

    public String getAbitoPizzo() {
        return abitoPizzo;
    }

    public void setAbitoPizzo(String abitoPizzo) {
        this.abitoPizzo = abitoPizzo;
    }

    public String getAbitoSposa() {
        return abitoSposa;
    }

    public void setAbitoSposa(String abitoSposa) {
        this.abitoSposa = abitoSposa;
    }

    public String getAbitoUomo() {
        return abitoUomo;
    }

    public void setAbitoUomo(String abitoUomo) {
        this.abitoUomo = abitoUomo;
    }

    public String getCravatta() {
        return cravatta;
    }

    public void setCravatta(String cravatta) {
        this.cravatta = cravatta;
    }

    public String getDivisaPoliziaLocale() {
        return divisaPoliziaLocale;
    }

    public void setDivisaPoliziaLocale(String divisaPoliziaLocale) {
        this.divisaPoliziaLocale = divisaPoliziaLocale;
    }

    public String getDivisaCarabiniere() {
        return divisaCarabiniere;
    }

    public void setDivisaCarabiniere(String divisaCarabiniere) {
        this.divisaCarabiniere = divisaCarabiniere;
    }

    public String getDivisaFinanza() {
        return divisaFinanza;
    }

    public void setDivisaFinanza(String divisaFinanza) {
        this.divisaFinanza = divisaFinanza;
    }

    public String getDivisaPolizia() {
        return divisaPolizia;
    }

    public void setDivisaPolizia(String divisaPolizia) {
        this.divisaPolizia = divisaPolizia;
    }

    public String getGiletUomo() {
        return giletUomo;
    }

    public void setGiletUomo(String giletUomo) {
        this.giletUomo = giletUomo;
    }

    public String getTailleurGonna() {
        return tailleurGonna;
    }

    public void setTailleurGonna(String tailleurGonna) {
        this.tailleurGonna = tailleurGonna;
    }

    public String getTailleurPantaloni() {
        return tailleurPantaloni;
    }

    public void setTailleurPantaloni(String tailleurPantaloni) {
        this.tailleurPantaloni = tailleurPantaloni;
    }

    public DAOUser getAbitiUtente() {
        return abitiUtente;
    }

    public void setAbitiUtente(DAOUser abitiUtente) {
        this.abitiUtente = abitiUtente;
    }
}
