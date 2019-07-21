package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {
    RemoveVowel removeVowel;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
*/
    @Before
    public void setUp() {
        this.removeVowel = new RemoveVowel();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.removeVowel = null;
    }

    @Test
    public void givenStringArrayShouldReturnRemovedVowel() {
        String[] country = {"India", "UnitedStates", "Germany", "Egypt", "czechoslovakia"};
        String[] expectedResult = {"Ind", "UntdStts", "Grmny", "Egypt", "czchslvk"};
        String[] actualResult = removeVowel.vowelRemover(country);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringArrayShouldReturnErrorMessage() {
        String[] expected = {"Ind", "Unitd stts", "Gerrmny", "Egypt", "czchslvk"};
        String[] actual = {"India", "United states", "Germany", "Egypt", "czechoslovakia"};
        assertNotEquals(expected, removeVowel.vowelRemover(actual));
        assertNotNull(removeVowel.vowelRemover(actual));
    }
}