package com.sampreeth.helloworld;

import java.util.Scanner;

public class firstchartouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 String st = "";
	      String str = s.nextLine();
	      Scanner lineScan = new Scanner(str);
	      while(lineScan.hasNext()) {
	         String word = lineScan.next();
	         st+= Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
	      }
	      System.out.println(st);
	}
}
