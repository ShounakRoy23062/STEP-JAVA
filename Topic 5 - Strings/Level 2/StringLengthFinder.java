import java.util.Scanner;
public class StringLengthFinder {
	
	//Finding length of the string
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
	
	//User defined method and built in function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        int customLength = findLength(str);
        int builtInLength = str.length();
        System.out.println("Length (using custom method): " + customLength);
        System.out.println("Length (using built-in method): " + builtInLength);
    }
}



