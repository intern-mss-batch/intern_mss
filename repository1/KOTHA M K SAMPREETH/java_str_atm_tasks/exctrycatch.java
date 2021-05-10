package com.sampreeth.helloworld;

public class exctrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2,3,4};
			System.out.println(arr[5]);
		 try{  
		      int a=100/0;  
		   }
		
		 catch(ArithmeticException e){
			   System.out.println(e);
			   }  
		}
		 catch(Exception e){
			   System.out.println(e.getMessage());
			   e.printStackTrace();
			   System.out.println(e.toString());
			   }  
		 
	}

}
