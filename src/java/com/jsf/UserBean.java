package com.jsf;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("user")
@SessionScoped
public class UserBean implements Serializable {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newValue) {
        password = newValue;
    }

    public String getGreeting() {
        if (name.length() == 0) {
            return "";
        } else {
            return "Welcome to JSF2 + Ajax, " + name + "!";
        }
    }
}
