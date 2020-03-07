package com.app.fullstack;

public class TransportObject {
    private String data;

    public TransportObject() {
    }

    public TransportObject(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TransportObject{" +
                "data='" + data + '\'' +
                '}';
    }
}
