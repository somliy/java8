package com.somliy.forEach;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaodong
 * @Date: 2019/7/6 17:04
 * @Description:
 */
public class MothPerson {

    static final String Gender = "女";

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三", "男", 12));
        list.add(new Person("李四", "女", 13));
        list.add(new Person("王五", "女", 14));
        list.add(new Person("赵六", "男", 15));
        //输出性别为 女 的 姓名
        list.stream().filter(p -> Gender.equals(p.gender)).forEach(p -> System.out.print(p.name + " "));
        System.out.println();
        //输出性别为 女 的 姓名
        for (Person p : list) {
            if (Gender.equals(p.gender)) {
                System.out.print(p.name + " ");
            }
        }
        System.out.println();
    }

    static class Person {
        String name;
        String gender;
        Integer age;

        public Person(String name, String gender, Integer age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }
    }
}
