package com.sampreeth.helloworld;

import java.util.Scanner;

public abstract class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i = 1; i <= 10; i++) {                    
	            int c = 0;
	            for (int j=1;j<=i;j++) {
	                if (i % j == 0) {
	                    c++;
	                }
	            }
	            if(c == 2) {
	            	System.out.println(i+" is prime");
	            }
	        }

}
}