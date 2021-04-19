package beginner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=10;i++)
		{
			count=0;
			for(int j=1;j<=10;j++)
			{
				if(i%j==0)
				{
					count=count+1;
					
				}
				
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
		}

	}

}
