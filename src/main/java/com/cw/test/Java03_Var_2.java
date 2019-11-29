package com.cw.test;

import java.lang.reflect.Field;

public class Java03_Var_2 {
    public static void main(String[] args) throws Exception {

        // 字面量
        String name = "zhangsan";
        int i = 10;

        // String不可变字符串:内存地址不可变,内容可变,只是没有提供变化的机制
        String s = " a b ";

        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        char[] cs = (char[]) value.get(s);

        cs[2] = 'd';

        System.out.println(s);

        short ss = 10;
        byte b = 10;

//        ss = ss + b;
    }
}
