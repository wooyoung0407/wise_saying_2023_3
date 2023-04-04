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
            String command = Container.getScanner().nextLine().trim(); //sc 변수가 아닌 Container.get를 사용해서 넣어준다.
            Rq rq = new Rq(command);

            switch (rq.getActionCode()) {
                case "종료":
                    systemController.exit();
                    return;
                case "등록":
                    wiseSayingController.write();
                    break;
                case "목록":
                    wiseSayingController.list();
                    break;
                case "삭제":
                    wiseSayingController.remove(rq);
                    break;
            }
//            if (command.equals("종료")) {
//                systemController.exit();
//                break;
//            } else if (command.equals("등록")) {
//                wiseSayingController.write();
//
//            } else if (command.equals("목록")) {
//                wiseSayingController.list();
//            } else if (command.startsWith("삭제")) { // startsWith 진입부에 삭제가 잇으면 시작되라?
//                rq = new Rq(command);
//                rq.getActionCode();
//                rq.getParams(number);
//                wiseSayingController.remove();
//            }
        }
    }
}


