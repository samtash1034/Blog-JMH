package com.sam.jmh;

import java.util.ArrayList;
import java.util.List;

public class BeforeJMH {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= 10000000; i++) {
            list.add("test" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("執行時間：" + (endTime - startTime));
    }
}
