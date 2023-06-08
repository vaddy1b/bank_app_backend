package com.example.registrationformclient.servise.impl;

import com.example.registrationformclient.model.ResponceFormResult;
import com.example.registrationformclient.servise.GenerateFormDocNumber;
import org.springframework.stereotype.Service;


@Service
public class GenerateNumberOfDoc implements GenerateFormDocNumber {


    @Override
    public String generateNumberOfDoc() {
        String s = genDocNumber();
        return s;
    }

    private String genDocNumber() {
        return String.valueOf(Math.random() * 10000);
    }
}
