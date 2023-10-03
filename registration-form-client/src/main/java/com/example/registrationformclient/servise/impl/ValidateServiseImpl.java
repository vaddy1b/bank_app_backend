package com.example.registrationformclient.servise.impl;

import com.example.registrationformclient.model.CreditForm;
import com.example.registrationformclient.model.ResponceFormResult;
import com.example.registrationformclient.servise.ValidationServise;
import org.springframework.stereotype.Service;

import static com.example.registrationformclient.controller.ConstantSheet.*;

@Service
public class ValidateServiseImpl implements ValidationServise {

    public Boolean regexLetters (String str){
        Boolean res = str.matches(".*[А-Яа-яЁё].*");
        return res;
    }

    public Boolean regexDigits (String digits) {
        Boolean res = digits.matches("\\\\+7\\\\(\\\\d{3}\\\\)\\\\d{3}-\\\\d{2}-\\\\d{2}");
        return res;
    }

    @Override
    public ResponceFormResult validateCreditForm(CreditForm creditForm) {
        ResponceFormResult responceFormResult = new ResponceFormResult();

        if(creditForm == null){
            responceFormResult.setErrorMessage(FORM_NULL);
            return responceFormResult;
        }

        if(!regexLetters(creditForm.getFirstName())) {
           responceFormResult.setErrorMessage(NAME_NOT_VALID);
           return responceFormResult;
        }

        if (!regexDigits(creditForm.getMobilePhone())) {
            responceFormResult.setMessage(PHONE_INVALID);
            return responceFormResult;
        }

        return null;
    }
}
