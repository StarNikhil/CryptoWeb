package com.CryptoWeb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.MyCoins;
import com.CryptoWeb.example.repository.MyCoinsRepository;

@Service
public class MyCoinsService {
	
	@Autowired
    private MyCoinsRepository myCoinsRepository;

    public List<MyCoins> saveAllCoins(List<MyCoins> coins) {
        return myCoinsRepository.saveAll(coins);
    }


}
