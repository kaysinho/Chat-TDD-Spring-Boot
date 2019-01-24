package com.accenture.chat.tdd.Chat.TDD.models;

import java.util.Date;
import java.util.List;

public class Chat {
    private Date createDate;
    private List<Message> messages;

    public Chat(Date _date, List<Message> messages){
        this.createDate = _date;
        this.messages = messages;
    }

    public Boolean filterChatByKeywords(String word){

        for(Message msg : messages){
            if (msg.getDescription().contains(word)){
                return true;
            }
        }

        return false;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setDate(Date date) {
        this.createDate = date;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
