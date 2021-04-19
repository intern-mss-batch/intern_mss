package beginner;

import java.util.Scanner;

public class loopeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print even numbers upto n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("even numbers are");
		int i=1;
		for(int j=1;j<=n;j++)
		{
			if(j%2==0)
			{
				System.out.println(j);
				
				
			}
			
		}
		while(i!=n+1)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
				
			}
			i++;
			
		}
		int k=1;
		do
		{
			if(k%2==0)
			{
				System.out.println(k);
				
				
			}
			k++;
			
		}while(k!=n+1);


	}

}
