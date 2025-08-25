import java.util.Scanner;
public class Swap{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n1, n2, temp;
		System.out.print("Enter 1st number : ");
		n1 = input.nextInt();
		System.out.print("Enter 2nd number : ");
		n2 = input.nextInt();
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("The swaped numbers are " +n1+ " and " +n2);
	}
}


