package com.cw.test;

public class Java16_Class1 {
    public static void main(String[] args) {
        test(Person16.class);
        test(User16.class);
        //test(Student16.class); // 错误

        test1(Person16.class);
        test1(XXX16.class);
        //test1(User16.class); // 错误
    }

    // Person16和它的子类型
    // extends体现类的体系树的上限
    public static void test(Class<? extends Person16> c) {
        System.out.println(c);
    }

    // super体现类的体系树的下限
    public static void test1(Class<? super Person16> c) {
        System.out.println(c);
    }
}

class XXX16 {

}

class Person16 extends XXX16 {

}

class User16 extends Person16 {

}

class Student16 {

}
