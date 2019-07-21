package com.stackroute.pe3;

public class StudentMarks {
    //String marks;
    public String getGrades(int n, int[] grades) {

        for(int i=0;i<grades.length;i++){
            if (grades[i] < 0 || grades[i]>100) {
                return "grades are out of range";
            }
        }
        if (n < 0) {
            return "no of student should not be less than zero";
        } else {
            return "no of students and grades are correct";
        }

    }
}
