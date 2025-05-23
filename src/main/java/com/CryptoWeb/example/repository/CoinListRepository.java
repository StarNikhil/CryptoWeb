package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CryptoWeb.example.entity.CoinList;

@Repository
public interface CoinListRepository extends JpaRepository<CoinList, String> {
}
