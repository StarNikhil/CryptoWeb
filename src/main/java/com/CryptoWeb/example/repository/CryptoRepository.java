package com.CryptoWeb.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CryptoWeb.example.entity.CryptoWeb;

@Repository
public interface CryptoRepository extends JpaRepository<CryptoWeb, String>{

}
