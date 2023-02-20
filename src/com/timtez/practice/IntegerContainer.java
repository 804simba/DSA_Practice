package com.timtez.practice;

public class IntegerContainer {
    private int myInteger;

    public IntegerContainer(int myInteger) {
        this.myInteger = myInteger;
    }

    public int getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(int myInteger) {
        this.myInteger = myInteger;
    }

    @Override
    public String toString() {
        return "IntegerContainer{" +
                "myInteger=" + myInteger +
                '}';
    }
}
