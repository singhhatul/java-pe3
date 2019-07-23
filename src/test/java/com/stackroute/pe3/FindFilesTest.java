package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFilesTest {
    FindFiles files;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
    In the setup method ,object of class is declared
*/
    @Before
    public void setUp() {
        this.files = new FindFiles();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {
        this.files = null;
    }

    @Test
    public void givenFolderLocationShouldReturnFileCount(){
        String folderLocation="/home/cgi/Desktop/";
        int expectedResult=2;
        int actualResult=files.getFileCount(folderLocation);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenNullFolderLocationShouldReturnZero(){
        String folderLocation=null;
        int expectedResult=0;
        int actualResult=files.getFileCount(folderLocation);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenInvalidFolderLocationShouldReturnZero(){
        String folderLocation="/home/cgi/Desktop/angular videos/";
        int expectedResult=0;
        int actualResult=files.getFileCount(folderLocation);
        assertEquals(expectedResult,actualResult);
    }

}