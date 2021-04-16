package com.sampreeth.helloworld;

import java.util.Scanner;

public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int sum=0;
		for(int i=1; i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		if(sum==a)
		System.out.println("perfect");
		else
			System.out.println("Not a perfect");
	}

}
