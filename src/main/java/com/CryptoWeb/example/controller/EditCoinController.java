package com.CryptoWeb.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.EditCoin;
import com.CryptoWeb.example.service.EditCoinService;

@RestController
@RequestMapping("/api/editcoin")
@CrossOrigin(origins = "http://localhost:3000")
public class EditCoinController {

    @Autowired
    private EditCoinService service;

    @PostMapping("/save")
    public EditCoin saveCoin(@RequestBody EditCoin coin) {
        return service.saveCoin(coin);
    }
}