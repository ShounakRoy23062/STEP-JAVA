import java.util.Scanner;
import java.util.Arrays;
public class Young{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Delcaring an array
		String[] friends = {"Amar","Akbar","Anthony"};
		int[] height = new int[3];
		int[] age = new int[3];
		int sum = 0;
		
		//Taking user input and using for loop
		for(int i = 0; i < 3; i++){
			System.out.print("Enter age of " +friends[i]+ " : ");
			age[i] = input.nextInt();
			System.out.print("Enter height of " +friends[i]+ " : ");
			height[i] = input.nextInt();
		}
		
		//Youngest
		int min_Age = age[0];
		String youngest = friends[0];
		for(int i = 1; i < 3; i++){
			if(age[i] < min_Age){
				min_Age = age[i];
				youngest = friends[i];
			}
		}
		
		//Tallest
		int max_Height = height[0];
		String tallest = friends[0];
		for(int i = 1; i < 3; i++){
			if(height[i] > max_Height){
				max_Height = height[i];
				tallest = friends[i];
			}
		}
		
		//Output
		System.out.println("The youngest friend is : " +youngest+ " with age : " +min_Age);
		System.out.println("The tallest friend is : " +tallest+ " with height : " +max_Height+ " cm.");
	}
}



	
		
		
		
		
		
		
		
		