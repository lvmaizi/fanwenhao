package com.example.fanwwenhao.drools;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {
    public Message(MessageType m,String s){
        this.messageType=m;
        this.target=s;
    }
    public enum MessageType {
        HI,
        GOODBYE,
        CHAT
    }
    private MessageType messageType;
    private String target;

}
