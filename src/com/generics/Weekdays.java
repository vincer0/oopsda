package com.generics;

public enum Weekdays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        switch(this) {
            case FRIDAY:
            case MONDAY:
            case THURSDAY:
            case WEDNESDAY:
            case TUESDAY:
                return true;
            default:
                return false;
        }
    }

    public void whichIsGreater(Weekdays day) {
        if(this.ordinal() < day.ordinal()) {
            System.out.printf("%s jest wczesniej niz %s\n", this, day);
        } else if(this.ordinal() == day.ordinal()) {
            System.out.printf("To jest ten sam dzien!\n");
        } else {
            System.out.printf("%s jest pozniej niż %s\n", day, this);
        }
    }
}
