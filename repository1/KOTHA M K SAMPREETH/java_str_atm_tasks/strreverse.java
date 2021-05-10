package com.sampreeth.helloworld;

import java.util.Scanner;

public class strreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuffer str =new StringBuffer();
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		//str.append(str1);
		int l=str1.length();
		for (int i=l-1;i>=0;i--) {
			str.append(str1.charAt(i));
		}
		System.out.println("str: "+str);
	}

}
