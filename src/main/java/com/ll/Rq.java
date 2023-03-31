package com.ll;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    String actionCode;
    Map<String, String> params;
    public Rq(String command) {
        String[] commandBits = command.split("\\?", 2); //["삭제","id =1 & id =2"], 가운데 ?

        String actionCode = commandBits[0]; //actionCode = "삭제"

        String[] paramsBits = commandBits[1].split("&"); // ["id = 1" , "id = 2"] , 가운데 &
        if(commandBits.length == 1)return;
        params = new HashMap<>();

        for (String paramsStr : paramsBits) {
            String[] paramsStrBits = paramsStr.split("=", 2); // ["id" , "1"], 가운데 =
            String key = paramsStrBits[0];  //key  = id
            String value = paramsStrBits[1]; //value = 1
            System.out.printf("키 : %s 값 : %s\n", key, value);
            params.put(key, value); //["id" , "1"]

        }

    }

    public String getActionCode() {
        return this.actionCode;
    }

    public String getParams(String name) {

        return params.get(name);
    }
}