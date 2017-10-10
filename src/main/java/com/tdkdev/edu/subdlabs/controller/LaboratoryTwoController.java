package com.tdkdev.edu.subdlabs.controller;


import com.tdkdev.edu.subdlabs.entity.CreditCard;
import com.tdkdev.edu.subdlabs.service.LaboratoryTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/*")
public class LaboratoryTwoController {
    @Autowired
    private LaboratoryTwoService service;


    @GetMapping(value = "/credit-cards")
    public List<CreditCard> getCreditCards() {
        return service.getAllCards();
    }

    @PostMapping(value = "/credit-cards")
    public CreditCard createCreditCard(@RequestBody @Valid CreditCard creditCard) {
        service.addNewCard(creditCard);
        return creditCard;
    }
}
