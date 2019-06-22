package com.ita.provapp.server.provappcommon.exceptions;

public class PasswordIncorrectException extends Throwable {
    public PasswordIncorrectException() {
        super("Password incorrect");
    }
}
