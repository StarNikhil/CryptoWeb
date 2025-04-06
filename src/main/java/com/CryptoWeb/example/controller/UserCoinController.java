package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.UserCoin;
import com.CryptoWeb.example.service.UserCoinService;

@RestController
@RequestMapping("/api/usercoins")
@CrossOrigin(origins = "http://localhost:3000")
public class UserCoinController {
	
	 @Autowired
	    private UserCoinService userCoinService;

	   
	    @GetMapping("/all")
	    public List<UserCoin> getAllUserCoins() {
	        return userCoinService.getAllUserCoins();
	    }

	   
	    @PostMapping("/add")
	    public UserCoin addUserCoin(@RequestBody UserCoin userCoin) {
	        return userCoinService.addUserCoin(userCoin);
	    }

}
