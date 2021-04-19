package beginner;

import java.util.Scanner;

public class fibnocci {
	public static void main(String args[])
	{

	System.out.println("enter a number to tell palindrome or not");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int r=0;
	int n1=n;
	while(n!=0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	
	if(n1==sum)
	{
		System.out.println("it is a palindrome ");
	}
	else
	{
		System.out.println("it is  not a palindrome " +n);
	}
}
}
