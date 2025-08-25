public class Fee{
	public static void main (String[] args){
		int fee = 125000;
		double discount_percent = 10;
		double discount = fee/discount_percent;
		double final_amount = fee - discount;
		
		System.out.println("The discount amount is INR " +discount+ " and the remaining pen not distributed is " +final_amount+ ".");
	}
}

