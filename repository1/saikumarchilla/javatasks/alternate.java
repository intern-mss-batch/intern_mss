package beginner;

import java.util.Scanner;

public class alternate {
	public static void main(String[] args)
	{
		System.out.println("enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1=String.valueOf(n);
		int k=s1.length();
		int sum=Character.getNumericValue(s1.charAt(0))+Character.getNumericValue(s1.charAt(2));
		int sum1=Character.getNumericValue(s1.charAt(0))+Character.getNumericValue(s1.charAt(k-1));
		System.out.println("addition of alternate numbers"+sum);
		System.out.println("addition of first and last numbers"+ sum1);
	}

}
