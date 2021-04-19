package beginner;
import java.util.*;

public class multable {
	public static void main(String args[])
	{
		System.out.println("enter a number to print table");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=12;i++)
		{
			System.out.println(t+"*"+i+"="+(t*i));
		}
		
		
	}

}
