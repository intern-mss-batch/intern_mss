package beginner;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int a;
		int c=0;
		 while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  

	       }
		 if(temp==c)
		 
				    System.out.println("armstrong number");   
				    else  
				        System.out.println("Not armstrong number"); 
		 
}

}
