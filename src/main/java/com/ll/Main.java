package com.ll;

import java.util.zip.CheckedInputStream;

public class Main {
    public static void main(String[] args) {

        Container.init();

        new App().run();

        Container.close();
    }
}