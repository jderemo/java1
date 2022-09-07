import java.util.Scanner;

public class Volume {
public static final double PI=3.14;
	public static void main(String[] args) {
		Scanner key =new Scanner(System.in);/*
		System.out.println("enter hight (in inches ) of the right cylinder ");
		double hight=key.nextDouble();
	System.out.println("enter radius (in inches  )of the right cylinder");
	double radius =key.nextDouble();
	
	double volume = PI* Math.pow(radius,2) * hight;
	System.out.println("volume = " + volume+ "cubic inches ");
*/

/*System.out.println("what us your fravorite movie with a single word");
String movie=key.next()	;
System.out.println("how many time did you watch this movie");
		int count=key.nextInt();
		System.out.println("you watch "+movie+""+count+" times");
		System.out.println("do you like to watch comedy movies? enter true or flase")	;
		boolean userPrefreence=key.nextBoolean();
			System.out.println("does the user like comedy movies? "+userPrefreence);*/
			System.out.println("do you want to eat ice cream \"Yes\"or\"no\":");
		String iceCream=key.next();
		System.out.println("the user says"+iceCream+"to ice cream");
		System.out.println("what is your favorite brand of chips");
		// read the remabier of scanner
		key.nextLine();
		String brand=key.nextLine();
		System.out.println("how many time a week do you eat chips");
		int chips = key.nextInt();
		
		System.out.println("you say "+"to ice cream and you eat this brand of chips "+brand+" this many times a week "+chips);
		
		
	
		
		
	}
}
