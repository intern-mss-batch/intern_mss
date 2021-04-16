package com.sampreeth.helloworld;

import java.util.Scanner;

public class even_usingloops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		int b;
		System.out.println("Using for loop");
		for(b=1;b<=a;b++) {
			if(b%2==0) {
			System.out.println(b+" is even");
			}
		}
		System.out.println("\n\n Using while loop ");
		int c=1;
		while(c<a) {
			if(c%2==0) {
				System.out.println(c+" is even");
			}
			c++;
		}
		System.out.println("\n\n Using do while loop");
		int d=0;
		do {
			if(d%2==0) {
				System.out.println(d+" is even");
			}
			d++;
		}while(d<a);
	}
	
}
