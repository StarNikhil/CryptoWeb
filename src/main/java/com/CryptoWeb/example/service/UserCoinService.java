package com.CryptoWeb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.UserCoin;
import com.CryptoWeb.example.repository.UserCoinRepository;

@Service
public class UserCoinService {
	
	    @Autowired
	    private UserCoinRepository userCoinRepository;

	    public List<UserCoin> getAllUserCoins() {
	        return userCoinRepository.findAll();
	    }

	    public UserCoin addUserCoin(UserCoin userCoin) {
	        return userCoinRepository.save(userCoin);
	    }

}
