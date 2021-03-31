package com.example.demo;

import com.example.demo.components.Bank;
import com.example.demo.components.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankWork {
    @Autowired
    Service service;
    public void saveBank(Bank bank) {
        service.addBank(bank);
    }
    public void saveCard(Card card) {
        service.addCard(card);
    }

    public void removeBank(Long id){
        service.deleteBankById(id);
    }

    public void removeCard(Long id){
        service.deleteCardById(id);
    }

    public List<Bank> getBanks(){
        return service.getAllBanks();
    }

    public List<Card> getCards(){
        return service.getAllCards();
    }

}
