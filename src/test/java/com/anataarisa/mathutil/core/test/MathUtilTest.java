/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anataarisa.mathutil.core.test;

import com.anataarisa.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author AnataArisa
 */
public class MathUtilTest {
    
    public MathUtilTest() {
        
    }
    @Test
    public void verifyFactorialGivenRightArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
     @Test
    public void verifyFactorialGivenRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialRegressionGivenRightArgument1ReturnOk(){
        assertEquals(1,MathUtility.getFactorialUsingRegression(1));
    }
    
}
