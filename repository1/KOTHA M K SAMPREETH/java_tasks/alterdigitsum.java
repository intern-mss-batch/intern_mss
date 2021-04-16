package com.sampreeth.helloworld;

import java.util.Scanner;

public class alterdigitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		String str=Integer.toString(a);
		int sum=0;
		int c;
		int n;
		for(int i=0;i<str.length();i++) {
			c=str.charAt(i);
			n=Character.getNumericValue(c);
			sum=sum+n;
			i++;
		}
		System.out.println(sum);
	}

}
