public class Volume{
	public static void main (String[] args){
		int r = 6378;
		double VofSph = 4/3 * 22/7 * r*r*r;
		double VinMiles = VofSph/1.6;
		double miles = (double) VinMiles;
		
		System.out.println(" The volume of earth in cubic kilometers is " +VofSph+ " and cubic miles is " +miles+ ".");
	}
}


