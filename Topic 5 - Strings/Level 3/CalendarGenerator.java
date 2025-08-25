import java.util.Scanner;
public class CalendarGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        printCalendar(month, year);
    }
    
    public static void printCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"};
        int[] days = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.println("   " + months[month-1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }
        
        for (int day = 1; day <= days[month-1]; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0 || day == days[month-1]) {
                System.out.println();
            }
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int day = 1;
        
        // Zeller's Congruence algorithm
        int h = (day + 13*(month + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 5) % 7; // Convert to 0=Sunday, 1=Monday, etc.
    }
}

