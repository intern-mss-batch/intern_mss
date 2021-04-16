package com.sampreeth.helloworld;

import java.util.Scanner;

public class factn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter range value");
		int b=s.nextInt();
		float sum=1;
		for(int c=1;c<=b;c++) {
			int fact=1;
			for(int d=c;d>1;d--) {
				fact=fact*d;
			}
			System.out.println("factorial of "+c+" is "+fact);
		}
		
	}

}
