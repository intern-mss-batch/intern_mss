package com.sampreeth.helloworld;

import java.util.*;

class Cexception extends Exception{
	public Cexception(String str) {
		System.out.println(str);
	}
}

public class atmcustomex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		boolean l =true;
		while(l) {
		int bal=1000000;
		System.out.println("Please select a number : ");
		System.out.println("1 - View my balance : \n2 - Withdraw : \n3 - Deposit : \n4 - Exit");
		int i=s.nextInt();
		int w,d;
		switch(i){
		case 1:
			System.out.println("Your Balance is : "+bal);
			break;
		case 2:
			System.out.println("Enter withdraw amount : ");
			w=s.nextInt();
			if(w<bal) {
				bal=bal-w;
				System.out.println("Withdraw sucess");
			}
			else {
				try {
					throw new Cexception("Insufficent balance");
				}
				catch(Exception e) {
					
				}
			}
			break;
		case 3:
			System.out.println("Enter deposit amount : ");
			d=s.nextInt();
			if(d>99) {
				bal=bal+d;
				System.out.println("Deposit sucess \n Your balance is : "+bal);
			}
			else {
				try {
					throw new Cexception("Deposit amount must be grater than 99");
				}
				catch(Exception e) {
					
				}
			}
			break;
		case 4:
			l=false;
		}
		System.out.println("Thanks");
	}
	}
}
