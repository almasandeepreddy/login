package com.example.login.util;


public class BusinessError {

    private String errorMessage;

    public BusinessError(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
