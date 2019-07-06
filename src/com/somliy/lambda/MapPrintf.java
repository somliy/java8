package com.somliy.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * 循环Map
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 16:45
 * @Description:
 */
public class MapPrintf {
    public static void main(String[] args) {

/*      ============Java8之前的方式==========
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
 */

//      ============forEach + Lambda表达式==========
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        System.out.println("-----------------");
        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
        System.out.println("-----------------");
        items.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
    }
}
