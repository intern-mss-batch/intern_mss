package beginner;

import java.util.Scanner;

public class nprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print prime upto that number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
				
			}
		if(count==2)
		{
			System.out.println(i);
		}
		}
		
			
		

	}

}
