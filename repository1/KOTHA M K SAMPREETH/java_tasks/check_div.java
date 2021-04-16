package com.sampreeth.helloworld;

import java.util.*;

public class check_div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%5==0 && n%3==0) {
			System.out.println(n+" is divisible");
		}
		else {
			System.out.println(n+" is not divisible");
		}
	}

}
