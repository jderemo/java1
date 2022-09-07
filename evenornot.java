import java.util.Scanner;
public class evenornot {

	public static void main(String[] args) {
		Scanner key =new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num =(int)key.nextDouble();//type casting
		if(num%2 == 0)
		{
			System.out.println(num+" is a even Number! ");
		}
		else
		{System.out.println(num+" is an odd number!");
	}

}}
