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

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public long getId() {
		return this.id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(final String lastname) {
		this.lastname = lastname;
	}

}