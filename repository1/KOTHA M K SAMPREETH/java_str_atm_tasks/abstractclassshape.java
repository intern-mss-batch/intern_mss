package com.sampreeth.helloworld;



abstract class Shape{
	void noofsildes() {
}

class Trapezoid extends Shape{
void noofsildes() {
	int sides=4;
}
}

class Triagle extends Shape{
	void noofsildes() {
		int sides=3;
	}
}

class Hexagon extends Shape{
	void noofsildes() {
		int sides=6;
	}
}


public static class abstractclassshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triagle t=new Triagle();
	}
}

