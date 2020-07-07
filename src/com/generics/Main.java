package com.generics;

public class Main {
    public static void main(String[] args) {

        System.out.println(Weekdays.MONDAY.isWeekDay());
        System.out.println(Weekdays.SUNDAY.isWeekDay());

        Weekdays.MONDAY.whichIsGreater(Weekdays.TUESDAY);
        Weekdays.SUNDAY.whichIsGreater(Weekdays.MONDAY);
    }
}
