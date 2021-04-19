package beginner;
import java.util.*;

public class divisible {
	void div(int n)
	{
		if(n%3==0||n%5==0)
		{
			System.out.println("it divisible");
		}
		else
		{
			System.out.println("it is not divisible");
		}
	}
	public static void main(String args[])
	{
	 System.out.println("enter a number to check which divisible by 3 and 5");
	 Scanner sc=new Scanner(System.in);
	 int no=sc.nextInt();
	 divisible obj=new divisible();
	 obj.div(no);
	 
	 
	 
	 
		
	}

}
