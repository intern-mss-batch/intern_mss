package com.sampreeth.helloworld;

import java.util.*;

/**
 * @author kmksa
 *
 */
public class leap {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		if(y%4==0) {
			if(y%100==0) {
				if(y%400==0) {
					System.out.println(y+" is a leap year");
				}
				else {
					System.out.println(y+" is not a leap year");
				}
			}
			else {
				System.out.println(y+ " is a leap year");
			}
			
		}
		else {
			System.out.println(y+" is not a leap year");
		}
	}

}
