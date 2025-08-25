import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variable
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using loops
		for (int i = 1; i < n+1; i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
				continue;
			}
			if(i%3 == 0){
				System.out.println("Fizz");
				continue;
			}
			if(i%5 == 0){
				System.out.println("Buzz");
				continue;
			}
			else{
				System.out.println(i);
			}
		}
	}
}




			