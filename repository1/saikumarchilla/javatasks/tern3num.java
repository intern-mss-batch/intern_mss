package beginner;

import java.util.Scanner;

public class tern3num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter three numbers");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		int max = (i > j) ?
		          (i > k ? i : k) :
		              (j > k ? j : k);
		
		
		System.out.println("large number is" + max);

}
}
