package com.sampreeth.helloworld;

class Cl1
{
    int a = 120;
}
class Cl2 extends Cl1
{
   static final int a = 180;
  
    void display()
    {
        System.out.println("value : " + super.a);
    }
}

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cl2 small = new Cl2();
        small.display();
	}

}
