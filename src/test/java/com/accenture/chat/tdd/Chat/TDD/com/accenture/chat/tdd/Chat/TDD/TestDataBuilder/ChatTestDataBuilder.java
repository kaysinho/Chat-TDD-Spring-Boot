package com.accenture.chat.tdd.Chat.TDD.com.accenture.chat.tdd.Chat.TDD.TestDataBuilder;

import com.accenture.chat.tdd.Chat.TDD.models.Chat;
import com.accenture.chat.tdd.Chat.TDD.models.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatTestDataBuilder {
    private Date createDate;
    private List<Message> messages;

    public ChatTestDataBuilder(){
        createDate = new Date();
    }

    public ChatTestDataBuilder withDate(Date date){
        this.createDate = date;
        return  this;
    }

    public ChatTestDataBuilder with(MessageTestDataBuilder... messages){
        this.messages = new ArrayList<>();

        for(MessageTestDataBuilder message : messages){
            this.messages.add(message.build());
        }

        return  this;
    }

    public Chat build(){
        return  new Chat(this.createDate, this.messages);
    }

    public static ChatTestDataBuilder aChat(){
        return new ChatTestDataBuilder();
    }
}
