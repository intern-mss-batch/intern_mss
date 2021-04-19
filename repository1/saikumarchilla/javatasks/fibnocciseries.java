package beginner;

import java.util.Scanner;

public class fibnocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number to print fibnocci");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);


		for(int i=2;i<=n;i++)
		{
			int third=first+second;
			System.out.println(third);

			first=second;
			second=third;
			
		}
	

	}

}
