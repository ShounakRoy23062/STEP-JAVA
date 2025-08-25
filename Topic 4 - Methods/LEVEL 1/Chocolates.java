import java.util.Scanner;
public class Chocolates {
	
	//Method to find remainder and quotient
    public static int[] findQnR(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        //Return both in an array
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number of chocolates : ");
        int chocolates = input.nextInt();

        System.out.print("Enter the number of children : ");
        int children = input.nextInt();
		
		if (children == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = findQnR(chocolates, children);

            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}


