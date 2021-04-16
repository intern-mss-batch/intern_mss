package com.sampreeth.helloworld;

import java.util.Scanner;

public class n_even {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		int b;
		int sum=0;
		for(b=1;b<=a;b++) {
			if(b%2==0) {
				sum +=b;
			System.out.println(b+" is even");
			}
		}
		System.out.println("Sum is "+ sum);
	}
}
