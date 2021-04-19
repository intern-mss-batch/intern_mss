package beginner;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to find factorial");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>1;i--)
		{
			 fact=fact*i;
			}
		System.out.println("factorial"+ fact);

	}

}
