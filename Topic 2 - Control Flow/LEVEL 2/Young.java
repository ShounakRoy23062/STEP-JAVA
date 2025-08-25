import java.util.Scanner;
public class Young{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables and taking user input
		int age1,age2,age3,h1,h2,h3;
		System.out.print("Enter the age of Amar : ");
		age1 = input.nextInt();
		System.out.print("Enter the height of Amar : ");
		h1 = input.nextInt();
		System.out.print("Enter the age of Akbar : ");
		age2 = input.nextInt();
		System.out.print("Enter the height of Akbar : ");
		h2 = input.nextInt();
		System.out.print("Enter the age of Anthony : ");
		age3 = input.nextInt();
		System.out.print("Enter the height of Anthony : ");
		h3 = input.nextInt();
		
		//Using conditional statements
		if(age1 < age2 && age1 < age3){
			System.out.println("Amar is the youngest.");
		}
		else if(age2 < age1 && age2 < age3){
			System.out.println("Akbar is the youngest.");
		}
		else{
			System.out.println("Anthony is the youngest.");
		}
		
		if(h1 > h2 && h1 > h3){
			System.out.println("Amar is the tallest.");
		}
		else if(h2 > h1 && h2 > h3){
			System.out.println("Akbar is the tallest.");
		}
		else{
			System.out.println("Anthony is the tallest.");
		}
	}
}


		