package com.sampreeth.helloworld;

import java.util.*;

public class occofcharinstr {
	    public static void main(String[] args)
	    {
	    	Scanner s= new Scanner(System.in);
	        String str = s.nextLine();
	        int arr[] = new int[26];
	        int len = str.length();
	        str=str.toLowerCase();
	        for (int i=0; i<len; i++) {
	        	if(str.charAt(i)>97 && str.charAt(i)<=122) {
	        		arr[str.charAt(i)-97]++;
	        	}
	        }
	        for(int i=0;i<26;i++) {
	        	if(arr[i]>0) {
	        		System.out.println((char)(i+97)+" "+arr[i]);
	        	}
	        }
}
	}

