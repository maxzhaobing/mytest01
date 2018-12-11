package com.tears.test03;

import java.util.Calendar;

public class Main {
    public static void print(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        Human h = new Human();
        Man m = new Man();
        Object m1 = new Man();
        System.out.println(h instanceof BaseInterface);
        System.out.println(m instanceof BaseInterface);
        System.out.println(m instanceof Human);
        //System.out.println(m instanceof Main);
        System.out.println(m1 instanceof Main);

        System.out.println(m.getClass().getSimpleName());
        System.out.println(m.getClass().getSuperclass());
        System.out.println(m.getClass().getName());


        Calendar now = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        end.set(2019,11,31,23,59,59);

        int days = ((int)(end.getTime().getTime()/1000)-(int)(now.getTime().getTime()/1000))/3600/24;

        System.out.println(days);
        print(""+now);
    }


}
