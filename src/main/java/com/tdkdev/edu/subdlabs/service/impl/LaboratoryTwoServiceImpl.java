package com.tdkdev.edu.subdlabs.service.impl;

import com.tdkdev.edu.subdlabs.dao.CreditCardRepository;
import com.tdkdev.edu.subdlabs.entity.CreditCard;
import com.tdkdev.edu.subdlabs.service.LaboratoryTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratoryTwoServiceImpl implements LaboratoryTwoService {

    @Autowired
    private CreditCardRepository repository;

    @Override
    public List<CreditCard> getAllCards() {
       return repository.getCreditCardList();
    }

    @Override
    public void addNewCard(CreditCard creditCard) {
        repository.addCreditCard(creditCard);
    }
}
