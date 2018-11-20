package com.gmail.chechko.als.model;


import java.util.Date;

/**
 *
 * @author Als
 */
public class Message {
    private String msg;
    private Date data;

    public Message(String msg, Date data) {
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


}
