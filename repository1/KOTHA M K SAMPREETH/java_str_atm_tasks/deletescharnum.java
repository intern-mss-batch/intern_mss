package com.sampreeth.helloworld;

import java.util.Scanner;

public class deletescharnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		str1=str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(str1);
	}
}
