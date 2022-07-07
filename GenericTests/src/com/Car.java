package com;

public class Car implements com.BaseInterface<String> {
    private String type;
    private int maxSpeed;

    public Car(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String get() {
        return null;
    }

    @Override
    public void set(String value) {

    }
}
