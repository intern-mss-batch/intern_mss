package beginner;

import java.util.Scanner;

public class fseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print sries upto n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter x value ");
		int x=sc.nextInt();
		for(int i=0;i<=n;i++)
		{	if(i!=n && i!=0)
		{
			System.out.print(" + ");
		}
			System.out.print(x+" ^"+i+"/ "+i+"!  ");
		}

	}

}
