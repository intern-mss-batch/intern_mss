package com.sampreeth.helloworld;

import java.util.Scanner;

public class validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10");
		int a=s.nextInt();
		if(a>=1 && a<=10) {
			System.out.println("Its valide");
		}
		else
			System.out.println("not valide");
	}

}
