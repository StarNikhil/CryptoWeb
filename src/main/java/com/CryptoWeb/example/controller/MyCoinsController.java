package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.MyCoins;
import com.CryptoWeb.example.service.MyCoinsService;


@RestController
@RequestMapping("/api/mycoins")
@CrossOrigin(origins = "http://localhost:3000")
public class MyCoinsController {

    @Autowired
    private MyCoinsService myCoinsService;

    @PutMapping("/update")
    public ResponseEntity<?> updateMultipleCoins(@RequestBody List<MyCoins> coinsList) {
        coinsList.forEach(coin -> System.out.println("Received coin: " + coin));
        List<MyCoins> updatedCoins = myCoinsService.updateMultipleCoins(coinsList);
        return ResponseEntity.ok(updatedCoins);
    }

}