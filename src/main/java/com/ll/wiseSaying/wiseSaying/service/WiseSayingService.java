package com.ll.wiseSaying.wiseSaying.service;

import com.ll.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    private int number;
    private final ArrayList<WiseSaying> wiseSayings;

    public WiseSaying findById(long id) {
        for (WiseSaying wiseSaying : wiseSayings) {
            if (wiseSaying.getNumber() == id) {
                return wiseSaying;
            }
        }
        return null;
    }

    public WiseSayingService() {
        this.number = 0;
        wiseSayings = new ArrayList<>();
    }

    public int write(String wiseSay, String name) {
        int id = ++number;

        WiseSaying wiseSaying = new WiseSaying(number, name, wiseSay);

        wiseSayings.add(wiseSaying);

        number = id;

        return id;
    }
    public List<WiseSaying> findAll() {
        return wiseSayings;
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayings.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String wiseSay, String name) {
        wiseSaying.setWiseSay(wiseSay);
        wiseSaying.setName(name);
    }
}
