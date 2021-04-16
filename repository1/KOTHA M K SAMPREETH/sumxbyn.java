package com.sampreeth.helloworld;

import java.util.Scanner;

public class sumxbyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x value");
		int x=s.nextInt();
		System.out.println("Enter range value");
		int b=s.nextInt();
		float sum=1;
		for(int c=1;c<=b;c++) {
			int fact=1;
			for(int d=c;d>1;d--) {
				fact=fact*d;
			}
			
			sum += ((Math.pow((float)x,(float)c))/fact);System.out.println(sum);
		}
		System.out.println("sum is "+sum);
	
	}

}
