package com.somliy.maxmin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 找出最长一行的长度
 *
 * @Author: zhaodong
 * @Date: 2019/7/10 15:29
 * @Description:
 */
public class maxLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Project\\java8\\src\\com\\static\\eg.txt"));
        int longest =
                // 每一行
                br.lines()
                // 字符串长度
                .mapToInt(String::length)
                // 最大
                .max()
                .getAsInt();
        br.close();
        System.out.println(longest);
    }
}
