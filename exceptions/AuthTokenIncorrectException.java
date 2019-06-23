package com.ita.provapp.server.provappcommon.exceptions;

public class AuthTokenIncorrectException extends Throwable {
    public AuthTokenIncorrectException() {
        super("Unauthorized access. Authorization token is incorrect.");
    }
}
