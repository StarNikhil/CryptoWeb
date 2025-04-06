package com.CryptoWeb.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CryptoWeb.example.entity.CoinChoice;
import com.CryptoWeb.example.repository.CoinChoiceRepository;

@Service
public class CoinChoiceService {
	
	@Autowired
    private CoinChoiceRepository coinChoiceRepository;

    public List<CoinChoice> getAllCoins() {
        return coinChoiceRepository.findAll();
    }

    public CoinChoice toggleFavorite(Long id) {
        Optional<CoinChoice> coin = coinChoiceRepository.findById(id);
        if (coin.isPresent()) {
            CoinChoice updatedCoin = coin.get();
            updatedCoin.setFavorite(!updatedCoin.isFavorite());
            return coinChoiceRepository.save(updatedCoin);
        }
        return null;
    }

    public CoinChoice toggleCart(Long id) {
        Optional<CoinChoice> coin = coinChoiceRepository.findById(id);
        if (coin.isPresent()) {
            CoinChoice updatedCoin = coin.get();
            updatedCoin.setCart(!updatedCoin.isCart());
            return coinChoiceRepository.save(updatedCoin);
        }
        return null;
    }

}
