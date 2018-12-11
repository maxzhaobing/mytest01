package com.tears.test02;

public class Lunch extends Meal{
    public Lunch(){
        System.out.println("Lunch()");
    }
    static {
        System.out.println("Lunch static code");
    }

    public static void main(String[] args) {

        Lunch lunch = new Lunch();
    }
}
