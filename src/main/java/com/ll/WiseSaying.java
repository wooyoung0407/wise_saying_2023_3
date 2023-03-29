package com.ll;

public class WiseSaying {
    private int number;
    private String wiseSay;
    private String name;

    WiseSaying(int number, String wiseSay, String name) {
        this.number = number;
        this.wiseSay = wiseSay;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getWiseSay() {
        return this.wiseSay;
    }

    public String getName() {
        return this.name;
    }
}