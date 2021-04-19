package beginner;
import java.util.*;

public class diagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int r = s.nextInt();
		for(int i=1;i<=r;i++) {
			System.out.print("\n");
			for(int j=i;j<r;j++) {
				System.out.print(" ");
			}
			if(i==1) {
				System.out.print("1");
			}
			else {
				for(int k=i;k>=1;k--) {
					System.out.print(k);
				}
				for(int l=2;l<=i;l++) {
					System.out.print(l);
				}
			}
		}
	}

}
