package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CryptoWeb.example.entity.MyCoin;

public interface MyCoinRepository extends JpaRepository<MyCoin, String> {
}
