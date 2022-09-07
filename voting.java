import java.util.Scanner;
public class voting {
public static final int MIN_AGE=18;
	public static void main(String[] args) {
		Scanner key =new Scanner(System.in);
		System.out.println("enter your age");
		int age =key.nextInt();
		if(age<0)
		{System.out.println("invalid age entered");
		System.exit(0);
		}
//voter eligbilty 
		if(age>=MIN_AGE)
		{System.out.println("You can vote");}
		
		else 
		{int wait=MIN_AGE-age;
		System.out.println("you will have to wait "+ wait+" years");
		}
		}}
