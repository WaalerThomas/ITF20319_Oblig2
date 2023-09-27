package no.thomaswaaler;

public class GregorianCalendar {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;

        return true;
    }
}