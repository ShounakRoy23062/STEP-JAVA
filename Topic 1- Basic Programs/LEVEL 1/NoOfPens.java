public class NoOfPens{
	public static void main (String[] args){
		int stud = 3;
		int pens = 14;
		
		int pens_per_person = pens / stud;
		int remaining_pens = pens % stud;
		
		System.out.println("The Pen Per Student is " +pens_per_person+ " and the remaining pen not distributed is " +remaining_pens+ ".");
	}
}

