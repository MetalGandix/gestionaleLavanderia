package gestionaleLavanderia.magistralThesis.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class DAOUser implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String lastname;

	@Column
	private String number;

	@Column
	private String email;

	@Column
	private String sesso;

	@Column 
	private String codiceFiscale;

	@Column 
	private String presentatoDa;

	@Column 
	private String numeroCard;

	@Column 
	private String scontoCard;

	@Column 
	private String cap;

	@Column 
	private String citta;

	@Column 
	private String regioneSociale;

	@Column 
	private String indirizzo;

	@Column 
	private String provincia;

	@Column 
    private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getPresentatoDa() {
		return presentatoDa;
	}

	public void setPresentatoDa(String presentatoDa) {
		this.presentatoDa = presentatoDa;
	}

	public String getNumeroCard() {
		return numeroCard;
	}

	public void setNumeroCard(String numeroCard) {
		this.numeroCard = numeroCard;
	}

	public String getScontoCard() {
		return scontoCard;
	}

	public void setScontoCard(String scontoCard) {
		this.scontoCard = scontoCard;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getRegioneSociale() {
		return regioneSociale;
	}

	public void setRegioneSociale(String regioneSociale) {
		this.regioneSociale = regioneSociale;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}