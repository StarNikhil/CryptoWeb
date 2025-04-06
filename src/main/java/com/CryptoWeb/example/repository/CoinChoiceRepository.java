package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CryptoWeb.example.entity.CoinChoice;

public interface CoinChoiceRepository extends JpaRepository<CoinChoice, Long> {
}
