package com.sampreeth.helloworld;

public class strings_lencapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	StringBuffer s = new StringBuffer("hi");
	        int l = s.length();
	        int c = s.capacity();
	        System.out.println("Length " + l);
	        System.out.println("Capacity " + c);
	        s.append("world");
	        System.out.println(s);
	        s.insert(6, "welcome");
	        System.out.println(s);
	        s.reverse();
	        System.out.println(s);
	        s.delete(0, 5);
	        System.out.println(s);
	        String s1 ="hi hello world";
	}

}
