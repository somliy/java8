package com.somliy.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhaodong
 * @Date: 2019/7/6 17:55
 * @Description:
 */
public class sorted {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<Person> personList2 = persons.stream()
                // 排序 指定排序方式
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(personList2);
    }

    static class Person {
        public int no;
        private String name;

        public Person(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public String getName() {
            System.out.println(name);
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
