package beginner;

import java.util.Scanner;

public class avgminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter ten numbers ");
		Scanner sc=new Scanner(System.in);
		int min=999;
		int max=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int n=sc.nextInt();
			sum=sum+n;
			if(max<n)
			{
				max=n;
			}
			if(min>n)
			{
				min=n;
			}
		}
		System.out.println("min"+min);
		System.out.println("max"+ max);
		System.out.println("avg"+ sum/10);
		

	}

}
