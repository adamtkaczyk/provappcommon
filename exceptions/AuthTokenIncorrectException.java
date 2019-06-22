package com.ita.provapp.server.provappcommon.exceptions;

public class AuthTokenIncorrectException extends Throwable {
    public AuthTokenIncorrectException() {
        super("AuthToken incorrect");
    }
}
