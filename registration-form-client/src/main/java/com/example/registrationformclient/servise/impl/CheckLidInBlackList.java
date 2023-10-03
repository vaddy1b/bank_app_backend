package com.example.registrationformclient.servise.impl;

import com.example.registrationformclient.model.CreditForm;
import com.example.registrationformclient.model.ResponceFormResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckLidInBlackList {


    @Autowired
    private RestTemplateService restTemplateService;

//    public ResponceFormResult checkBlackList(CreditForm creditForm) {
//        try {
////            ResponceFormResult responceFormResult = restTemplateService.checkLid(creditForm);
////            return responceFormResult;
//            throw new NullPointerException();
//        } catch (ResourceAccessException e) {
//            ResponceFormResult responceFormResult = new ResponceFormResult();
//            responceFormResult.setErrorMessage(e.getMessage() + " " + e.getLocalizedMessage());
//            return responceFormResult;
//        }
//        catch (NullPointerException e)
//        {
//            ResponceFormResult responceFormResult = new ResponceFormResult();
//            responceFormResult.setErrorMessage(e.toString());
//            return responceFormResult;
//        }
//    }

    public ResponceFormResult checkBlackList(CreditForm creditForm){
        ResponceFormResult responceFormResult = restTemplateService.checkLid(creditForm);
        return responceFormResult;
    }

//    public String checkTest (String str){
//        return restTemplateService.checkTest(str);
//    }
}
