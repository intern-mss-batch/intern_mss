package beginner;

import java.util.Scanner;

public class evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print even numbers upto n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("even numbers are");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
				
			}
			
		}System.out.println("sum of even numbers"+sum);

	}

}
