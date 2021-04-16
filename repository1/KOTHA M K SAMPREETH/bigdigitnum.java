package com.sampreeth.helloworld;

import java.util.Scanner;

public class bigdigitnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int n1=n;
		 int i,max=0;     
		  while(n>0){    
		   i=n%10;  
		   n=n/10;
		   if(i>max) {
			   max=i;
		   }
		   else {
			   i=max;
		   }
		  }
		  System.out.println(max);
	}

}
