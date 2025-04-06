package com.CryptoWeb.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.CoinsList;
import com.CryptoWeb.example.repository.CoinsListRepository;

@Service
public class CoinsListService {
	
	@Autowired
    private CoinsListRepository coinsListRepository;

    public List<CoinsList> getAllCoins() {
        return coinsListRepository.findAll();
    }

    public CoinsList updateCoin(Long id, CoinsList coinDetails) {
        return coinsListRepository.findById(id)
            .map(coin -> {
                coin.setSymbol(coinDetails.getSymbol());
                coin.setName(coinDetails.getName());
                coin.setPurchasedPrice(coinDetails.getPurchasedPrice());
                coin.setFav(coinDetails.getFav());
                coin.setCart(coinDetails.getCart());
                coin.setOrdered(coinDetails.getOrdered());
                return coinsListRepository.save(coin);
            })
            .orElseThrow(() -> new RuntimeException("Coin with ID " + id + " not found in database"));
    }

}
