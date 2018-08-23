package com.hibicode.demoawsmq.model;

public class Order {

    private String content;

    public Order() {
    }

    public Order(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Order{" +
                "content='" + content + '\'' +
                '}';
    }
}
