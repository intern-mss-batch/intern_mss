package com.sampreeth.helloworld;

import java.util.Scanner;

public class squrn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		int b;
		for(b=1;b<=a;b++) {
			System.out.println("squr of "+ b+" is" + (b*b));
		}
	
	}
}
