package beginner;

import java.util.Scanner;

public class repetednum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int temp=0;
		int count=0;
		for(int i=0;i<9;i++)
		{ 
			no=temp; count=0; while(no!=0)
			{ 
				if(no%10==i) { 
								count++; 
								no=no/10; 
								}
		 

			}
			System.out.println("Number of occurences of "+i+" is : "+count);
		}
		
	}

}
