package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumber;

    /* @Before annotation is used on a method containing Java
code to run before each test case. i.e it runs before each test execution.
I   n the setup method ,object of class is declared
*/
    @Before
    public void setUp() {
        this.consecutiveNumber = new ConsecutiveNumbers();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.consecutiveNumber = null;
    }

    @Test
    public void givenSetOfNumbersShouldReturnFalseOutput() {
        boolean expected = false;

        boolean actual = consecutiveNumber.checkConsecutiveNumber("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void givenSetOfNumbersShouldReturnTrueOutput() {
        boolean expected = true;

        boolean actual = consecutiveNumber.checkConsecutiveNumber("1,2,3,4,5,6,7,8,9,10");

        assertEquals(expected, actual);
    }

}