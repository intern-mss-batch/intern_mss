package com.sampreeth.helloworld;

public class largedivisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c=0;
		int max=0;
		int n=0;
		for(int i=1;i<=10000;i++) {
			int c=0;
			for(int j=i;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
					if(c<max) {
						max=c;
						n=i;
					}
			}
			
		}
		System.out.println(n+ " "+ max);
	}

}
