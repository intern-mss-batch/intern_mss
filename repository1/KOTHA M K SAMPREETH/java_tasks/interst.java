package com.sampreeth.helloworld;

import java.util.Scanner;

public class interst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter loan amount");
		int a=s.nextInt();
		System.out.println("Enter rate");
		int b=s.nextInt();
		long i=a*b;
		System.out.println("interst is "+i);
	}

}
