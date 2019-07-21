package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
        StudentMarks studentMarks;

    /* @Before annotation is used on a method containing Java
    code to run before each test case. i.e it runs before each test execution.
I   n the setup method ,object of class is declared
    */
    @Before
    public void setUp()  {
        //arrange
        this.studentMarks = new StudentMarks();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {

        studentMarks = null;
    }

    /* this function will take input of number of students and 4 grades of students and should return
    same output as input
     */
    @Test
    public void givenInputShouldReturnSameOutput() {
        int[] grades={12,30,60,80};
        String actualresult = studentMarks.getGrades(4,grades);
        assertEquals("no of students and grades are correct", actualresult);
    }
    /* this function will input of negative number of studnts and 4 grades of students and should return
    error message
     */
    @Test
    public void givenNegativeInputShouldReturnErrorMessage() {
        int[] grades={12,30,60,80};
        String actualresult = studentMarks.getGrades(-4,grades);
        assertEquals("no of student should not be less than zero", actualresult);
    }
    /* this function will input 4 grades of students and should return successful message that value is in range
     */
    @Test
    public void givenInputShouldReturnPassedMessage() {
        int[] grades={20,30,60,80,70,20,0};
        String actualresult = studentMarks.getGrades(7,grades);
        assertEquals("no of students and grades are correct", actualresult);
    }
    /* this function will input 4 grades of students and should return error message that value should be in range
     */
    @Test
    public void givenInputShouldReturnErrorMessage() {
        int[] grades={120,300,-60,-80,46,0,58,90};
        String actualresult = studentMarks.getGrades(8,grades);
        assertEquals("grades are out of range", actualresult);
    }
}