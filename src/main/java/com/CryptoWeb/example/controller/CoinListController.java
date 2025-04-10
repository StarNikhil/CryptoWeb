package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.CoinList;
import com.CryptoWeb.example.service.CoinListService;

@RestController
@RequestMapping("/api/coins")
@CrossOrigin(origins = "http://localhost:3000")
public class CoinListController {

    @Autowired
    private CoinListService coinListService;

    @GetMapping
    public List<CoinList> getAllCoins() {
        return coinListService.getAllCoins();
    }
}
