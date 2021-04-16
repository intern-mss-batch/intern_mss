package com.sampreeth.helloworld;

import java.util.*;

public class avgminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =new int[10];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[0]);
		int a=0;
				for(int i=0;i<10;i++) {
					a+=arr[i];
				}
				System.out.println("avg "+ a/(arr.length));
	}

}
