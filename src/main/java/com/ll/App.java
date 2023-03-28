package com.ll;

import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;

    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.println("명령)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            }else if(command.equals("등록")){

                System.out.println("명언 : ");
                String wise = sc.nextLine().trim();

                System.out.println("작가 : ");
                String name = sc.nextLine().trim();

                System.out.println("1번 명언이 등록되었습니다.");
            }
        }
    }
}
