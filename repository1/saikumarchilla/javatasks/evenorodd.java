package beginner;
import java.util.*;

public class evenorodd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find even or odd");
		int nu= sc.nextInt();
		if(nu%2==0)
		{
			System.out.println("it is an even number");
		}
		else
		{
			System.out.println("it is an odd number");
		}
	}

}
