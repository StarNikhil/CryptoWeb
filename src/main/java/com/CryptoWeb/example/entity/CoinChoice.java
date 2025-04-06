package com.CryptoWeb.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CoinChoice {
	
	@Id
    private Long id;
    private String logo; 
    private String name;
    private double age;
    private String symbol;
    private boolean favorite;
    private boolean cart;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public boolean isCart() {
		return cart;
	}
	public void setCart(boolean cart) {
		this.cart = cart;
	}
	
	
	public CoinChoice(Long id, String logo, String name, double age, String symbol, boolean favorite, boolean cart) {
		super();
		this.id = id;
		this.logo = logo;
		this.name = name;
		this.age = age;
		this.symbol = symbol;
		this.favorite = favorite;
		this.cart = cart;
	}
	
	public CoinChoice() {
		
	}
	

    
    
}
