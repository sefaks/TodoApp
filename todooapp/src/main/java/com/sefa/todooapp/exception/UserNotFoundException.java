package com.sefa.todooapp.exception;

public class UserNotFoundException extends  RuntimeException{
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
