package com.sampreeth.helloworld;

import java.util.Scanner;

public class consthourtosec {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number");
			int a=s.nextInt();
			 int c=0;
             for(int i=1;i<=a;i++){
              if(a%i==0){
                  c=c+1;
              }
             }
             if(c==2){
                 System.out.println("prime");
             }
             else{
                System.out.println("not prime"); 
             }
		}

}