package com.sampreeth.helloworld;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		 int i,sum=0,temp; 
		  temp=n;    
		  while(n>0){    
		   i=n%10;  
		   sum=(sum*10)+i;    
		   n=n/10;    
		  }    
		if(sum==temp) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not a palindrom");
		}
	}

}
