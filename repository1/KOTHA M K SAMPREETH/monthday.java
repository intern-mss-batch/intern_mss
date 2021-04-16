package com.sampreeth.helloworld;

import java.util.Scanner;

public class monthday {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a month");
		String c = s.next();
		switch (c) {
		case "jan" : System.out.println("31");
					break;
		case "feb" : System.out.println("29");
					break;
		case "mar" : System.out.println("31");
					break;
		case "apr" : System.out.println("30");
					break;
		case "may" : System.out.println("31");
		break;
		case "june" : System.out.println("30");
		break;
		case "july" : System.out.println("31");
		break;
		case "aug": System.out.println("31");
		break;
		case "sep" : System.out.println("30");
		break;
		case "oct" : System.out.println("31");
		break;
		case "nov" : System.out.println("30");
		break;
		case "dec" : System.out.println("31");
		break;
		}
	}

}
