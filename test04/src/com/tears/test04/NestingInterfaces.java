package com.tears.test04;

public class NestingInterfaces {
    public static String  s = "123";

    static {
        System.out.println(s);
        s = "666";
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("===");
    }
}
