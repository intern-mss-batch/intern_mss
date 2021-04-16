package com.sampreeth.helloworld;

import java.util.Scanner;

public class charread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a char");
		char yoursal=s.next().charAt(0);
		System.out.println("first letter = "+yoursal);
	}


}
