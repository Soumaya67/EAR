package entities;

import java.io.Serializable;

import jakarta.persistence.Entity;

@Entity
public class Role implements Serializable  {
	
	int id;
	String name;
	
	public Role() {
		super();
		
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
