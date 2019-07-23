package com.stackroute.pe3;

public class ChessBoard {
    public String[][] getChessBoard(int row, int col) {
        String resultArray[][] =null;
        if (row < 0 || col < 0) {
            return resultArray;
        } else {
            resultArray = new String[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (((i + j) % 2) == 0) {
                        resultArray[i][j] = "WW|";
                    } else {
                        resultArray[i][j] = "BB|";
                    }
                }
            }
            return resultArray;
        }
    }
}

