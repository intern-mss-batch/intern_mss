package com.sampreeth.helloworld;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		  int n;
          int a1=a;
          int c=0;
          String str =Integer.toString(a);
          int l=str.length();
          for(int i=0;i<l;i++){
              n=a%10;
              c=c+(int)(Math.pow(n,l));
              a=(int)Math.floor(a/10);
          }
          if(a1==c){
        	  System.out.println("amstrong");
          }else{
        	  System.out.println("Not amstrong");
          }
	}

}
