package com.cw.test;

public class Java13_ObjectEq {
    public static void main(String[] args) {
        User14 user1 = new User14();
        User14 user2 = new User14();
        System.out.println(user1.equals(null));
    }
}

class User14 {

    private int id;
    private String name;

    // 重写hashCode主要是在HashMap中需要使用
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User14) {
            User14 otherUser = (User14) o;
            return this.id == otherUser.id;
        } else {
            return false;
        }
    }
}
