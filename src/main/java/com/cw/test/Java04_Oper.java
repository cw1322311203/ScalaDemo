package com.cw.test;

public class Java04_Oper {
    public static void main(String[] args) {

        int i=0;
        i=i++;
        // 1. (_a=i++) 2.i = _a
        // 3. _a = 0 ,i =1  4. i = _a = 0
        System.out.println(i);

    }
}
