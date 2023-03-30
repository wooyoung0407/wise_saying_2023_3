package com.ll;

import com.ll.system.controller.SystemController;
import com.ll.wiseSaying.controller.WiseSayingController;

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

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        int number = 0;

        ArrayList<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.println("명령)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                systemController.write();

            } else if (command.equals("목록")) {
                systemController.list();
            }
        }
    }
}


