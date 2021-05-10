package com.sampreeth.helloworld;

import java.util.*;

public class deletencharstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuffer str =new StringBuffer();
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		str.append(str1);
		int l=str.length();
		System.out.println("Enter ow many chars you want to delete : ");
		int n=s.nextInt();
		if(n>l) {
			System.out.println("n is more");
		}
		else {
			str.delete(0, n);
			System.out.println("String is : "+str);
		}
	}

}
