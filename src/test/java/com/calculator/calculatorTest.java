package com.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
private calculator ca ;
    @Before
    public void setUp() throws Exception {
        ca = new calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
            float a = 12;
            float b = -10;
            float expected_res = 2;
            float res = ca.add(a, b);
            Assert.assertEquals(expected_res, res, 0.0);
    }

    @Test
    public void main() {
    }
}