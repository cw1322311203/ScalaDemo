package com.cw.test;

public class Java10_Override {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println(aaa.getResult());

        AAA aaa1 = new BBB();
        // 动态绑定机制
        // 成员方法在执行的过程中,JVM会将方法和当前调用对象实际内存进行绑定
        // 属性没有动态绑定机制,属性在哪里声明就在哪里使用
        System.out.println(aaa1.getResult());

    }
}

class AAA {
    public int i = 10;

    public int getResult() {
        return getI() + 10; // 遵循动态绑定机制,先看aaa1(BBB)里是否有getI(),有的话则会用,没有就用父类的getI()
    }

    public int getI() {
        return i;
    }
}

class BBB extends AAA {
    public int i = 20;

    //    public int getResult() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
}