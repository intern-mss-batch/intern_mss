package com.sampreeth.helloworld;

import java.util.Scanner;

public class sum1by2n {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a value");
			int a=s.nextInt();
			float b;
			float sum=0;
			for(b=1;b<=a;b++) {
				sum += ((float)1/Math.pow(2.0,b));System.out.println(sum);
			}
			System.out.println("sum is "+sum);
		
		}

}
