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
    public void setUp()  {
        this.removeVowel=new RemoveVowel();
    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.removeVowel=null;
    }

    @Test
    public void givenStringArrayShouldReturnRemovedVowel(){
        String[] country={"India","United States","Germany","Egypt","czechoslovakia"};
        String[] expectedResult={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        String[] actualResult=removeVowel.vowelRemover(country);
        assertArrayEquals(noVowelContry,actualResult);
    }
    @Test
    public void givenStringArrayShouldReturnErrorMessage(){
        String[] country={"India",null,"Germany","Egypt","czechoslovakia"};
        String[] expectedResult={"Ind","can't be null","Grmny","Egypt","czchslvk"};
        String[] actualResult=removeVowel.vowelRemover(country);
        assertArrayEquals(noVowelContry,actualResult);
    }


}