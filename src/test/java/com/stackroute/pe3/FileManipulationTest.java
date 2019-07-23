package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileManipulationTest {
    FileManipulation file;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
*/
    @Before
    public void setUp() {
        this.file = new FileManipulation();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.file = null;
    }

    @Test
    public void givenInputShouldReturnFileContent() throws IOException {
        String fileLocation="/home/cgi/Desktop/test.txt";
        String expectedResult="this is stackroute";

        String actualResult=file.getFileContent(fileLocation);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenWrongInputShouldReturnException() throws IOException {
        String fileLocation="/home/cgi/Desktop/test1.txt";
        String expectedResult="Error reading file named '" + fileLocation+ "'";

        String actualResult=file.getFileContent(fileLocation);
        assertEquals(expectedResult,actualResult);
    }

}