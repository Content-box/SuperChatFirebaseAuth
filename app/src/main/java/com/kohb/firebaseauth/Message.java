package com.kohb.firebaseauth;

import java.util.Date;

public class Message {

    private String autor;
    private String text;
    private long time;

    public Message() {
    }

    public Message(String autor, String text) {
        this.autor = autor;
        this.text = text;
        this.time = new Date().getTime();
    }

    public String getAutor() {
        return autor;
    }

    public String getText() {
        return text;
    }

    public long getTime() {
        return time;
    }
}
