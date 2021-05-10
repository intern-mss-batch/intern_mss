package com.sampreeth.helloworld;

interface A
{
    default void Amet(){
        System.out.println("A method");
    }
}
  
interface B
{
    default void Bmet(){
        System.out.println("B method");
    }
}

public class mulinhertance implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mulinhertance obj = new mulinhertance();
        obj.Amet();
        obj.Bmet();
	}
}
