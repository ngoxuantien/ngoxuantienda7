package com.example.ngoxuantien_day7;

public class Contact {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    private String name;
    private int phone;
}
