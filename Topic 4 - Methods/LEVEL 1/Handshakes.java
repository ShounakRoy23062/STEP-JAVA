import java.util.Scanner;
public class Handshakes {
	
	//Method to calculate number of handshakes
	public static int calculation(int n){
		return (n*(n-1))/2;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		//Taking user input
		System.out.print("Enter the number of students : ");
		int num = input.nextInt();
		
		//Printing output
		System.out.println("The total number of handshakes : " +calculation(num));
	}
}


	