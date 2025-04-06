package com.CryptoWeb.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CoinsList {
	
	@Id
    private Long id;
    private String symbol;
    private String name;
    private Double purchasedPrice;
    private Boolean fav;
    private Boolean cart;
    private Boolean ordered;
    private Long userId;
    
    public CoinsList(Long id, String symbol, String name, Double purchasedPrice, Boolean fav, Boolean cart, Boolean ordered, Long userId) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.purchasedPrice = purchasedPrice;
        this.fav = fav;
        this.cart = cart;
        this.ordered = ordered;
        this.userId = userId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPurchasedPrice() { return purchasedPrice; }
    public void setPurchasedPrice(Double purchasedPrice) { this.purchasedPrice = purchasedPrice; }

    public Boolean getFav() { return fav; }
    public void setFav(Boolean fav) { this.fav = fav; }

    public Boolean getCart() { return cart; }
    public void setCart(Boolean cart) { this.cart = cart; }

    public Boolean getOrdered() { return ordered; }
    public void setOrdered(Boolean ordered) { this.ordered = ordered; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    
	public CoinsList() {
		
	}
    

}
