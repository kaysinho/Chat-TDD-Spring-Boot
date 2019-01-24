package com.accenture.chat.tdd.Chat.TDD.com.accenture.chat.tdd.Chat.TDD.TestDataBuilder;

import com.accenture.chat.tdd.Chat.TDD.models.Message;

import java.util.Date;

public class MessageTestDataBuilder {

    private Date date;
    private String description;
    private String user;

    public MessageTestDataBuilder(){
        this.date = new Date();
        this.description = "Buenos dias amigos";
        this.user = "Jhonatan Plata";
    }

    public MessageTestDataBuilder withDate(Date date){
        this.date = date;
        return  this;
    }

    public MessageTestDataBuilder withDescription(String description){
        this.description = description;
        return  this;
    }

    public  MessageTestDataBuilder withUser(String user){
        this.user = user;
        return  this;
    }

    public Message build(){
        return  new Message(this.date, this.description, this.user);
    }

    public static MessageTestDataBuilder aMessage(){
        return new MessageTestDataBuilder();
    }
}
