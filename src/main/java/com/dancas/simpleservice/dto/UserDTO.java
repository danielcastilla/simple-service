package com.dancas.simpleservice.dto;

import com.dancas.simpleservice.persistence.GenericGenerator;
import com.dancas.simpleservice.persistence.SequenceStrategy;

@GenericGenerator(strategy=SequenceStrategy.class)
public class UserDTO {
	
	private long id;
	
	private String name;
	
	private String surname;
	
	public UserDTO(long id, String name, String surname) {
		this.id=id;
		this.name=name;
		this.surname=surname;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	
}
