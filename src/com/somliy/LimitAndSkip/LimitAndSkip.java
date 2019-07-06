package com.somliy.LimitAndSkip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 * @Author: zhaodong
 * @Date: 2019/7/6 17:46
 * @Description:
 */
public class LimitAndSkip {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        for (int i = 1; i <= 10000; i++) {
            Person person = new Person(i, "name" + i);
            persons.add(person);
        }
        List<String> personList2 = persons.stream().
                map(Person::getName)
                //取前十个
                .limit(10)
                //跳过前三个
                .skip(3)
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
    }
}
