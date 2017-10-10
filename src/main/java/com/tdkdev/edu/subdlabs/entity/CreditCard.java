package com.tdkdev.edu.subdlabs.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreditCard {

    @NotNull
    @Size(min=1,max=12)
    @Pattern(regexp = "\\d+")
    private String number;

    @NotNull
    @Size(min=1, max=32)
    private String bank;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public CreditCard(String number, String bank) {
        this.number = number;
        this.bank = bank;
    }

    public CreditCard() {
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }
}
