import java.util.Scanner;
public class Park {
	public static int Total(int a, int b, int c){
		return 5000/(a+b+c);
	}
	
	public static void main (String[] ages){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st side : ");
		int a = input.nextInt();
		System.out.print("Enter the 2nd side : ");
		int b = input.nextInt();
		System.out.print("Enter the 3rd side : ");
		int c = input.nextInt();
		
		System.out.println("Rounds needed to cover 5 km : " +Total(a,b,c));
	}
}


