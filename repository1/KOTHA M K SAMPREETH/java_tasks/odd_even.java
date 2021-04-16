package com.sampreeth.helloworld;

import java.util.*;

/**
 * @author kmksa
 *
 */
public class odd_even {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println(a+" is even");
		}
		else {
			System.out.println(a+" is odd");
		}
	}

}