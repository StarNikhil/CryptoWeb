package com.CryptoWeb.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CryptoWeb.example.entity.CryptoWeb;
import com.CryptoWeb.example.request.LoginReq;
import com.CryptoWeb.example.service.CryptoService;


@RestController
@RequestMapping("/api")
public class CryptoController {
	
	 @Autowired
	 CryptoService cryptoService;
	 
	 @PostMapping("/addUser")
	 @CrossOrigin(origins = "http://localhost:3000")
	 public CryptoWeb addUser(@RequestBody CryptoWeb user) {
	     return cryptoService.addUser(user);
	 }
	 
	 @PostMapping("/loginUser")
	 @CrossOrigin(origins = "http://localhost:3000")
	 public Boolean loginUser(@RequestBody LoginReq loginReq) {
		 return cryptoService.loginUser(loginReq);
		 
	 }
	 @CrossOrigin(origins = "http://localhost:3000")
	 @GetMapping("/getAllUsers")
	    public List<CryptoWeb> getAllUsers() {
	        return cryptoService.getAllUsers();
	 }
}
