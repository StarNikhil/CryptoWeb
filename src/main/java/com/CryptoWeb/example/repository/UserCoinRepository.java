package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CryptoWeb.example.entity.UserCoin;

@Repository
public interface UserCoinRepository extends JpaRepository<UserCoin, String> {
}
