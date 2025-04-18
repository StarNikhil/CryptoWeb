package com.CryptoWeb.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CryptoWeb {
	
	@Id
	private String email;
	
	private String firstName; 
	
    private String lastName;
    
    private String phoneNumber;
    
    private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CryptoWeb(String email, String firstName, String lastName, String phoneNumber, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
    
	
	public CryptoWeb() {}
      

}
