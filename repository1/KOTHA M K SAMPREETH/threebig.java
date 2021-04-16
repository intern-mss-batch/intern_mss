package com.sampreeth.helloworld;

import java.util.Scanner;

public class threebig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		System.out.println("Enter b value");
		int b=s.nextInt();
		System.out.println("Enter c value");
		int c=s.nextInt();
		System.out.println("answer "+ (( a>b&&a>c ) ? "a is big" :( (b>a&&b>c) ? "b is big":"c is big" )));
	}

}
