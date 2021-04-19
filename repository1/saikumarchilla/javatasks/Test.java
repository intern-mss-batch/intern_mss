package beginner;
import java.util.*;

public class Test {
	

public static void main(String args[])
 {
	int i;
	Scanner scan = new Scanner(System.in);

	System.out.println("enter a number");
	i=scan.nextInt();
	
	
	if(i>0)
	{
		System.out.println("positive number");
	}
	else
	{
		System.out.println("negative number");
	}
	
 }
}