package com.collectsavings.whatsappcontact;

/**
 * Created by Stanwaves on 12/13/2019.
 */

public class UserObject {
    private String name, phone;

    public UserObject(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
