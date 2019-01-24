package com.accenture.chat.tdd.Chat.TDD.models;

import java.util.ArrayList;
import java.util.Date;

public class Message {
    private Date date;
    private String description;
    private String user;

    public Message(Date _date, String _description, String _user){
        this.date = _date;
        this.description = _description;
        this.user = _user;
    }

    public boolean filterUser(String user){
        if (this.user == user){
            return  true;
        }
        return false;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
