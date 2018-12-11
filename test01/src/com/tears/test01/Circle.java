package com.tears.test01;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle draw()");
    }
    public void erase(){
        System.out.println("Circle erase()");
    }

    public void draw2() {
        System.out.println("Circle draw2()");
    }
}
