package com.ll;

import com.ll.system.controller.SystemController;
import com.ll.wiseSaying.controller.WiseSayingController;

import java.util.HashMap;
import java.util.Map;

public class App {

    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        while (true) {
            System.out.println("명령)");
            String command = Container.getScanner().nextLine().trim();

            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                wiseSayingController.write();

            } else if (command.equals("목록")) {
                wiseSayingController.list();
            } else if (command.startsWith("삭제")){ // startsWith 진입부에 삭제가 잇으면 시작되라?
                String[] commandBits = command.split("\\?",2); //"[0] 삭제 / ? / [1] id =1 "

                String acctionCode = commandBits[0];

                String[] paramsBits = commandBits[1].split("&");

                Map<String,String> params = new HashMap<>();

                for(String paramsStr : paramsBits){
                    String[] paramsStrBits = paramsStr.split("=",2);
                    String key = paramsStrBits[0];
                    String value = paramsStrBits[1];
                    System.out.printf("키 : %s 값 : %s\n", key,value);
                    params.put(key,value);

                }
                wiseSayingController.remove();
            }
        }
    }
}


