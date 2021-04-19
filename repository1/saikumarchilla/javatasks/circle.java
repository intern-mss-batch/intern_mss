package beginner;

public class circle {
	double areaofcircle(int r)
	{
		double pi=3.14;
		double a ;
		a=(pi*r*r);
		return a;
		
	}

	public static void main(String args[])
	{
		int radius=5;
		circle obj=new circle();
		double asd=obj.areaofcircle(radius);
		System.out.println("radius of a circle=" + asd);
		
	}
}
