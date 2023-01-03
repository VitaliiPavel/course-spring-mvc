package com.vgherta.spring.mvc_hibernate_aop.util;

public class Calculator {

    public double sum(double x, double y) {
        return x + y;
    }

    public int findLength(String string){
        return string.length();
    }
    public boolean isNumberEven(int numb){
        return numb % 2 == 0;
    }
}
