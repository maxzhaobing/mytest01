package com.tears.test01;

public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Triangle draw()");
    }
    public void erase(){
        System.out.println("Triangle erase()");
    }

    public void draw2() {
        System.out.println("Triangle draw2()");
    }
}
