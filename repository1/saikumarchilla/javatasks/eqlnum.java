package beginner;
import java.util.*;

public class eqlnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter a numbers: ");
		int n=in.nextInt();
		String s1=String.valueOf(n);
		int len=s1.length();
		int i=n%10;
		int count=0;
		while(n!=0)
		{	
			int j=n%10;
			if(j==i)
			{
				count=count+1;
			}
			n=n/10;
			
		}
		if(count==len)
		{
			System.out.println("the digitd are equal");
		}
		
		
		
	}

}
