package com.ll.wiseSaying.controller;

import com.ll.Container;
import com.ll.Rq;
import com.ll.WiseSaying;
import com.ll.wiseSaying.wiseSaying.service.WiseSayingService;

import java.util.List;

public class WiseSayingController {


    private final WiseSayingService wiseSayingService;

    public WiseSayingController() {
        wiseSayingService = new WiseSayingService();
    }

    public void write() {

        System.out.println("명언 : ");
        String wiseSay = Container.getScanner().nextLine().trim();
        System.out.println("작가 : ");
        String name = Container.getScanner().nextLine().trim();
        long id = wiseSayingService.write(wiseSay, name);
        System.out.printf("%d번 명언이 등록되었습니다.\n", id);

    }

    public void list() {
        List<WiseSaying> wiseSayings = wiseSayingService.findAll();

        System.out.println("명언 수 : " + wiseSayings.size());
        System.out.println("번호 / 작가 / 명언");
        System.out.println("=".repeat(30));
        for (int i = wiseSayings.size() - 1; i >= 0; i--) {

            WiseSaying wiseSaying = wiseSayings.get(i);

            System.out.printf("%d / %s / %s\n", wiseSaying.getNumber(), wiseSaying.getName(), wiseSaying.getWiseSay());
        }
    }

    public void remove(Rq rq) {
//        int id = -1; //null 값이 불가능해서 -1값 넣어준것
//        try {
//            id = Integer.parseInt(rq.getParams("id"));
//        } catch (NumberFormatException e) {
//            System.out.println("정수를 입력해 주세요");
//            return;
//        }
        long id = rq.getLongParam("id", -1);

        if (id == -1) {
            System.out.println("정수를 입력하세요");
            return;
        }
        WiseSaying wiseSaying = wiseSayingService.findById(id);

        if (wiseSaying == null) {
            System.out.printf("%d번 명언이 존재하지않습니다.\n", id);
            return;
        }
        wiseSayingService.remove(wiseSaying);
        System.out.printf("%d 명언이 삭제되었습니다.\n", id);
    }

    public void modify(Rq rq) {
        long id = rq.getLongParam("id", -1);

        if (id == -1) {
            System.out.println("정수를 입력하세요");
            return;
        }
        WiseSaying wiseSaying = wiseSayingService.findById(id);

        if (wiseSaying == null) {
            System.out.printf("%d번 명언이 존재하지않습니다.\n", id);
            return;
        }
        System.out.printf("기존 명언 %s\n", wiseSaying.getWiseSay());
        System.out.println("명언 : ");
        String wiseSay = Container.getScanner().nextLine().trim();

        System.out.printf("기존 작가 %s\n", wiseSaying.getName());
        System.out.println("작가 : ");
        String name = Container.getScanner().nextLine().trim();

        wiseSayingService.modify(wiseSaying, wiseSay, name);

        System.out.printf("%d번 명언이 수정되었습니다.\n", id);
    }
}
