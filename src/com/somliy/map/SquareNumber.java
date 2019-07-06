package com.somliy.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 平方数
 *  map 它的作用就是把 input Stream 的每一个元素，映射成 output Stream 的另外一个元素。
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 16:28
 * @Description:
 */
public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().
                // map 生成的是个 1:1 映射，每个输入元素，都按照规则转换成为另外一个元素.
                map(n -> n * n).
                collect(Collectors.toList());
        System.out.println(squareNums);
    }
}
