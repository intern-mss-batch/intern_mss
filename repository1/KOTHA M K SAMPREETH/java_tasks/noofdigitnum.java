package com.sampreeth.helloworld;

import java.util.Scanner;

public class noofdigitnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		String str=Integer.toString(a);
		System.out.println("no of digits "+str.length());
	}

}
