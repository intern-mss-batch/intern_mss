package com.sampreeth.helloworld;

import java.util.*;
public class udfcomstr {

	static String com(String s1,String s2) {
		int c=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					c+=1;
				}
				else {
					return "mismatch";
				}
			}
			if(c==s1.length()) {
				return "match";
			}
		}
		else {
			return "mismatch";
		}
		return "err";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.println(com(s1,s2));
	
	}

}
