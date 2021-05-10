package com.sampreeth.helloworld;

import java.util.Scanner;

public class arrstrname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String arr[]= {"asdfgh","qweer","zxcv","sdfgh","rtyuu","aweryuo"};
		System.out.println("Enter a word :");
		char s1=s.next().charAt(0);
		for(int i=0;i<arr.length;i++)
		{
			if(s1==arr[i].charAt(0)) {
				System.out.println(arr[i]);
			}
		}
	}

}
