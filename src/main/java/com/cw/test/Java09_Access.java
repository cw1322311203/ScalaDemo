package com.cw.test;

public class Java09_Access {
    public static void main(String[] args) throws Exception {

        // 访问权限
        // 所谓的权限其实是方法的提供者和方法的调用者之间的关系
        // 方法的提供者: java.lang.Object
        // 方法的调用者: com.cw.test.Java09_Access
        // A的父类Object和Java09_Access的父类Object不是同一个,
        // 所以Java09_Access调用A的clone时既不在同一个类和包里,也没有继承关系,导致无法访问

        // 如果在A中重写了clone方法,就可以进行访问,因为此时的方法的提供和调用者情况如下
        // 方法的提供者:com.cw.test.A
        // 方法的调用者:com.cw.test.Java09_Access
        // 提供者和调用者在同一个包中,可以访问

        A a = new A();
        a.clone();

        //User user = new User();
        //user.username = "zhangsan";
    }
}

class A {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/*
class User {
    public String username;
}
*/