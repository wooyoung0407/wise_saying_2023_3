package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;

    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int number = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.println("명령)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                number = number+1;
                System.out.println("명언 : ");
                String wiseSaying = sc.nextLine().trim();

                System.out.println("작가 : ");
                String name = sc.nextLine().trim();

                System.out.printf("%d번 명언이 등록되었습니다.\n" , number);

                WiseSaying WiseSaying = new WiseSaying(number,wiseSaying,name);
            }else if (command.equals("목록")){

            }
        }
    }
}
