package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest {

    public static void main(String[] args) {
        //test01();
        test02();
    }

    private static void test02() {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening  is full of the linnet's wings");
        if(m.matches()){
            System.out.println(m.start());
            System.out.println(m.end());
        }else {
            System.out.println("nnnnn");
        }
        System.out.println("Evening  is full of the linnet's wings".matches("\\w+"));

    }

    private static void test01() {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet's wings");
        while (m.find()){
            System.out.println(m.group()+"-");
        }

        int i = 0;
        while (m.find(i)){
            System.out.println(m.group()+"+"+i);
            i++;
        }
    }
}
