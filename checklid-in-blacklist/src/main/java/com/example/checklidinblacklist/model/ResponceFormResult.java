package com.example.checklidinblacklist.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponceFormResult extends CreditExeption {

    private String message;

    private String contractNumber;
}
