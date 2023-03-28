package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new App(sc).run(); //class App에 Scanner 넘기기 위해

        sc.close();
    }
}