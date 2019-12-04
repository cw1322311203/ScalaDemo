package com.cw.test;

public class Java14_Switch {
    public static void main(String[] args) {

        // Java中一个都不匹配,且没写default不会报错
        int i = 1;
        switch (i) {
            default:
                System.out.println("d");
                break;
            case 0:
                break;
            case 1:
                System.out.println("1");
        }

    }
}
