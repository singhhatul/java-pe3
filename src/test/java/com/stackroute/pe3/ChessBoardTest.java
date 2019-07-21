//package com.stackroute.pe3;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ChessBoardTest {
//    ChessBoard chessBoard;
//
//    /* @Before annotation is used on a method containing Java
//    code to run before each test case. i.e it runs before each test execution.
//    In the setup method ,object of class is declared
//*/
//    @Before
//    public void setUp() {
//        this.chessBoard = new ChessBoard();
//    }
//
//    /*  @After annotation is used on a method containing java code to run after each test case.
//    These methods will run even if any exceptions are thrown in the test case or in the case
//    of assertion failures.
//    In the tear down method ,object is initialized with null so that obj is destroyed
//    */
//    @After
//    public void tearDown() {
//        this.chessBoard = null;
//    }
//
//    @Test
//    public void givenInputOfRowColumnShouldReturnChessBoard() {
//        String[][] expectedResult = {{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
//                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
//                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
//                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
//                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
//                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
//                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
//                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}};
//
//        String[][] actualResult = chessBoard.getChessBoard(8, 8);
//        assertArrayEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void givenNegativeInputShouldReturnNull() {
//        String[][] expectedResult = null;
//
//        String[][] actualResult = chessBoard.getChessBoard(-8, 8);
//        assertArrayEquals(expectedResult, actualResult);
//
//    }
//}