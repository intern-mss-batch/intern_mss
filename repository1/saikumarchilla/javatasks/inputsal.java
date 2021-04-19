package beginner;

import java.util.Scanner;

public class inputsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your salary ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("your salary is "+ n);
		System.out.println("enter your name ");
		String nm=sc.next();
		System.out.println(" your name is " + nm);
		System.out.println("enter time in hours ");
		int t=sc.nextInt();
		int sec=0;
		sec=t*3600;
		System.out.println("time in seconds  "+ sec);
		final double hsec=3600;
		System.out.println("enter time in minutes ");
		int m=sc.nextInt();
		double hour=m/hsec;
		System.out.println("time in hours "+ hour);
		
		
		
		
	}

}
