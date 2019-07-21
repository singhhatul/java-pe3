package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionTest {
    GenerateException generateException;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
I   n the setup method ,object of class is declared
    */
    @Before
    public void setUp()  {
        this.generateException=new GenerateException();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.generateException=null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenInputShouldReturnNegativeAraayException() throws NegativeArraySizeException{
        int size = generateException.checkNegativeArrayException(-4);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void givenInputShouldReturnIndexOutOfBoundException() throws IndexOutOfBoundsException{
        int Balance = generateException.checkIndexOutOfBoundsException(4);
    }
    @Test(expected = NullPointerException.class)
    public void givenInputShouldReturnNullPointerException() throws NullPointerException{
        int Balance = generateException.checkNullPointerException();

    }
}