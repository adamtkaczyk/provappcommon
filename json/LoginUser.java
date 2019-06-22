package com.ita.provapp.server.provappcommon.json;

public class LoginUser {

    public LoginUser(String authtoken, User user) {
        this.authtoken = authtoken;
        this.user = user;
    }

    private final String authtoken;
    private final User user;

    public String getAuthtoken() {
        return authtoken;
    }

    public User getUser() {
        return user;
    }
}
