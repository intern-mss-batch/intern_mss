package com.sampreeth.helloworld;

import java.util.Scanner;

public class big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		if(a>b)
		System.out.println(a+" is big");
		else
			System.out.println(b+" is big");
	}
}
