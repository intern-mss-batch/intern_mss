package com.sampreeth.helloworld;

import java.util.Scanner;

public class noofcharswords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String strarr[];
		strarr=str1.split(" ");
		System.out.println("words: "+strarr.length);
		System.out.println("Charsters : "+ (str1.length()-(strarr.length-1)));
	}

}
