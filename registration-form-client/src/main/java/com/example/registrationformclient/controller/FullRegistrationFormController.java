package com.example.registrationformclient.controller;

import com.example.registrationformclient.model.CreditForm;
import com.example.registrationformclient.model.ResponceFormResult;
import com.example.registrationformclient.servise.ValidationServise;
import com.example.registrationformclient.servise.impl.CheckLidInBlackList;
import com.example.registrationformclient.servise.impl.ValidateServiseImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.example.registrationformclient.controller.ConstantSheet.URL_REGISTRATION_FORM;

@RestController
public class FullRegistrationFormController {

    @Autowired
    private CheckLidInBlackList checkLidInBlackList;

    @Autowired
    private ValidationServise validateServise;


    @PostMapping(URL_REGISTRATION_FORM)
    public @ResponseBody ResponceFormResult getInformation(@RequestBody CreditForm creditForm) {
        ResponceFormResult validationResult = validateServise.validateCreditForm(creditForm);
        if(!validationResult.getErrorMessage().isEmpty()){
            return validationResult;
        }
        ResponceFormResult responceFormResult = checkLidInBlackList.checkBlackList(creditForm);
        return responceFormResult;
    }


//
//    @PostMapping(URL_REGISTRATION_FORM + "/test")
//    public String getInformation(@RequestParam String string) {
//        String s = checkLidInBlackList.checkTest(string);
//        return s;
//    }

}
