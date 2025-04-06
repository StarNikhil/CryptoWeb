package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CryptoWeb.example.entity.CoinsList;

public interface CoinsListRepository extends JpaRepository<CoinsList, Long> {
}
