package beginner;

public class divisiors10000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int num=0;
		for(int i=1;i<=10000;i++)
		{
			int count=0;
		   for(int j=1;j<=i;j++)
		   {
			   if(i%j==0)
			   {
				   count++;
			   }
		   }if(count>max)
		   {
			   max=count;
			   num=i;
		   }
		}
		System.out.println("the most divisior number is"+num);
		System.out.println("it have"+max+"multiples");
	}

}
