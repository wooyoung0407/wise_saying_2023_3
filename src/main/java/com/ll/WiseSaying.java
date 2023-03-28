package com.ll;

public class WiseSaying {
    private int number;
    private String wiseSaying;
    private String name;
    WiseSaying(int number, String wiseSaying, String name){
        this.number = number;
        this.wiseSaying = wiseSaying;
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public String getWiseSaying(){
        return wiseSaying;
    }
    public String getName(){
        return name;
    }
}
