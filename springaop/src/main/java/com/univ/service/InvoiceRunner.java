package com.univ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
 
@Component
public class InvoiceRunner implements CommandLineRunner{
 
    @Autowired
    private PrimaryBusinessService service;

    @Override
    public void run(String... args) throws Exception {

        service.saveInvoice();
        service.populateInvoice();
        service.listInvoice();


    }
 
    


}