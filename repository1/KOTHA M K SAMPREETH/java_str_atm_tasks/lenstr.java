package com.sampreeth.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class lenstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String s1=s.nextLine();
		String arr[]=s1.split("");
		int i=0;
		
		for(String c:arr) {
			i+=1;
		}
		System.out.println("lenght "+i);
		Arrays.sort(arr);
		s1=s1.join("", arr);
		System.out.println("Sorted str : "+s1);
	}

}
