package com.sampreeth.helloworld;

public class fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		for(int i=0;i<5;i++) {
			sum=a+b;
			System.out.println(b);
			a=b;
			b=sum;
		}
		
		}

}
