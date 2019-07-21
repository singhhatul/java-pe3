package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalculateDate {
    public String getDate(){

        String resultDate="";

        LocalDate today = LocalDate.now();


        // Go backward to get Monday
        LocalDate monday = today;
        while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
            monday = monday.minusDays(1);
        }


        // Go forward to get Sunday
        LocalDate sunday = today;
        while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
            sunday = sunday.plusDays(1);
        }


        resultDate="First Date of Week:\n" + monday + "\nLast date of the week:\n" + sunday;
        return resultDate;


    }
}
