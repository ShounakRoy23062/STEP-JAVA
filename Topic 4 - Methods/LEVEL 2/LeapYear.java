import java.util.Scanner;
public class LeapYear {
	
	//Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input year from user
        System.out.print("Enter a year : ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582.");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}




	
	
	
	
	
	
	