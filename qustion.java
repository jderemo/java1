import java.util.Scanner;
public class qustion {
public static final int current=2022; // curreent year 
	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		System.out.println("what is your name?");
		String name=key.next();
		System.out.println("How old are you?");
		int age = key.nextInt();
		System.out.println("What is your Major?");
		String major=key.next();
        System.out.println("Are you a Freshman, Sophomore, Junior or Senior ");
        String year =key.next();
       System.out.println(" Do you have a minor? Enter true or false");       
       boolean minor=key.nextBoolean();
       int yearBorn=current-age;
       System.out.println("What state are you from?");
       String state=key.next();
       System.out.println("What is your favorite movie?");
      String movie=key.next();
      
       System.out.println("What is your lucky number");
       int luckyNumber =key.nextInt();
       System.out.println("Here’s an quick intro for "+name);
       if(minor ==true)//this if statement give outcome based of if the person has a minor
		{System.out.println("You where born in the year "+yearBorn+" your major is "+ major+" you have a minor  you are a "+year );
		System.out.println("you are from "+state+" your favorite movie is  "+movie+" and your luck number is "+luckyNumber);
		}
		else
		{
			System.out.println("You where born in the year "+yearBorn+" your major is "+ major+" you do not have a minor  you are a "+year );
			System.out.println("you are from "+state+" your favorite movie is  "+movie+" and your luck number is "+luckyNumber);
		}
		
      /* System.out.println("Here’s an quick intro for "+name);
       System.out.println("You where born in the year "+yearBorn+" your major is "+ major+"you have a minor "+minor+" you are a "+year );
       System.out.println("you are from "+state+" your favorite movie is  "+movie+" and your luck number is "+luckyNumber);
   */    	}

}
