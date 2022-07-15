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
    private int coperta1PiazzaLana;

    @Column
    private int coperta2PiazzeLana;

    @Column
    private int copertaBambino;

    @Column
    private int copertaUncinetto;

    @Column
    private int coprimaterasso;

    @Column
    private int cuscinoPiuma;

    @Column
    private int cuscinoSintetico;

    @Column
    private int federe;

    @Column
    private int lenzuola1Piazza;

    @Column
    private int leunzuolo2Piazze;

    @Column
    private int merinos2Piazze;

    @Column
    private int piumone1PiazzaOca;

    @Column
    private int piumone1PSintetico;

    @Column
    private int piumone2PiazzeOca;

    @Column
    private int piumone2PSintetico;

    @Column
    private int saccoAPelo1Piazza;

    @Column
    private int saccoAPelo2Piazze;

    @Column
    private int trapunta1Piazza;

    @Column
    private int trapunta2Piazze;

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

    public int getCoperta1PiazzaLana() {
        return coperta1PiazzaLana;
    }

    public void setCoperta1PiazzaLana(int coperta1PiazzaLana) {
        this.coperta1PiazzaLana = coperta1PiazzaLana;
    }

    public int getCoperta2PiazzeLana() {
        return coperta2PiazzeLana;
    }

    public void setCoperta2PiazzeLana(int coperta2PiazzeLana) {
        this.coperta2PiazzeLana = coperta2PiazzeLana;
    }

    public int getCopertaBambino() {
        return copertaBambino;
    }

    public void setCopertaBambino(int copertaBambino) {
        this.copertaBambino = copertaBambino;
    }

    public int getCopertaUncinetto() {
        return copertaUncinetto;
    }

    public void setCopertaUncinetto(int copertaUncinetto) {
        this.copertaUncinetto = copertaUncinetto;
    }

    public int getCoprimaterasso() {
        return coprimaterasso;
    }

    public void setCoprimaterasso(int coprimaterasso) {
        this.coprimaterasso = coprimaterasso;
    }

    public int getCuscinoPiuma() {
        return cuscinoPiuma;
    }

    public void setCuscinoPiuma(int cuscinoPiuma) {
        this.cuscinoPiuma = cuscinoPiuma;
    }

    public int getCuscinoSintetico() {
        return cuscinoSintetico;
    }

    public void setCuscinoSintetico(int cuscinoSintetico) {
        this.cuscinoSintetico = cuscinoSintetico;
    }

    public int getFedere() {
        return federe;
    }

    public void setFedere(int federe) {
        this.federe = federe;
    }

    public int getLenzuola1Piazza() {
        return lenzuola1Piazza;
    }

    public void setLenzuola1Piazza(int lenzuola1Piazza) {
        this.lenzuola1Piazza = lenzuola1Piazza;
    }

    public int getLeunzuolo2Piazze() {
        return leunzuolo2Piazze;
    }

    public void setLeunzuolo2Piazze(int leunzuolo2Piazze) {
        this.leunzuolo2Piazze = leunzuolo2Piazze;
    }

    public int getMerinos2Piazze() {
        return merinos2Piazze;
    }

    public void setMerinos2Piazze(int merinos2Piazze) {
        this.merinos2Piazze = merinos2Piazze;
    }

    public int getPiumone1PiazzaOca() {
        return piumone1PiazzaOca;
    }

    public void setPiumone1PiazzaOca(int piumone1PiazzaOca) {
        this.piumone1PiazzaOca = piumone1PiazzaOca;
    }

    public int getPiumone1PSintetico() {
        return piumone1PSintetico;
    }

    public void setPiumone1PSintetico(int piumone1pSintetico) {
        piumone1PSintetico = piumone1pSintetico;
    }

    public int getPiumone2PiazzeOca() {
        return piumone2PiazzeOca;
    }

    public void setPiumone2PiazzeOca(int piumone2PiazzeOca) {
        this.piumone2PiazzeOca = piumone2PiazzeOca;
    }

    public int getPiumone2PSintetico() {
        return piumone2PSintetico;
    }

    public void setPiumone2PSintetico(int piumone2pSintetico) {
        piumone2PSintetico = piumone2pSintetico;
    }

    public int getSaccoAPelo1Piazza() {
        return saccoAPelo1Piazza;
    }

    public void setSaccoAPelo1Piazza(int saccoAPelo1Piazza) {
        this.saccoAPelo1Piazza = saccoAPelo1Piazza;
    }

    public int getSaccoAPelo2Piazze() {
        return saccoAPelo2Piazze;
    }

    public void setSaccoAPelo2Piazze(int saccoAPelo2Piazze) {
        this.saccoAPelo2Piazze = saccoAPelo2Piazze;
    }

    public int getTrapunta1Piazza() {
        return trapunta1Piazza;
    }

    public void setTrapunta1Piazza(int trapunta1Piazza) {
        this.trapunta1Piazza = trapunta1Piazza;
    }

    public int getTrapunta2Piazze() {
        return trapunta2Piazze;
    }

    public void setTrapunta2Piazze(int trapunta2Piazze) {
        this.trapunta2Piazze = trapunta2Piazze;
    }

}
