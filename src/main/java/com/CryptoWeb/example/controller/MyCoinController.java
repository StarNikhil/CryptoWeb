package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.MyCoin;
import com.CryptoWeb.example.service.MyCoinService;

@RestController
@RequestMapping("/api/mycoin")
@CrossOrigin(origins = "http://localhost:3000")
public class MyCoinController {

    @Autowired
    private MyCoinService myCoinService;

    @PostMapping("/save")
    public ResponseEntity<List<MyCoin>> saveCoins(@RequestBody List<MyCoin> coins) {
        List<MyCoin> saved = myCoinService.saveCoins(coins);
        return ResponseEntity.ok(saved);
    }
    
    @GetMapping("/getall")
    public List<MyCoin> getAllMyCoins() {
        return myCoinService.getAllMyCoins();
    }
}
