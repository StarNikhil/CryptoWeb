package com.CryptoWeb.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.CryptoWeb;
import com.CryptoWeb.example.repository.CryptoRepository;
import com.CryptoWeb.example.request.LoginReq;

@Service
public class CryptoService {
	
	@Autowired
	CryptoRepository cryptoRepository;
	
	public CryptoWeb addUser(CryptoWeb user) {
        
        return cryptoRepository.save(user);
    }
	
	public Boolean loginUser(LoginReq loginReq) {
		Optional<CryptoWeb> user = cryptoRepository.findById(loginReq.getUserId());
		
		if(user == null) {
			return false;
		}
		
		CryptoWeb user1 = user.get();
		
		if(!user1.getPassword().equals(loginReq.getPassword())) {
			return false;
		}
		
		return true;	
	}
	
	public List<CryptoWeb> getAllUsers() {
        return cryptoRepository.findAll();
    }


}
