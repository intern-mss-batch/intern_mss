package beginner;

import java.util.Scanner;

public class noofdigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to find no of digits");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count = 0;
		while(n!=0)
		{
			n=n/10;
			count=count+1;
			
			
		}System.out.println(count);
		
	}

}
