package com.ll.wiseSaying.controller;

import com.ll.Container;
import com.ll.Rq;
import com.ll.WiseSaying;

import java.util.ArrayList;

public class WiseSayingController {
    private int number;
    private final ArrayList<WiseSaying> wiseSayings;

    public WiseSayingController() {
        this.number = 0;
        wiseSayings = new ArrayList<>();
    }

    public void write() {

        System.out.println("명언 : ");
        String wiseSay = Container.getScanner().nextLine().trim();
        System.out.println("작가 : ");
        String name = Container.getScanner().nextLine().trim();

        int id = ++number;

        WiseSaying wiseSaying = new WiseSaying(number, name, wiseSay);
        System.out.printf("%d번 명언이 등록되었습니다.\n", id);

        wiseSayings.add(wiseSaying);

    }

    public void list() {

        System.out.println("명언 수 : " + wiseSayings.size());
        System.out.println("번호 / 작가 / 명언");
        System.out.println("=".repeat(30));
        for (int i = wiseSayings.size() - 1; i >= 0; i--) {

            WiseSaying wiseSaying = wiseSayings.get(i);

            System.out.printf("%d / %s / %s\n", wiseSaying.getNumber(), wiseSaying.getName(), wiseSaying.getWiseSay());
        }
    }

    public void remove(Rq rq) {
        int id = -1; //null 값이 불가능해서 -1값 넣어준것

        try{
            id = Integer.parseInt(rq.getParams("id"));
        }catch (NumberFormatException e){
            System.out.println("정수를 입력해 주세요");
            return;
        }
        System.out.printf("%d 명언이 삭제되었습니다.\n",id);
    }
}
