import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;
public class Calender {

    // Array of month names
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month (non-leap year)
    static int[] monthDays = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get month and year from user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
        scanner.close();
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return monthDays[month - 1];
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    // Method to calculate the first day of the month using Gregorian formula
    public static int getFirstDayOfMonth(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(1, month, year);

        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for first week
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // New line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Move to next line after printing all days
    }
}

	