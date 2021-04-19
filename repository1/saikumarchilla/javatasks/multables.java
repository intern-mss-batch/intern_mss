package beginner;

import java.util.Scanner;

public class multables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to print multable");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		do
		{
			System.out.println(n+"*"+i+"="+ n*i);
			i++;
		}while(i!=13);
		

	}

}
