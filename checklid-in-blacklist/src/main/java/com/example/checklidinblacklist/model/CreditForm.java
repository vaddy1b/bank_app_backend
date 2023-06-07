package com.example.checklidinblacklist.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class CreditForm {
    private String firstName;

    private String lastName;

    private String mobilePhone;

    private String email;

    private Long passportSerial;

    private String passportWhoGive;

    private Date dateOfBirth;

    private String placeOfBirth;

    private String maritalStatus; //семейное положение

    private String addressOfRegistration;

    private Boolean isAddressMatch; // совпадает ли адресс с местом регистрации

    private String education;

    private String lastPlaceOfWork;

    private String periodOfWork; // срок работы на последнем месте

    private Long incomePerMonth;

    private String position; // должность
}
