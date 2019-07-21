package com.stackroute.pe3;

public class ConsecutiveNumbers {
    public boolean checkConsecutiveNumber(String numbers) {
        boolean flag = false;
        int difference;

        String[] consecutiveNumbers = numbers.split(",");

        for (int i = 0; i < consecutiveNumbers.length - 1; i++) {
            difference = Integer.parseInt(consecutiveNumbers[i + 1]) - Integer.parseInt(consecutiveNumbers[i]);

            if (difference == 1 || difference == -1) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
