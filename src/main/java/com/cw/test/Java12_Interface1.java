package com.cw.test;

public class Java12_Interface1 {
    public static void main(String[] args) {
        A13 a = new C13();

        System.out.println(C13.class.getInterfaces().length);
    }
}

interface A13 {

}

class B13 implements A13 {

}

class C13 extends B13 {

}