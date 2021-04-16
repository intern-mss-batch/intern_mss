package com.sampreeth.helloworld;

import java.util.Scanner;

public class digitchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		char c = s.next().charAt(0);
		int a=c;
		if(a>=97 && a<=122)
		System.out.println("answer is char "+ a );
		else if(a>=65 && a<=90) {
			System.out.println("answer is char"+a);
		}
		else if (a>=48 && a<=57) {
			System.out.println("answer is number"+a);
		}
		else {
			System.out.println("Enter valid char");
		}
	}

}
