package com.example.registrationformclient.servise;

import com.example.registrationformclient.model.CreditForm;
import com.example.registrationformclient.model.ResponceFormResult;

public interface ValidationServise {

    public ResponceFormResult validateCreditForm(CreditForm creditForm);
}
