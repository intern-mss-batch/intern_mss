package com.sampreeth.helloworld;

import java.util.*;
public class itonsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(sum<50) {
			sum+=i;
			}
		}
		System.out.println("sum is " + (sum));
	
	}

}
