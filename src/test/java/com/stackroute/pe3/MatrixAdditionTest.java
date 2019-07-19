package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;

    /* @Before annotation is used on a method containing Java
 code to run before each test case. i.e it runs before each test execution.
I   n the setup method ,object of class is declared
 */
    @Before
    public void setUp()  {
        //arrange
        this.matrixAddition = new MatrixAddition();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */
    @After
    public void tearDown() {

        matrixAddition = null;
    }

    @Test
    public void givenTwoMatrixShouldReturnAdditionOfMatrix() {
        int noOfRowOfMatrix1=3;
        int noOfColOfMatrix1=2;
        int noOfRowOfMatrix2=3;
        int noOfColOfMatrix2=2;

        int[][] matrix1 = { { 1, 2 }, { 3, 4 },{ 5, 6} };
        int[][] matrix2 = { { 9, 8 }, { 7, 6 },{ 5, 4} };
        int[][] actualresult =matrixAddition.additionOfMatrix(matrix1,matrix2,noOfColOfMatrix1
                                          ,noOfRowOfMatrix1,noOfColOfMatrix2,noOfRowOfMatrix2);
        //assertEquals("successfully added given two matrix",actualresult);
        assertArrayEquals(matrix1,matrix2);

    }

    @Test
    public void givenTwoMatrixShouldReturnAdditionOfMatrix() {
        int noOfRowOfMatrix1=3;
        int noOfColOfMatrix1=2;
        int noOfRowOfMatrix2=2;
        int noOfColOfMatrix2=2;

        int[][] matrix1 = { { 1, 2 }, { 3, 4 },{ 5, 6} };
        int[][] matrix2 = { { 9, 8 }, { 7, 6 } };
        String actualresult =matrixAddition.additionOfMatrix(matrix1,matrix2,noOfColOfMatrix1
                                          ,noOfRowOfMatrix1,noOfColOfMatrix2,noOfRowOfMatrix2);
        assertEquals("number of rows and column should be equal of both matrix",actualresult);

    }
}