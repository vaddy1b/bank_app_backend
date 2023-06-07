package com.example.registrationformclient.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class CreditForm {

    @NotBlank(message = "First name must not be blank")
    private String firstName;
    @NotBlank(message = "Last name must not be blank")
    private String lastName;
    @NonNull
    private String mobilePhone;
    @NonNull
    private String email;

    private Long passportSerial;
    @NonNull
    private String passportWhoGive;

    private Date dateOfBirth;
    @NonNull
    private String placeOfBirth;
    @NonNull
    private String maritalStatus; //семейное положение
    @NonNull
    private String addressOfRegistration;

    private Boolean isAddressMatch; // совпадает ли адресс с местом регистрации
    @NonNull
    private String education;
    @NonNull
    private String lastPlaceOfWork;
    @NonNull
    private String periodOfWork; // срок работы на последнем месте
    @NonNull
    private String incomePerMonth;
    @NonNull
    private String position; // должность
}
