package gestionaleLavanderia.magistralThesis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;

	@Column
	private String lastname;

	@Column
	private String number;

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