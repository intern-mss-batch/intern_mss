package com.sampreeth.helloworld;

import java.util.Scanner;

public class nprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		  for(int i = 1; i <= a; i++) {                    
	            int c = 0;
	            for (int j=1;j<=i;j++) {
	                if (i % j == 0) {
	                    c++;
	                }
	            }
	            if(c == 2) {
	            	System.out.println(i);
	            }
	        }
	}

}
