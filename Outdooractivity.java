import java.util.Scanner;
public class Outdooractivity {

	public static void main(String[] args) {
		Scanner key =new Scanner(System.in);
		System.out.println("what is the temperature (in degrees) outside");
		int temp= key.nextInt();
		String response="";
		if(temp<-144 || temp>134)
		{
			System.out.println("Invadlid temperure for plannet earth!");
			System.exit(0);
		}
		else if(temp>= 10&&temp<55)
		{
			response ="too cold";
			}
		else if (temp>=55&& temp<80)
		{
			response= "ideal";
		}
		else if (temp>=80 && temp <110)
		{
			 response= "too hot";
		}
		else
		{
			 response = "unsuited to outside activy";
		}
		System.out.println("Is it raining outside ? enter ?\'true\' or \"flase\':");
		boolean rain = key.nextBoolean();
		if(rain==true)
		{System.out.println("it is raining outside and the temerature is "+ response+" for outdoor activlity");
		}
		else
		{
			System.out.println("it is not raining outside and the temerature is "+ response+" for outdoor activlity");
		}
		
		/*10-55 cold
        55-80 ideal
        80-110 hot*/
		
	}

}
