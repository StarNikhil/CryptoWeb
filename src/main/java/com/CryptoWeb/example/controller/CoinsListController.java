package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.CoinsList;
import com.CryptoWeb.example.service.CoinsListService;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/api/coinslist")
public class CoinsListController {
	
	@Autowired
    private CoinsListService coinsListService;

    @GetMapping
    public List<CoinsList> getAllCoins() {
        return coinsListService.getAllCoins();
    }

    @PutMapping("/{id}")
    public CoinsList updateCoin(@PathVariable Long id, @RequestBody CoinsList coin) {
        return coinsListService.updateCoin(id, coin);
    }


}
