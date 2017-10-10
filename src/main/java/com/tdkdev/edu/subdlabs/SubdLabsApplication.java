package com.tdkdev.edu.subdlabs;

import com.tdkdev.edu.subdlabs.dao.CreditCardRepository;
import com.tdkdev.edu.subdlabs.entity.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = {SubdLabsApplication.class})
public class SubdLabsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SubdLabsApplication.class, args);
    }

    @Autowired
    private CreditCardRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        repository.createCreditCardTable();
        repository.getCreditCardList();
    }
}
