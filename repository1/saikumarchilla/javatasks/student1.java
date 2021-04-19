package beginner;

import java.util.Scanner;

public class student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("enter student marks");
			Scanner sc =new Scanner(System.in);
			int m=sc.nextInt();
			if(m==40)
			{
				System.out.println("you are just passed with rank");
			}
			 else if(m>90)
			{
				System.out.println("you are  passed with 1st  rank");
			}
			 else if(m>80&&m<90)
			{
				System.out.println("you are  passed with 2nd  rank");
			}
			 else if(m>70&&m<80)
			{
				System.out.println("you are  passed with  3rd rank");
			}
			 else if(m>40&&m<70)
			 {
				 
						System.out.println("you are  passed with 4th rank");
				
			 }
			 else
			 {
				 System.out.println("you are  failed ");
			 }
		}

	}

}
