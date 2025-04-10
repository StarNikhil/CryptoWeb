package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CryptoWeb.example.entity.EditCoin;

public interface EditCoinRepository extends JpaRepository<EditCoin, Long> {
}