/**
 * 
 */
package com.sampreeth.helloworld;

import java.util.Scanner;

/**
 * @author kmksa
 *
 */
public class grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter markes for 100 ");
		int a = s.nextInt();
		if(a>=80 && a<=100)
		System.out.println("Passed grade A" );
		else if(a>=60 && a<80) {
			System.out.println("Passed grade B");
		}
		else if (a>=40 && a<60) {
			System.out.println("Passed grade C "+a);
		}
		else {
			System.out.println("Failed grade F");
		}
		
	}

}
