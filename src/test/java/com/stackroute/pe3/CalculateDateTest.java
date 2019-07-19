package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateTest {
        CalculateDate calculateDate;

         /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
I   n the setup method ,object of class is declared
    */
    @Before
    public void setUp()  {
        this.calculateDate=new CalculateDate();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.calculateDate=null;
    }

    @Test
    public void programShouldreturnFirstDateAndLastDateOfWeek(){
        String expectedResult="First Date of Week:\n" +
                "Mon 15/07/2019\n" +
                "Last date of the week:\n" +
                "Sun 21/07/2019";
        String actualResult=calculateDate.getDate();
        assertEquals(actualResult,expectedResult);
    }
}