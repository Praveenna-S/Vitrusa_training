package com.univ.service;

import org.springframework.stereotype.Component;

@Component
public class PrimaryBusinessService {

    public void saveInvoice() {
        System.out.println("Saved to DB!");

    }
    public String listInvoice() {
        return "Here is the list of Invoice ! Invoice 1, Invoice1";
    }

    public void populateInvoice() {

        System.out.println("Business process executing for Generating the Invoice");

    }
 
}