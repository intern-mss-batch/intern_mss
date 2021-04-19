package beginner;

import java.util.Scanner;

public class big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 3 numbers to tell the biggest");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		if(i>j && i>k)
		{
			System.out.println("first number is bigger");
		}
		else if(j>i && j>k)
		{
			System.out.println("second number is bigger");
		}
		else
		{
			System.out.println("last number is bigger");
		}
	}

}
