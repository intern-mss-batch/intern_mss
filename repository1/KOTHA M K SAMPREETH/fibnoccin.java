package com.sampreeth.helloworld;

import java.util.Scanner;

public class fibnoccin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		for(int i=0;i<n;i++) {
			sum=a+b;
			System.out.println(b);
			a=b;
			b=sum;
		}
	}

}
