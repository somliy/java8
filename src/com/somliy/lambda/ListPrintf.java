package com.somliy.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环List
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 16:47
 * @Description:
 */
public class ListPrintf {
    public static void main(String[] args) {
/*
        ============Java8之前的方式==========
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for(String item : items){
            System.out.println(item);
        }

*/
//      ============forEach + Lambda表达式==========
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        //输出：A,B,C,D,E
        items.forEach(item -> System.out.println(item));
        //输出 : C
        items.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println(item);
            }
        });
    }
}
