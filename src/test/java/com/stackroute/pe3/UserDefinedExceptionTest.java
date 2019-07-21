package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UserDefinedExceptionTest {
    UserDefinedException userExcepton;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
*/
    @Before
    public void setUp()  {
        this.userExcepton=new UserDefinedException();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.userExcepton = null;
    }


    @Test(expected = insufficientBalanceException.class)
    public void UserExceptionTesting() throws insufficientBalanceException {
        int Balance = userExcepton.checkBalance(4000);
    }

    @Test
    public void givenBalanceShouldReturnBalance()throws insufficientBalanceException{
        int balance=userExcepton.checkBalance(6000);
        assertEquals(6000,balance);
    }
}