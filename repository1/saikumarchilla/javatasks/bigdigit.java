package beginner;

import java.util.Scanner;

public class bigdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print big number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int big=0;
		while(n!=0)
		{
			if(n%10>big)
			{
				big=n%10;
				
				
			}n=n/10;
		}
		System.out.println("biggest is"+big);
		
	}
	
}
