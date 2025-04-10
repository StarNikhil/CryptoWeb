package com.CryptoWeb.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EditCoin {
	
	@Id
    private String id;
    private String image;
    private String name;
    private String symbol;
    private Double currentPrice;
    private Long marketCap;
    private Long totalVolume;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Long getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(Long marketCap) {
		this.marketCap = marketCap;
	}
	public Long getTotalVolume() {
		return totalVolume;
	}
	public void setTotalVolume(Long totalVolume) {
		this.totalVolume = totalVolume;
	}
	
	
	public EditCoin(String id, String image, String name, String symbol, Double currentPrice, Long marketCap,
			Long totalVolume) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.symbol = symbol;
		this.currentPrice = currentPrice;
		this.marketCap = marketCap;
		this.totalVolume = totalVolume;
	}
    
	public EditCoin() {}
    

}
