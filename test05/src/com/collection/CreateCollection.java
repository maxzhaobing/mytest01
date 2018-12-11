package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CreateCollection {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        String s1 = new StringBuilder("计算机").append("软件").toString();

        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);

        String s3 = "计算机软件";
        System.out.println(s3 == s1.intern());

    }
}
