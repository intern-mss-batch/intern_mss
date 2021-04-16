package com.sampreeth.helloworld;

import java.util.Scanner;

public class dowhilemul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=s.nextInt();
		int b=1;
		do{
			System.out.println(a+" * "+ b+" = "+(a*b) );
			b++;
		}while(b<=12);
	
	}
	}
