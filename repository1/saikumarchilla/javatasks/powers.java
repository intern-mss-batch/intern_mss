package beginner;

import java.util.Scanner;

public class powers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print denominator  square numbers upto n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double result=0;
		for(double i=1; i<=n; i++)
		{
		result=(1/Math.pow(2,i));
		System.out.println("1/2^"+ i);
		
		
		}
		System.out.println("sum"+result);

	}

}
