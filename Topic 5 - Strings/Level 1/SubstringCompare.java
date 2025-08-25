import java.util.Scanner;
public class SubstringCompare {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//User input
        System.out.print("Enter a string: ");
        String text = input.nextLine().trim();

        System.out.print("Enter substring start index: ");
        int start = input.nextInt();
        
        System.out.print("Enter substring end index: ");
        int end = input.nextInt();
        
		//Index in valid range
        if (start >= 0 && start < text.length() && end > start && end <= text.length()) {
            StringBuilder subs = new StringBuilder();
            for (int i = start; i < end; i++) {
                subs.append(text.charAt(i));
            }
			
			//Printing output
            System.out.println("Substring using charAt(): " + subs.toString());
            System.out.println("Substring using substring(): " + text.substring(start, end));
        } else {
            System.out.println("Please enter valid start and end indexes");
        }
    }
}		


