package com.ll;

import java.util.Scanner;

public class Container {
    private static Scanner sc;

    public static void init() {
        sc = new Scanner(System.in); //main 에 쓰지않고 Scanner만 써놓는 클래스 를 만들어 init에 Scanner 넣고
    }
    public static void close(){
        sc.close(); // close에 close 값 넣어주고
    }
    public static Scanner getScanner(){
        return sc;
    }// getter써서 sc를 받아온다.
}
