package com.senac.projetoIntegrador.badge.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String errorMsg){
        super(errorMsg);
    }

    public UserNotFoundException() {
    }
}
