package com.cw.test;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Java15_Class {
    public static void main(String[] args) {

        // 所谓的泛型,其实是对类型的约束
        List<String> stringList = new ArrayList<String>();
        stringList.add("abc");
        String s = stringList.get(0);

        /*
        List list = new ArrayList();
        list.add(1);
        Object i = list.get(0);
        */

        // java中的泛型 不变性
        //List<Person15> person15List = new ArrayList<Person15>();
        //person15List.add(new User15());// User15 ==> Person15

        // 泛型的作用域,对声明泛型后的逻辑操作进行类型的约束,对之前的操作约束不了
        List list = new ArrayList();
        list.add(new Student());

        List<Person15> person15List = list;
        System.out.println(person15List);
    }
}

class Person15 {

}

class User15 extends Person15 {

}

class Student {

}
