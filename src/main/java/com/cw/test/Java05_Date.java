package com.cw.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java05_Date {
    public static void main(String[] args) throws Exception {
        // 日期格式化
        Date d = parse("2019-11-26 09:23:00");
        System.out.println(d);
    }

    public static Date parse(String date) throws Exception {
        return parse(date, "yyyy-MM-dd HH:mm:ss");
    }

    private static Date parse(String date, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(date);
    }
}
