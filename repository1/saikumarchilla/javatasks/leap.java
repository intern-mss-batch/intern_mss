package beginner;
import java.util.*;

public class leap {
	public static void main (String args[])
	{
		System.out.println("enter a year to tell leap or not:");
		Scanner sc =new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("it is a leap year");
				}
			}
			{
				System.out.println("it is a leap year");
			}
			
			
		}
		else
		{
			System.out.println("it is not a leap year");
		}
		
		
		
	}

}
