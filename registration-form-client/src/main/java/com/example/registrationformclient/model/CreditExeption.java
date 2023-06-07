package com.example.registrationformclient.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreditExeption {

    private String errorMessage;
    private Integer errorCodeName;
}
