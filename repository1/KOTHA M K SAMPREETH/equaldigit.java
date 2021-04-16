package com.sampreeth.helloworld;

import java.util.Scanner;

public class equaldigit {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		String str=Integer.toString(a);
		//str=str+"\n";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				System.out.println("not equal");
			}
			else {
				System.out.println("equal");
			}
		}
	}

}
