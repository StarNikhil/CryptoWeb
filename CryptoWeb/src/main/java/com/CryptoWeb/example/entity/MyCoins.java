package com.CryptoWeb.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyCoins {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private String image;
    private String name;
    private double current_price;
    private String symbol;
    private double market_cap;
    private double total_volume;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getMarket_cap() {
		return market_cap;
	}
	public void setMarket_cap(double market_cap) {
		this.market_cap = market_cap;
	}
	public double getTotal_volume() {
		return total_volume;
	}
	public void setTotal_volume(double total_volume) {
		this.total_volume = total_volume;
	}
	public MyCoins(Long id, String image, String name, double current_price, String symbol, double market_cap,
			double total_volume) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.current_price = current_price;
		this.symbol = symbol;
		this.market_cap = market_cap;
		this.total_volume = total_volume;
	}
    
	public MyCoins() {}
    
    
}