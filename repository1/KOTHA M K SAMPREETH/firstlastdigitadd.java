package com.sampreeth.helloworld;

import java.util.Scanner;

public class firstlastdigitadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		String str=Integer.toString(a);
		int i1= Character.getNumericValue(str.charAt(0));
		int i2=Character.getNumericValue(str.charAt(str.length()-1));
		System.out.println("answer"+(i1+i2));
	}

}
