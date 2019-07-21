package com.stackroute.pe3;

public class GenerateException {

    public int checkNegativeArrayException(int size) throws NegativeArraySizeException {
        int array[] = new int[size];
        int j = 1;

        for (int i = 0; i <= array.length; i++, j++) {
            array[i] = j;

            if (array[i] < 0)
                throw new NegativeArraySizeException();
            else {
                return size;
            }
        }
        return size;
    }

    public int checkIndexOutOfBoundsException(int size) throws IndexOutOfBoundsException{
        int array[]=new int[size];

        array[size+1]=20;
        throw new IndexOutOfBoundsException();
    }
    public int checkNullPointerException() throws NullPointerException{
        int array[]=null;

        int length = array.length;
        throw new NullPointerException();
    }
}
