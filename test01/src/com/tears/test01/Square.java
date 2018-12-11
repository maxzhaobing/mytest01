package com.tears.test01;

public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Square draw()");
    }
    public void erase(){
        System.out.println("Square erase()");
    }

    public void draw2() {
        System.out.println("Square draw2()");
    }
}
