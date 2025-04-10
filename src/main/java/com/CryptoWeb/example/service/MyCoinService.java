package com.CryptoWeb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.MyCoin;
import com.CryptoWeb.example.repository.MyCoinRepository;

@Service
public class MyCoinService {

    @Autowired
    private MyCoinRepository myCoinRepository;

    public List<MyCoin> saveCoins(List<MyCoin> coins) {
        return myCoinRepository.saveAll(coins);
    }
    
    public List<MyCoin> getAllMyCoins() {
        return myCoinRepository.findAll();
    }
}
