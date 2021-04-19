package beginner;

import java.util.Scanner;

public class menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a two numbers");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("enter your choice 1:addition 2:multiplication 3:division");
		int k=sc.nextInt();
		switch(k)
		{
		case 1:
			System.out.println("addtion="+ (i+j));
			break;
		case 2:
			System.out.println("multiplication="+ (i*j));
			break;
		case 3:
			System.out.println("division="+ (i+j));
			break;
		}
	}

}
