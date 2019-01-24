package com.accenture.chat.tdd.Chat.TDD.models;

import java.util.Date;
import java.util.List;

public class Chat {
    private Date date;
    private List<Message> messages;

    public Chat(Date _date, List<Message> messages){
        this.date = _date;
        this.messages = messages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
