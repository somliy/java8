package com.somliy.filter;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 只输出偶数
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 16:41
 * @Description:
 */
public class RemainsEven {
    public static void main(String[] args) {
        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
        Arrays.asList(sixNums).stream().forEach(x -> System.out.print(x + " "));
//        Arrays.asList(sixNums).stream().forEach(System.out::println);
        System.out.println();

        Integer[] evens = Stream.of(sixNums).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        Arrays.asList(evens).stream().forEach(x -> System.out.print(x + " "));
//        Arrays.asList(evens).stream().forEach(System.out::println);
        System.out.println();


    }
}
