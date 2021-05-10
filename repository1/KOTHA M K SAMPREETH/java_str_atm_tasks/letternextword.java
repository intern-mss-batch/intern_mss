package com.sampreeth.helloworld;

import java.util.Scanner;

public class letternextword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		String s1=s.nextLine();
		String arr[]=s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			char c=arr[i].charAt(0);
			c+=1;
			arr[i]=arr[i].replace(arr[i].charAt(0),c);
			
		}
		for(String as:arr) {
			System.out.print(as+" ");
		}
	}

}
