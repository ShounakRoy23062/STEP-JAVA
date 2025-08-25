import java.util.Scanner;
public class SpringSeason {
	public static boolean isSpring(int month, int date){
		if((month == 3 && date >= 20 ) ||
			(month == 4) ||
			(month == 5) ||
			(month == 6 && date <= 20)){
				return true;
			}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter month : ");
		int month = input.nextInt();
		
		System.out.print("Enter date : ");
		int date = input.nextInt();
		
		if(isSpring(month,date)){
			System.out.println("Spring Season.");
		}else{
			System.out.println("Not Spring Season.");
		}
	}
}


