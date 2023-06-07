package com.example.registrationformclient.controller;


public interface ConstantSheet {
    /**path*/
    public static final String URL_PATH = "/api";
    public static final String URL_REGISTRATION_FORM = URL_PATH + "/registration-form";

    public static final String URL_BLACKLIST = "http://localhost:8091/api_blacklist/check-client";
    public static final String URL_GETTEST = "http://localhost:8091/test?str=%s";

    /**errors message*/

    public static final String FORM_NULL = "Form missing";
    public static final String NAME_NOT_VALID = "Name not valid";
    public static final String LASTNAME_NULL = "Last name not valid";
    public static final String PHONE_INVALID = "Phone not valid";
}