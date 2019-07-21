package com.stackroute.pe3;

class insufficientBalanceException extends Exception{
    insufficientBalanceException(String s){
        super(s);
    }
}

public class UserDefinedException {
    private int balance;

    public int checkBalance(int balance) throws insufficientBalanceException{
            if (balance < 5000)
                throw new insufficientBalanceException("Error");
            else {
                return balance;
            }
    }
}