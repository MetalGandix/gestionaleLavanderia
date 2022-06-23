package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "trapunte_e_piumoni")

public class TrapunteEPiumoni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String coperta1PiazzaLana;

    @Column
    private String coperta2PiazzeLana;

    @Column
    private String copertaBambino;

    @Column
    private String copertaUncinetto;

    @Column
    private String prematerasso;

    @Column
    private String cuscinoPiuma;

    @Column
    private String cuscinoSintetico;

    @Column
    private String federe;

    @Column
    private String lenzuola1Piazza;

    @Column
    private String leunzuolo2Piazze;

    @Column
    private String merinos2Piazze;

    @Column
    private String piumone1PiazzaOca;

    @Column
    private String piumone1PSintetico;

    @Column
    private String piumone2PiazzeOca;

    @Column
    private String piumone2PSintetico;

    @Column
    private String saccoAPelo1Piazza;

    @Column
    private String saccoAPelo2Piazze;

    @Column
    private String trapunta1Piazza;

    @Column
    private String trapunta2Piazze;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DAOUser trapunteEPiumoniUtente;

    public DAOUser getTrapunteEPiumoniUtente() {
        return trapunteEPiumoniUtente;
    }

    public void setTrapunteEPiumoniUtente(DAOUser trapunteEPiumoniUtente) {
        this.trapunteEPiumoniUtente = trapunteEPiumoniUtente;
    }

    public long getId() {
        return id;
    }

    public String getCoperta1PiazzaLana() {
        return coperta1PiazzaLana;
    }

    public void setCoperta1PiazzaLana(String coperta1PiazzaLana) {
        this.coperta1PiazzaLana = coperta1PiazzaLana;
    }

    public String getCoperta2PiazzeLana() {
        return coperta2PiazzeLana;
    }

    public void setCoperta2PiazzeLana(String coperta2PiazzeLana) {
        this.coperta2PiazzeLana = coperta2PiazzeLana;
    }

    public String getCopertaBambino() {
        return copertaBambino;
    }

    public void setCopertaBambino(String copertaBambino) {
        this.copertaBambino = copertaBambino;
    }

    public String getCopertaUncinetto() {
        return copertaUncinetto;
    }

    public void setCopertaUncinetto(String copertaUncinetto) {
        this.copertaUncinetto = copertaUncinetto;
    }

    public String getPrematerasso() {
        return prematerasso;
    }

    public void setPrematerasso(String prematerasso) {
        this.prematerasso = prematerasso;
    }

    public String getCuscinoPiuma() {
        return cuscinoPiuma;
    }

    public void setCuscinoPiuma(String cuscinoPiuma) {
        this.cuscinoPiuma = cuscinoPiuma;
    }

    public String getCuscinoSintetico() {
        return cuscinoSintetico;
    }

    public void setCuscinoSintetico(String cuscinoSintetico) {
        this.cuscinoSintetico = cuscinoSintetico;
    }

    public String getFedere() {
        return federe;
    }

    public void setFedere(String federe) {
        this.federe = federe;
    }

    public String getLenzuola1Piazza() {
        return lenzuola1Piazza;
    }

    public void setLenzuola1Piazza(String lenzuola1Piazza) {
        this.lenzuola1Piazza = lenzuola1Piazza;
    }

    public String getLeunzuolo2Piazze() {
        return leunzuolo2Piazze;
    }

    public void setLeunzuolo2Piazze(String leunzuolo2Piazze) {
        this.leunzuolo2Piazze = leunzuolo2Piazze;
    }

    public String getMerinos2Piazze() {
        return merinos2Piazze;
    }

    public void setMerinos2Piazze(String merinos2Piazze) {
        this.merinos2Piazze = merinos2Piazze;
    }

    public String getPiumone1PiazzaOca() {
        return piumone1PiazzaOca;
    }

    public void setPiumone1PiazzaOca(String piumone1PiazzaOca) {
        this.piumone1PiazzaOca = piumone1PiazzaOca;
    }

    public String getPiumone1PSintetico() {
        return piumone1PSintetico;
    }

    public void setPiumone1PSintetico(String piumone1pSintetico) {
        piumone1PSintetico = piumone1pSintetico;
    }

    public String getPiumone2PiazzeOca() {
        return piumone2PiazzeOca;
    }

    public void setPiumone2PiazzeOca(String piumone2PiazzeOca) {
        this.piumone2PiazzeOca = piumone2PiazzeOca;
    }

    public String getPiumone2PSintetico() {
        return piumone2PSintetico;
    }

    public void setPiumone2PSintetico(String piumone2pSintetico) {
        piumone2PSintetico = piumone2pSintetico;
    }

    public String getSaccoAPelo1Piazza() {
        return saccoAPelo1Piazza;
    }

    public void setSaccoAPelo1Piazza(String saccoAPelo1Piazza) {
        this.saccoAPelo1Piazza = saccoAPelo1Piazza;
    }

    public String getSaccoAPelo2Piazze() {
        return saccoAPelo2Piazze;
    }

    public void setSaccoAPelo2Piazze(String saccoAPelo2Piazze) {
        this.saccoAPelo2Piazze = saccoAPelo2Piazze;
    }

    public String getTrapunta1Piazza() {
        return trapunta1Piazza;
    }

    public void setTrapunta1Piazza(String trapunta1Piazza) {
        this.trapunta1Piazza = trapunta1Piazza;
    }

    public String getTrapunta2Piazze() {
        return trapunta2Piazze;
    }

    public void setTrapunta2Piazze(String trapunta2Piazze) {
        this.trapunta2Piazze = trapunta2Piazze;
    }

}
