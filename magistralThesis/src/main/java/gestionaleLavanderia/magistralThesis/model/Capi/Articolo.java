package gestionaleLavanderia.magistralThesis.model.Capi;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

@Entity
@Table(name = "articolo")
public class Articolo {
    @Id
    @SequenceGenerator(name="mysequence", initialValue=1000)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mysequence")
    public long id;
    @Column
    public int abitoDonnaSerale;
    @Column
    public int abitoDonna;
    @Column
    public int abitoLungo;
    @Column
    public int abitoPizzo;
    @Column
    public int abitoSposa;
    @Column
    public int abitoUomo;
    @Column
    public int cravatta;
    @Column
    public int divisaPoliziaLocale;
    @Column
    public int divisaCarabiniere;
    @Column
    public int divisaFinanza;
    @Column
    public int divisaPolizia;
    @Column
    public int giletUomo;
    @Column
    public int tailleurGonna;
    @Column
    public int tailleurPantaloni;
    @Column
    public int camiciaBimbo;
    @Column
    public int camiciaCerimonia;
    @Column
    public int camiciaDonna;
    @Column
    public int camiciaJeans;
    @Column
    public int camiciaPelle;
    @Column
    public int camiciaPiegata;
    @Column
    public int camiciaSetaDonna;
    @Column
    public int camiciaSetaUomo;
    @Column
    public int camiciaSoloStiro;
    @Column
    public int camiciaUomo;
    @Column
    public int berretto;
    @Column
    public int cappello;
    @Column
    public int cappelloPelle;
    @Column
    public int cappottoBimbo;
    @Column
    public int cappottoDonna;
    @Column
    public int cappottoUnisex;
    @Column
    public int cappottoUomo;
    @Column
    public int giaccaDonna;
    @Column
    public int giaccaUomo;
    @Column
    public int giacconeCortoDonna;
    @Column
    public int giacconeCortoUomo;
    @Column
    public int giacconeCotone;
    @Column
    public int giacconeLungoDonna;
    @Column
    public int giacconeLungoUomo;
    @Column
    public int giacconeUnisex;
    @Column
    public int giubbetto;
    @Column
    public int giubbettoJeans;
    @Column
    public int giubbinoEstivoUnisex;
    @Column
    public int impermeabileUnisex;
    @Column
    public int internoGiaccone;
    @Column
    public int montone;
    @Column
    public int pellicciaSintetica;
    @Column
    public int piumino7_8Donna;
    @Column
    public int piumino7_8Uomo;
    @Column
    public int piuminoCortoDonna;
    @Column
    public int piuminoCortoUomo;
    @Column
    public int piuminoLungoDonna;
    @Column
    public int piuminoLungoUomo;
    @Column
    public int soprabito;
    @Column
    public int tranch;
    @Column
    public int woolrich;
    @Column
    public int gonna;
    @Column
    public int gonnaJeans;
    @Column
    public int gonnaPelle;
    @Column
    public int gonnaPieghe;
    @Column
    public int babyDol;
    @Column
    public int cardigan;
    @Column
    public int felpa;
    @Column
    public int magliaBimbo;
    @Column
    public int magliaDonna;
    @Column
    public int magliaUomo;
    @Column
    public int maglioneCotone;
    @Column
    public int maglioneLana;
    @Column
    public int tShirt;
    @Column
    public int tShirtColorata;
    @Column
    public int pantaloneDivisa;
    @Column
    public int pantaloneDonna;
    @Column
    public int pantaloneSoloStiro;
    @Column
    public int pantaloneUomo;
    @Column
    public int pantalonePelle;
    @Column
    public int vestaglia;
    @Column
    public int ciabatte;
    @Column
    public int clark;
    @Column
    public int converse;
    @Column
    public int hogan;
    @Column
    public int nike;
    @Column
    public int scarpeDaGinnastica;
    @Column
    public int scarponcini;
    @Column
    public int impermeabili;
    @Column
    public int timberland;
    @Column
    public int tappeto;
    @Column
    public int calateTenda;
    @Column
    public int mantovana;
    @Column
    public int tenda;
    @Column
    public int tendaCampeggio;
    @Column
    public int coperta1PiazzaLana;
    @Column
    public int coperta2PiazzeLana;
    @Column
    public int copertaBambino;
    @Column
    public int copertaUncinetto;
    @Column
    public int coprimaterasso;
    @Column
    public int cuscinoPiuma;
    @Column
    public int cuscinoSintetico;
    @Column
    public int federe;
    @Column
    public int lenzuola1Piazza;
    @Column
    public int leunzuolo2Piazze;
    @Column
    public int merinos2Piazze;
    @Column
    public int piumone1PiazzaOca;
    @Column
    public int piumone1PSintetico;
    @Column
    public int piumone2PiazzeOca;
    @Column
    public int piumone2PSintetico;
    @Column
    public int saccoAPelo1Piazza;
    @Column
    public int saccoAPelo2Piazze;
    @Column
    public int trapunta1Piazza;
    @Column
    public int trapunta2Piazze;
    @Column
    public int accappatoi;
    @Column
    public int accessori;
    @Column
    public int bambolaStoffa;
    @Column
    public int borsa;
    @Column
    public int calzini;
    @Column
    public int canottaUnisex;
    @Column
    public int capoConRiporti;
    @Column
    public int cinturaDiPelle;
    @Column
    public int cinturaDiStoffa;
    @Column
    public int copriDivano;
    @Column
    public int copriPoltrona;
    @Column
    public int copriSedia;
    @Column
    public int doppioPetto;
    @Column
    public int foulard;
    @Column
    public int giccaPelle;
    @Column
    public int giletConTasche;
    @Column
    public int giletDiPelle;
    @Column
    public int guantiLana;
    @Column
    public int guantiPelle;
    @Column
    public int guantiUomo;
    @Column
    public int pigiamaBimbo;
    @Column
    public int scarponcino;
    @Column
    public int sciarpa;
    @Column
    public int sciarpaBambino;
    @Column
    public int sciarpaDiCotone;
    @Column
    public int sciarpaDiSeta;
    @Column
    public int tovagliaRettangolare;
    @Column
    public int tovagliaRotonda;
    @Column
    public int tutaSciBimbo;
    @Column 
    public int tutaSciAdulto;
    @Column
    public String servizio;
    @Column
    public double prezzo;
    @Column
    public boolean pronto = false;
    @Column
    public boolean consegnato = false;
    @Column
    public String note;
	@Column 
    public LocalDate date;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    public DAOUser articoliUtente;

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }

    public boolean isConsegnato() {
        return consegnato;
    }

    public void setConsegnato(boolean consegnato) {
        this.consegnato = consegnato;
    }

    public String getServizio() {
        return servizio;
    }

    public void setServizio(String servizio) {
        this.servizio = servizio;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

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

    public int getCamiciaBimbo() {
        return camiciaBimbo;
    }

    public void setCamiciaBimbo(int camiciaBimbo) {
        this.camiciaBimbo = camiciaBimbo;
    }

    public int getCamiciaCerimonia() {
        return camiciaCerimonia;
    }

    public void setCamiciaCerimonia(int camiciaCerimonia) {
        this.camiciaCerimonia = camiciaCerimonia;
    }

    public int getCamiciaDonna() {
        return camiciaDonna;
    }

    public void setCamiciaDonna(int camiciaDonna) {
        this.camiciaDonna = camiciaDonna;
    }

    public int getCamiciaJeans() {
        return camiciaJeans;
    }

    public void setCamiciaJeans(int camiciaJeans) {
        this.camiciaJeans = camiciaJeans;
    }

    public int getCamiciaPelle() {
        return camiciaPelle;
    }

    public void setCamiciaPelle(int camiciaPelle) {
        this.camiciaPelle = camiciaPelle;
    }

    public int getCamiciaPiegata() {
        return camiciaPiegata;
    }

    public void setCamiciaPiegata(int camiciaPiegata) {
        this.camiciaPiegata = camiciaPiegata;
    }

    public int getCamiciaSetaDonna() {
        return camiciaSetaDonna;
    }

    public void setCamiciaSetaDonna(int camiciaSetaDonna) {
        this.camiciaSetaDonna = camiciaSetaDonna;
    }

    public int getCamiciaSetaUomo() {
        return camiciaSetaUomo;
    }

    public void setCamiciaSetaUomo(int camiciaSetaUomo) {
        this.camiciaSetaUomo = camiciaSetaUomo;
    }

    public int getCamiciaSoloStiro() {
        return camiciaSoloStiro;
    }

    public void setCamiciaSoloStiro(int camiciaSoloStiro) {
        this.camiciaSoloStiro = camiciaSoloStiro;
    }

    public int getCamiciaUomo() {
        return camiciaUomo;
    }

    public void setCamiciaUomo(int camiciaUomo) {
        this.camiciaUomo = camiciaUomo;
    }

    public int getBerretto() {
        return berretto;
    }

    public void setBerretto(int berretto) {
        this.berretto = berretto;
    }

    public int getCappello() {
        return cappello;
    }

    public void setCappello(int cappello) {
        this.cappello = cappello;
    }

    public int getCappelloPelle() {
        return cappelloPelle;
    }

    public void setCappelloPelle(int cappelloPelle) {
        this.cappelloPelle = cappelloPelle;
    }

    public int getCappottoBimbo() {
        return cappottoBimbo;
    }

    public void setCappottoBimbo(int cappottoBimbo) {
        this.cappottoBimbo = cappottoBimbo;
    }

    public int getCappottoDonna() {
        return cappottoDonna;
    }

    public void setCappottoDonna(int cappottoDonna) {
        this.cappottoDonna = cappottoDonna;
    }

    public int getCappottoUnisex() {
        return cappottoUnisex;
    }

    public void setCappottoUnisex(int cappottoUnisex) {
        this.cappottoUnisex = cappottoUnisex;
    }

    public int getCappottoUomo() {
        return cappottoUomo;
    }

    public void setCappottoUomo(int cappottoUomo) {
        this.cappottoUomo = cappottoUomo;
    }

    public int getGiaccaDonna() {
        return giaccaDonna;
    }

    public void setGiaccaDonna(int giaccaDonna) {
        this.giaccaDonna = giaccaDonna;
    }

    public int getGiaccaUomo() {
        return giaccaUomo;
    }

    public void setGiaccaUomo(int giaccaUomo) {
        this.giaccaUomo = giaccaUomo;
    }

    public int getGiacconeCortoDonna() {
        return giacconeCortoDonna;
    }

    public void setGiacconeCortoDonna(int giacconeCortoDonna) {
        this.giacconeCortoDonna = giacconeCortoDonna;
    }

    public int getGiacconeCortoUomo() {
        return giacconeCortoUomo;
    }

    public void setGiacconeCortoUomo(int giacconeCortoUomo) {
        this.giacconeCortoUomo = giacconeCortoUomo;
    }

    public int getGiacconeCotone() {
        return giacconeCotone;
    }

    public void setGiacconeCotone(int giacconeCotone) {
        this.giacconeCotone = giacconeCotone;
    }

    public int getGiacconeLungoDonna() {
        return giacconeLungoDonna;
    }

    public void setGiacconeLungoDonna(int giacconeLungoDonna) {
        this.giacconeLungoDonna = giacconeLungoDonna;
    }

    public int getGiacconeLungoUomo() {
        return giacconeLungoUomo;
    }

    public void setGiacconeLungoUomo(int giacconeLungoUomo) {
        this.giacconeLungoUomo = giacconeLungoUomo;
    }

    public int getGiacconeUnisex() {
        return giacconeUnisex;
    }

    public void setGiacconeUnisex(int giacconeUnisex) {
        this.giacconeUnisex = giacconeUnisex;
    }

    public int getGiubbetto() {
        return giubbetto;
    }

    public void setGiubbetto(int giubbetto) {
        this.giubbetto = giubbetto;
    }

    public int getGiubbettoJeans() {
        return giubbettoJeans;
    }

    public void setGiubbettoJeans(int giubbettoJeans) {
        this.giubbettoJeans = giubbettoJeans;
    }

    public int getGiubbinoEstivoUnisex() {
        return giubbinoEstivoUnisex;
    }

    public void setGiubbinoEstivoUnisex(int giubbinoEstivoUnisex) {
        this.giubbinoEstivoUnisex = giubbinoEstivoUnisex;
    }

    public int getImpermeabileUnisex() {
        return impermeabileUnisex;
    }

    public void setImpermeabileUnisex(int impermeabileUnisex) {
        this.impermeabileUnisex = impermeabileUnisex;
    }

    public int getInternoGiaccone() {
        return internoGiaccone;
    }

    public void setInternoGiaccone(int internoGiaccone) {
        this.internoGiaccone = internoGiaccone;
    }

    public int getMontone() {
        return montone;
    }

    public void setMontone(int montone) {
        this.montone = montone;
    }

    public int getPellicciaSintetica() {
        return pellicciaSintetica;
    }

    public void setPellicciaSintetica(int pellicciaSintetica) {
        this.pellicciaSintetica = pellicciaSintetica;
    }

    public int getPiumino7_8Donna() {
        return piumino7_8Donna;
    }

    public void setPiumino7_8Donna(int piumino7_8Donna) {
        this.piumino7_8Donna = piumino7_8Donna;
    }

    public int getPiumino7_8Uomo() {
        return piumino7_8Uomo;
    }

    public void setPiumino7_8Uomo(int piumino7_8Uomo) {
        this.piumino7_8Uomo = piumino7_8Uomo;
    }

    public int getPiuminoCortoDonna() {
        return piuminoCortoDonna;
    }

    public void setPiuminoCortoDonna(int piuminoCortoDonna) {
        this.piuminoCortoDonna = piuminoCortoDonna;
    }

    public int getPiuminoCortoUomo() {
        return piuminoCortoUomo;
    }

    public void setPiuminoCortoUomo(int piuminoCortoUomo) {
        this.piuminoCortoUomo = piuminoCortoUomo;
    }

    public int getPiuminoLungoDonna() {
        return piuminoLungoDonna;
    }

    public void setPiuminoLungoDonna(int piuminoLungoDonna) {
        this.piuminoLungoDonna = piuminoLungoDonna;
    }

    public int getPiuminoLungoUomo() {
        return piuminoLungoUomo;
    }

    public void setPiuminoLungoUomo(int piuminoLungoUomo) {
        this.piuminoLungoUomo = piuminoLungoUomo;
    }

    public int getSoprabito() {
        return soprabito;
    }

    public void setSoprabito(int soprabito) {
        this.soprabito = soprabito;
    }

    public int getTranch() {
        return tranch;
    }

    public void setTranch(int tranch) {
        this.tranch = tranch;
    }

    public int getWoolrich() {
        return woolrich;
    }

    public void setWoolrich(int woolrich) {
        this.woolrich = woolrich;
    }

    public int getGonna() {
        return gonna;
    }

    public void setGonna(int gonna) {
        this.gonna = gonna;
    }

    public int getGonnaJeans() {
        return gonnaJeans;
    }

    public void setGonnaJeans(int gonnaJeans) {
        this.gonnaJeans = gonnaJeans;
    }

    public int getGonnaPelle() {
        return gonnaPelle;
    }

    public void setGonnaPelle(int gonnaPelle) {
        this.gonnaPelle = gonnaPelle;
    }

    public int getGonnaPieghe() {
        return gonnaPieghe;
    }

    public void setGonnaPieghe(int gonnaPieghe) {
        this.gonnaPieghe = gonnaPieghe;
    }

    public int getBabyDol() {
        return babyDol;
    }

    public void setBabyDol(int babyDol) {
        this.babyDol = babyDol;
    }

    public int getCardigan() {
        return cardigan;
    }

    public void setCardigan(int cardigan) {
        this.cardigan = cardigan;
    }

    public int getFelpa() {
        return felpa;
    }

    public void setFelpa(int felpa) {
        this.felpa = felpa;
    }

    public int getMagliaBimbo() {
        return magliaBimbo;
    }

    public void setMagliaBimbo(int magliaBimbo) {
        this.magliaBimbo = magliaBimbo;
    }

    public int getMagliaDonna() {
        return magliaDonna;
    }

    public void setMagliaDonna(int magliaDonna) {
        this.magliaDonna = magliaDonna;
    }

    public int getMagliaUomo() {
        return magliaUomo;
    }

    public void setMagliaUomo(int magliaUomo) {
        this.magliaUomo = magliaUomo;
    }

    public int getMaglioneCotone() {
        return maglioneCotone;
    }

    public void setMaglioneCotone(int maglioneCotone) {
        this.maglioneCotone = maglioneCotone;
    }

    public int getMaglioneLana() {
        return maglioneLana;
    }

    public void setMaglioneLana(int maglioneLana) {
        this.maglioneLana = maglioneLana;
    }

    public int gettShirt() {
        return tShirt;
    }

    public void settShirt(int tShirt) {
        this.tShirt = tShirt;
    }

    public int gettShirtColorata() {
        return tShirtColorata;
    }

    public void settShirtColorata(int tShirtColorata) {
        this.tShirtColorata = tShirtColorata;
    }

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

    public int getVestaglia() {
        return vestaglia;
    }

    public void setVestaglia(int vestaglia) {
        this.vestaglia = vestaglia;
    }

    public int getCiabatte() {
        return ciabatte;
    }

    public void setCiabatte(int ciabatte) {
        this.ciabatte = ciabatte;
    }

    public int getClark() {
        return clark;
    }

    public void setClark(int clark) {
        this.clark = clark;
    }

    public int getConverse() {
        return converse;
    }

    public void setConverse(int converse) {
        this.converse = converse;
    }

    public int getHogan() {
        return hogan;
    }

    public void setHogan(int hogan) {
        this.hogan = hogan;
    }

    public int getNike() {
        return nike;
    }

    public void setNike(int nike) {
        this.nike = nike;
    }

    public int getScarpeDaGinnastica() {
        return scarpeDaGinnastica;
    }

    public void setScarpeDaGinnastica(int scarpeDaGinnastica) {
        this.scarpeDaGinnastica = scarpeDaGinnastica;
    }

    public int getScarponcini() {
        return scarponcini;
    }

    public void setScarponcini(int scarponcini) {
        this.scarponcini = scarponcini;
    }

    public int getImpermeabili() {
        return impermeabili;
    }

    public void setImpermeabili(int impermeabili) {
        this.impermeabili = impermeabili;
    }

    public int getTimberland() {
        return timberland;
    }

    public void setTimberland(int timberland) {
        this.timberland = timberland;
    }

    public int getTappeto() {
        return tappeto;
    }

    public void setTappeto(int tappeto) {
        this.tappeto = tappeto;
    }

    public int getCalateTenda() {
        return calateTenda;
    }

    public void setCalateTenda(int calateTenda) {
        this.calateTenda = calateTenda;
    }

    public int getMantovana() {
        return mantovana;
    }

    public void setMantovana(int mantovana) {
        this.mantovana = mantovana;
    }

    public int getTenda() {
        return tenda;
    }

    public void setTenda(int tenda) {
        this.tenda = tenda;
    }

    public int getTendaCampeggio() {
        return tendaCampeggio;
    }

    public void setTendaCampeggio(int tendaCampeggio) {
        this.tendaCampeggio = tendaCampeggio;
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

    public int getAccappatoi() {
        return accappatoi;
    }

    public void setAccappatoi(int accappatoi) {
        this.accappatoi = accappatoi;
    }

    public int getAccessori() {
        return accessori;
    }

    public void setAccessori(int accessori) {
        this.accessori = accessori;
    }

    public int getBambolaStoffa() {
        return bambolaStoffa;
    }

    public void setBambolaStoffa(int bambolaStoffa) {
        this.bambolaStoffa = bambolaStoffa;
    }

    public int getBorsa() {
        return borsa;
    }

    public void setBorsa(int borsa) {
        this.borsa = borsa;
    }

    public int getCalzini() {
        return calzini;
    }

    public void setCalzini(int calzini) {
        this.calzini = calzini;
    }

    public int getCanottaUnisex() {
        return canottaUnisex;
    }

    public void setCanottaUnisex(int canottaUnisex) {
        this.canottaUnisex = canottaUnisex;
    }

    public int getCapoConRiporti() {
        return capoConRiporti;
    }

    public void setCapoConRiporti(int capoConRiporti) {
        this.capoConRiporti = capoConRiporti;
    }

    public int getCinturaDiPelle() {
        return cinturaDiPelle;
    }

    public void setCinturaDiPelle(int cinturaDiPelle) {
        this.cinturaDiPelle = cinturaDiPelle;
    }

    public int getCinturaDiStoffa() {
        return cinturaDiStoffa;
    }

    public void setCinturaDiStoffa(int cinturaDiStoffa) {
        this.cinturaDiStoffa = cinturaDiStoffa;
    }

    public int getCopriDivano() {
        return copriDivano;
    }

    public void setCopriDivano(int copriDivano) {
        this.copriDivano = copriDivano;
    }

    public int getCopriPoltrona() {
        return copriPoltrona;
    }

    public void setCopriPoltrona(int copriPoltrona) {
        this.copriPoltrona = copriPoltrona;
    }

    public int getCopriSedia() {
        return copriSedia;
    }

    public void setCopriSedia(int copriSedia) {
        this.copriSedia = copriSedia;
    }

    public int getDoppioPetto() {
        return doppioPetto;
    }

    public void setDoppioPetto(int doppioPetto) {
        this.doppioPetto = doppioPetto;
    }

    public int getFoulard() {
        return foulard;
    }

    public void setFoulard(int foulard) {
        this.foulard = foulard;
    }

    public int getGiccaPelle() {
        return giccaPelle;
    }

    public void setGiccaPelle(int giccaPelle) {
        this.giccaPelle = giccaPelle;
    }

    public int getGiletConTasche() {
        return giletConTasche;
    }

    public void setGiletConTasche(int giletConTasche) {
        this.giletConTasche = giletConTasche;
    }

    public int getGiletDiPelle() {
        return giletDiPelle;
    }

    public void setGiletDiPelle(int giletDiPelle) {
        this.giletDiPelle = giletDiPelle;
    }

    public int getGuantiLana() {
        return guantiLana;
    }

    public void setGuantiLana(int guantiLana) {
        this.guantiLana = guantiLana;
    }

    public int getGuantiPelle() {
        return guantiPelle;
    }

    public void setGuantiPelle(int guantiPelle) {
        this.guantiPelle = guantiPelle;
    }

    public int getGuantiUomo() {
        return guantiUomo;
    }

    public void setGuantiUomo(int guantiUomo) {
        this.guantiUomo = guantiUomo;
    }

    public int getPigiamaBimbo() {
        return pigiamaBimbo;
    }

    public void setPigiamaBimbo(int pigiamaBimbo) {
        this.pigiamaBimbo = pigiamaBimbo;
    }

    public int getScarponcino() {
        return scarponcino;
    }

    public void setScarponcino(int scarponcino) {
        this.scarponcino = scarponcino;
    }

    public int getSciarpa() {
        return sciarpa;
    }

    public void setSciarpa(int sciarpa) {
        this.sciarpa = sciarpa;
    }

    public int getSciarpaBambino() {
        return sciarpaBambino;
    }

    public void setSciarpaBambino(int sciarpaBambino) {
        this.sciarpaBambino = sciarpaBambino;
    }

    public int getSciarpaDiCotone() {
        return sciarpaDiCotone;
    }

    public void setSciarpaDiCotone(int sciarpaDiCotone) {
        this.sciarpaDiCotone = sciarpaDiCotone;
    }

    public int getSciarpaDiSeta() {
        return sciarpaDiSeta;
    }

    public void setSciarpaDiSeta(int sciarpaDiSeta) {
        this.sciarpaDiSeta = sciarpaDiSeta;
    }

    public int getTovagliaRettangolare() {
        return tovagliaRettangolare;
    }

    public void setTovagliaRettangolare(int tovagliaRettangolare) {
        this.tovagliaRettangolare = tovagliaRettangolare;
    }

    public int getTovagliaRotonda() {
        return tovagliaRotonda;
    }

    public void setTovagliaRotonda(int tovagliaRotonda) {
        this.tovagliaRotonda = tovagliaRotonda;
    }

    public int getTutaSciBimbo() {
        return tutaSciBimbo;
    }

    public void setTutaSciBimbo(int tutaSciBimbo) {
        this.tutaSciBimbo = tutaSciBimbo;
    }

    public int getTutaSciAdulto() {
        return tutaSciAdulto;
    }

    public void setTutaSciAdulto(int tutaSciAdulto) {
        this.tutaSciAdulto = tutaSciAdulto;
    }

    public DAOUser getArticoliUtente() {
        return articoliUtente;
    }

    public void setArticoliUtente(DAOUser articoliUtente) {
        this.articoliUtente = articoliUtente;
    }
}
