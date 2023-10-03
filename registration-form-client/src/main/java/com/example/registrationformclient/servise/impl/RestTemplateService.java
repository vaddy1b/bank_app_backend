package com.example.registrationformclient.servise.impl;

import com.example.registrationformclient.model.CreditForm;
import com.example.registrationformclient.model.ResponceFormResult;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.example.registrationformclient.controller.ConstantSheet.URL_BLACKLIST;
import static com.example.registrationformclient.controller.ConstantSheet.URL_GETTEST;

@Service
public class RestTemplateService {

    //    public String urlTest = "http://www.cbr.ru/scripts/XML_daily.asp";
    private RestTemplate restTemplate = new RestTemplate();

    public ResponceFormResult checkLid(CreditForm creditForm) {
        ResponceFormResult result = restTemplate.exchange(
                URL_BLACKLIST,
                HttpMethod.POST,
                new HttpEntity<>(creditForm, null),
                ResponceFormResult.class).getBody();

        return null;
    }

//    public String checkTest(String str) {
//        String body = restTemplate.exchange(
//                String.format(URL_GETTEST, str),
//                HttpMethod.GET,
//                new HttpEntity<>(null),
//                String.class).getBody();
//        return body;
//    }
}
