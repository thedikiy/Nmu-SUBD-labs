package com.tdkdev.edu.subdlabs.service;

import com.tdkdev.edu.subdlabs.entity.CreditCard;

import java.util.List;

public interface LaboratoryTwoService {

    List<CreditCard> getAllCards();

    void addNewCard(CreditCard creditCard);
}
