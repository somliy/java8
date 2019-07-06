package com.somliy.peek;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * peek 对每个元素执行操作并返回一个新的 Stream
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 17:14
 * @Description:
 */
public class peek {
    public static void main(String[] args) {
        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
}
