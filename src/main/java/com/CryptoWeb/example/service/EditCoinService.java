package com.CryptoWeb.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.EditCoin;
import com.CryptoWeb.example.repository.EditCoinRepository;

@Service
public class EditCoinService {

    @Autowired
    private EditCoinRepository repository;

    public EditCoin saveCoin(EditCoin coin) {
        return repository.save(coin);
    }
}
