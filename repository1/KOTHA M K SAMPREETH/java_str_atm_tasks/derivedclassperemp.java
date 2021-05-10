package com.sampreeth.helloworld;

class Person{
	int m=2;
	String nm="persname";
}

class Emp extends Person{
	int m=1;
	double sall=1000000.00;
	int w=4;
	String num="acgn1367";
}

public class derivedclassperemp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj=new Emp();
		System.out.println(obj.nm+"\n"+obj.sall+"\n"+obj.w+"\n"+obj.num);
	}

}
