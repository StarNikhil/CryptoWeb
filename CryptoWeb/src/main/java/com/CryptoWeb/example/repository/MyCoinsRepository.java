package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CryptoWeb.example.entity.MyCoins;

public interface MyCoinsRepository extends JpaRepository<MyCoins, Long> {
	
}
