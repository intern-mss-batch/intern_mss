package beginner;

import java.util.Scanner;

public class digtandchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a digit and number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		char j=sc.next().charAt(0);
		System.out.println("enterd digit is" +i);
		System.out.println("enterd character" +j);
		
		

	}

}
