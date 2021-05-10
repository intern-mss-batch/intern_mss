package exception;

import java.util.Scanner;

public class task {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bal=100000;
		int i=1;
	while(i!=0)
	{
			System.out.println("1.VIEWBAL  2.WITHDRAW  3.DEPOSIT 4.EXIT");
			Scanner sc=new Scanner(System.in);
			int inp=sc.nextInt();
			switch(inp)
			{
			  case 1:
			    System.out.println("BALANCE ="+bal);
			    break;
			  case 2:
			    System.out.println("ENTER WITHDRAW AMOUNT");
			    Scanner sc1=new Scanner(System.in);
			    int wd=sc1.nextInt();
			    if(wd>bal)
			    {
					throw new ArithmeticException("insufficient funds");
					
			    }
			   
			    	
			    	System.out.println("TRANSCACTION IS SUCCESSFUL");
			    	System.out.println("TOTAL AMOUNT="+(bal=bal-wd));
					    
					    break;
			   
			  case 3:
			    System.out.println("ENTER AMOUNT TO DEPOSIT");
			    Scanner sc2=new Scanner(System.in);
			    int dep=sc2.nextInt();
			    if(dep<100)
			    {
					
			    	 System.out.println("LESS THAN 100 COULD NOT DEPOSIT");
			    }
			    else
			    {
			    System.out.println("TOTAL AMOUNT="+(bal=bal+dep));
			    }
			    
			    break;
			  case 4:
			    i=0;
			    break;
		}
		
		}
		
	}

}
