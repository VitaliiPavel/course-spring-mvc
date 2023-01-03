package com.vgherta.spring.mvc_hibernate_aop.util;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Test
    public void sum_calculate_true(){
        calculator = new Calculator();
        double expectedResult = 6.0;
        double actualResult = calculator.sum(2.0,4.0);
        Assert.assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void findLength_result(){
        calculator = new Calculator();
        int expectedResult = 4;
        int actualResult = calculator.findLength("Dina");
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void isNumberEven_true(){
        calculator = new Calculator();
        boolean actualResult = calculator.isNumberEven(4);
        Assert.assertTrue(actualResult);
    }
    @Test
    public void isNumberEven_false(){
        calculator = new Calculator();
        boolean actualResult = calculator.isNumberEven(3);
        Assert.assertFalse(actualResult);
    }
}
