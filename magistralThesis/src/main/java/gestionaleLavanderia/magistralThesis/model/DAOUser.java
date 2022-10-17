package gestionaleLavanderia.magistralThesis.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class DAOUser implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String number;
	
	@Column
	private String username;

	@Column
	private String lastname;

	@Column
	private String email;

	@Column
	private String sesso;

	@Column 
	private String indirizzo;

	@Column 
	private Integer lastPaidEthMonth = 0;

	@Column 
	private Boolean paidMonth = false;

	@Column 
	private String cryptoAddress;
	
	public String getCryptoAddress() {
		return cryptoAddress;
	}

	public void setCryptoAddress(String cryptoAddress) {
		this.cryptoAddress = cryptoAddress;
	}

	public Integer getLastPaidEthMonth() {
		return lastPaidEthMonth;
	}

	public void setLastPaidEthMonth(Integer lastPaidEthMonth) {
		this.lastPaidEthMonth = lastPaidEthMonth;
	}


	public Boolean isPaidMonth() {
		return paidMonth;
	}

	public void setPaidMonth(Boolean paidMonth) {
		this.paidMonth = paidMonth;
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
}