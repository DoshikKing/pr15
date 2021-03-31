package com.example.demo;

import com.example.demo.components.Bank;
import com.example.demo.components.Card;

import java.util.List;

public interface ServiceInterface {
    void addBank(Bank bank);
    void addCard(Card card);
    List<Bank> getAllBanks();
    List<Card> getAllCards();
    Bank getBankById(Long id);
    Card getCardById(Long id);
    void deleteBankById(Long id);
    void deleteAllBanks();
    void deleteCardById(Long id);
    void deleteAllCards();
}
