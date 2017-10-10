package com.tdkdev.edu.subdlabs.dao;

import com.tdkdev.edu.subdlabs.entity.CreditCard;

import java.util.List;

public interface CreditCardRepository {

    void createCreditCardTable();

    void addCreditCard(CreditCard creditCard);

    List<CreditCard> getCreditCardList();
}
