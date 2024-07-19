package ss9.bai_tap;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        if (day == getLastDayofMont(month, year)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month = month + 1;
            }
        } else {
            day++;
        }
        return day + "/" + month + "/" + year;
    }
    private static int getLastDayofMont(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}


