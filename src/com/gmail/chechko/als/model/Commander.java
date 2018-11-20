package com.gmail.chechko.als.model;


import java.util.List;

/**
 *
 * @author Als
 */
public class Commander {
    private String name;
    private Long cmdrId;
    private Long userId;
    private List<Message> messages;

    public Commander(Long cmdrId, Long userId, String name) {
        this.cmdrId = cmdrId;
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCmdrId() {
        return cmdrId;
    }

    public void setCmdrId(Long cmdrId) {
        this.cmdrId = cmdrId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
