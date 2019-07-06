package com.somliy.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 转换大写
 *  map 它的作用就是把 input Stream 的每一个元素，映射成 output Stream 的另外一个元素。
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 16:25
 * @Description:
 */
public class ToUpperCase {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("bar");
        wordList.add("orange");
        List<String> output = wordList.stream().
                // map 生成的是个 1:1 映射，每个输入元素，都按照规则转换成为另外一个元素.
                map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println(output);
    }
}
