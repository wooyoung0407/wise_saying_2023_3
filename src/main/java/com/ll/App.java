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
        ArrayList<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.println("명령)");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.println("명언 : ");
                String wiseSay = sc.nextLine().trim();
                System.out.println("작가 : ");
                String name = sc.nextLine().trim(); //2단계
//                System.out.println("1번 명언이 등록되었습니다."); //3단계
//                System.out.printf("%d번 명언이 등록되었습니다.\n",number++); // 4단계
                int id = ++number;
                WiseSaying wiseSaying = new WiseSaying(number,name,wiseSay);
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);

                wiseSayings.add(wiseSaying);

            } else if (command.equals("목록")) {
                System.out.println("명언 수 : " + wiseSayings.size());
                System.out.println("번호 / 작가 / 명언");
                for(int i = wiseSayings.size()-1 ; i>=0;i--){

                    WiseSaying wiseSaying = wiseSayings.get(i);

                    System.out.printf("%d / %s / %s\n",wiseSaying.getNumber(),wiseSaying.getName(),wiseSaying.getWiseSay());
                }
            }else if(command.equals("삭제")){
                System.out.println("삭제할 번호 : ");
                int num = sc.nextInt();
                wiseSayings.remove(num-1);
            }
        }
    }
}

