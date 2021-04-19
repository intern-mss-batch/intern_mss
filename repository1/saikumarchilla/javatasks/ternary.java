package beginner;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int max=(i>j) ? i:j;
		System.out.println("large number is" + max);
		

	}

}
