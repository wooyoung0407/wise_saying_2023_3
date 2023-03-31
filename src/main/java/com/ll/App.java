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
                String[] commandBits = command.split("\\?",2); //["삭제","id =1 & id =2"], 가운데 ?

                String actionCode = commandBits[0]; //actionCode = "삭제"

                String[] paramsBits = commandBits[1].split("&"); // ["id = 1" , "id = 2"] , 가운데 &

                Map<String,String> params = new HashMap<>();

                for(String paramsStr : paramsBits){
                    String[] paramsStrBits = paramsStr.split("=",2); // ["id" , "1"], 가운데 =
                    String key = paramsStrBits[0];  //key  = id
                    String value = paramsStrBits[1]; //value = 1
                    System.out.printf("키 : %s 값 : %s\n", key,value);
                    params.put(key,value); //["id" , "1"]

                }
                wiseSayingController.remove();
            }
        }
    }
}


