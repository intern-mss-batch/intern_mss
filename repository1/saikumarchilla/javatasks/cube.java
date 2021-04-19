package beginner;

public class cube {
	double areaofcube(double a)
	{
		a=6*a*a;
		return a;
	}
	public static void main(String args[])
	{
		int edge=6;
		cube obj=new cube();
		double area=obj.areaofcube(edge);
		System.out.println("area of cube"+ area);
		
		
		
	}

}
