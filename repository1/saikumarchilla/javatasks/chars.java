package beginner;

import java.util.Scanner;

public class chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a input");
		Scanner sc=new Scanner(System.in);
	char i=sc.next().charAt(0);
		if(i >= 'A' && i <= 'Z')
		{
			System.out.println("upper characters");
		}
		else if(i >= 'a' && i <= 'z')
		{
			System.out.println("lowerw characters");
		}
		else if(i>='0' && i<='9')
		{
			System.out.println("numbers");
		}
		else 
		{
			System.out.println("special characters");
		}
	}

}
