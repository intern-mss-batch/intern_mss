package beginner;

import java.util.Scanner;

public class sumofint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to perform summation upto that number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		if(sum>50)
		{
			System.out.println("you reached your limit");
		}
		else
		{
			System.out.println(sum);
		}

	}

}
