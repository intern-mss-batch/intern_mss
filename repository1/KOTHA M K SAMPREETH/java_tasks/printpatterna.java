package com.sampreeth.helloworld;
import java.util.*;
public class printpatterna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int r = s.nextInt();
		for(int i=0;i<r;i++) {
		System.out.print("\n");
			for(int j=1;j<=r-1;j++) {
				System.out.print(" ");
			}
			if(i==0) {
				System.out.printf(" 1");
			}
			else {
				int no=(int)Math.pow(11, i+1);
				while(no!=0) {
					System.out.printf("%d", no%10);
					no=no/10;
				}
			}
		}
	}

}
