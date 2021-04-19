package beginner;

import java.util.Scanner;

public class noofdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a month to tell no of days");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m== 1 || m== 3 ||m== 5 ||m== 7 ||m== 8 ||m== 10 ||m== 12)
		{
			System.out.println(" 31 days" );
		}
		else if(m==2)
		{
			System.out.println(" 29 days" );
		}
		else
		{
			System.out.println(" 30 days" );
		}

	}

}
