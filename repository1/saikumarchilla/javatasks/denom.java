package beginner;

import java.util.Scanner;

public class denom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print denominator numbers upto n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double result=0;
		for(double i=1; i<=n; i++)
		{
			System.out.println("1/" +i);
			 result=(result+(1/i));
			 
		}
		System.out.println(result);

	}

}
