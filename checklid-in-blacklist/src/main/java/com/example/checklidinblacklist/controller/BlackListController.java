package com.example.checklidinblacklist.controller;

import com.example.checklidinblacklist.model.CreditForm;
import com.example.checklidinblacklist.model.ResponceFormResult;
import org.springframework.web.bind.annotation.*;

import static com.example.checklidinblacklist.controller.ConstantSheet.URL_CHECK_CLIENT;

@RestController
public class BlackListController {


    @PostMapping(URL_CHECK_CLIENT)
    public ResponceFormResult checkLid(@RequestBody CreditForm creditForm) {
        ResponceFormResult responceFormResult = new ResponceFormResult();
        responceFormResult.setMessage("form from blacklist microservise");
        return responceFormResult;
    }

}
