package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.CoinChoice;
import com.CryptoWeb.example.service.CoinChoiceService;

@RestController
@RequestMapping("/coins")
@CrossOrigin(origins = "http://localhost:3000")
public class CoinChoiceController {
	
	@Autowired
    private CoinChoiceService coinChoiceService;

    @GetMapping
    public List<CoinChoice> getAllCoins() {
        return coinChoiceService.getAllCoins();
    }

    @PutMapping("/toggleFavorite/{id}")
    public CoinChoice toggleFavorite(@PathVariable Long id) {
        return coinChoiceService.toggleFavorite(id);
    }

    @PutMapping("/toggleCart/{id}")
    public CoinChoice toggleCart(@PathVariable Long id) {
        return coinChoiceService.toggleCart(id);
    }

}
