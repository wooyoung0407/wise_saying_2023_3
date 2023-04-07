package com.ll;

public class WiseSaying {
    private int number;
    private String wiseSay;
    private String name;

    public WiseSaying(int number, String wiseSay, String name) {
        this.number = number;
        this.wiseSay = wiseSay;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getWiseSay() {
        return wiseSay;
    }

    public String getName() {
        return name;
    }

    public void setWiseSay(String wiseSay) {
        this.wiseSay = wiseSay;
    }

    public void setName(String name) {
        this.name = name;
    }

}