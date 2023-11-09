package entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;


/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity
public class Etudiant extends User implements Serializable {

	
	private String cne;
	private String firstName;
	private String lastName;
	
	@OneToMany
	private List<Filiere> filiere = new ArrayList<>();

	public Etudiant() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	
   
}
