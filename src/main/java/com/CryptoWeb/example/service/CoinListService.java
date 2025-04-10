package com.CryptoWeb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.CoinList;
import com.CryptoWeb.example.repository.CoinListRepository;

@Service
public class CoinListService {

    @Autowired
    private CoinListRepository coinListRepository;

    public List<CoinList> getAllCoins() {
        return coinListRepository.findAll();
    }
}
