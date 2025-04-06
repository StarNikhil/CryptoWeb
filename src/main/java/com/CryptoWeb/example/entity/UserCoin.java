package com.CryptoWeb.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserCoin {
     
	@Id
    private String id;
	
    private String symbol;
    private String name;
    private String purchasedPrize;
    private boolean favorite;
    private boolean cart;
    private boolean ordered;
    private String userId;
    
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurchasedPrize() {
		return purchasedPrize;
	}
	public void setPurchasedPrize(String purchasedPrize) {
		this.purchasedPrize = purchasedPrize;
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
	public boolean isOrdered() {
		return ordered;
	}
	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public UserCoin(String id, String symbol, String name, String purchasedPrize, boolean favorite, boolean cart,
			boolean ordered, String userId) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.name = name;
		this.purchasedPrize = purchasedPrize;
		this.favorite = favorite;
		this.cart = cart;
		this.ordered = ordered;
		this.userId = userId;
	}
    
	public UserCoin() {
		
	}
    
    
}
