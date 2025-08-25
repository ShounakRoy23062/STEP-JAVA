import java.util.Scanner;
public class StringCompare {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the first string : ");
		String a = input.nextLine();
		System.out.print("Enter the second string : ");
		String b = input.nextLine();
		
		//Using boolean function
		boolean isEqualCharAt = true;
		
		//Comparing using CharAt method
		if(a.length() != b.length()){
			isEqualCharAt = false;
		} else {
			for(int i = 0; i < a.length() ; i++){
				if(a.charAt(i) != b.charAt(i)){
					isEqualCharAt = false;
					break;
				}
			}
		}
		
		//Compare using Equals method
		boolean isEqualEqualsMethod = a.equals(b);
		
		//Printing output
		System.out.println("Comparision using CharAt : " +isEqualCharAt);
		System.out.println("Comparision using Equals : " +isEqualEqualsMethod);
		
		if(isEqualCharAt == isEqualEqualsMethod){
			System.out.println("Both method gives the same result.");
		}else{
			System.out.println("Both method gives different result.");
		}
	}
}


