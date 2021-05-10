package com.sampreeth.helloworld;

import java.util.Scanner;

public class vowconstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String s1=s.nextLine();
		int c=0;
		 for (int i = 0; i < s1.length(); i++)
	        {
	            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e'|| s1.charAt(i) == 'i'|| s1.charAt(i) == 'o'|| s1.charAt(i) == 'u')
	            {
	                c+=1;
	            }
	        }
		System.out.println("vowels: "+c+"\n"+"cons :"+(s1.length()-c));
	}
}
