package com.stackroute.pe3;

public class MatrixAddition {

    public int[][] additionOfMatrix(int[][] matrix1, int[][] matrix2, int noOfColOfMatrix1
            , int noOfRowOfMatrix1, int noOfColOfMatrix2, int noOfRowOfMatrix2) {

        int i;
        int j;
        int addedMatrix[][] = new int[noOfRowOfMatrix1][noOfColOfMatrix1];
        if ((noOfColOfMatrix1 != noOfColOfMatrix2) || (noOfRowOfMatrix1 != noOfRowOfMatrix2)) {
            return null;
        }else{

        for (i = 0; i < noOfRowOfMatrix1; i++) {
            for (j = 0; j < noOfColOfMatrix2; j++) {
                addedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return  addedMatrix;
    }}
}

