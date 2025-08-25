import java.util.Scanner;
public class MulTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n,m;
		System.out.print("Enter a number from 6 to 9 : ");
		n = input.nextInt();
		
		//Using loops
		if(n >= 6 && n <= 9){
			for (int i = 1; i < 11; i++){
				m=n*i;
				System.out.println(n+ " x " +i+ " = " +m);
			}
		}else{
			System.out.println("You haven't entered a number from 6 to 9");
		}
	}
}



