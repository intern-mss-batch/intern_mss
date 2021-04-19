package beginner;

import java.util.Scanner;

public class axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("enter co-ordinates");
			Scanner sc =new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0 && y>0)
			{
				System.out.println("y-axis");
			}
			else if(x==0 && y==0)
			{
				System.out.println("origin");
			}
			else if(x>0 && y==0)
			{
				System.out.println("x-axis");
			}
			else
			{
				System.out.println("both");
			}
			

	}

 }
}
