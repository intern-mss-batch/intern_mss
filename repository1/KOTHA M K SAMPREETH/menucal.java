package com.sampreeth.helloworld;

import java.util.Scanner;

public class menucal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Press + for addition \n Press - for sub \n press * for mul\n press / for div : ");
		char c = s.next().charAt(0);
		switch (c) {
		case '+' : System.out.println("= "+ (a+b));
					break;
		case '-' : System.out.println("= "+(a-b));
					break;
		case '*' : System.out.println("= "+(a*b));
					break;
		case '/' : System.out.println("= "+(a/b));
					break;
		}
	}

}
