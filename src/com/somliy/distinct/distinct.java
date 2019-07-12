package com.somliy.distinct;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 找出全文的单词，转小写，并排序
 *
 * @Author: zhaodong
 * @Date: 2019/7/10 15:42
 * @Description:
 */
public class distinct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Project\\java8\\src\\com\\static\\eg.txt"));
        List<String> words = br.lines()
                .flatMap(line -> Stream.of(line.split(" ")))
                .filter(word -> word.length() > 0)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        br.close();
        System.out.println(words);
    }
}
