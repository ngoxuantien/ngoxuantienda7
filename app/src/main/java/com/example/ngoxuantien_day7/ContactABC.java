package com.example.ngoxuantien_day7;

public class ContactABC {
    private String nameview, text;

    public ContactABC() {
    }

    public ContactABC(String nameview, String text) {
        this.nameview = nameview;
        this.text = text;
    }

    public String getNameview() {
        return nameview;
    }

    public void setNameview(String nameview) {
        this.nameview = nameview;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
