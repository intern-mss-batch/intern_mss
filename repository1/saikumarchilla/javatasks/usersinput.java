package beginner;

import java.util.Scanner;

public class usersinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number b/w 1-10");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0 && n<11)
		{
			System.out.println(" valid input");
		}
		else
		{
			System.out.println(" not a valid");
		}

	}

}
