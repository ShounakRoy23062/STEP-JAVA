import java.util.Scanner;
public class FizzBuzz2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variable
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		int i = 1;
		
		//Using while loop
		while(i <= n){
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
			i++;
		}
	}
}

