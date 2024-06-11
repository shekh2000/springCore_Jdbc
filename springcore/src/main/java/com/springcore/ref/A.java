package com.springcore.ref;

public class A {
	private int x;
	private B ob1;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb1() {
		return ob1;
	}
	public void setOb1(B ob1) {
		this.ob1 = ob1;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob1=" + ob1 + "]";
	}
}
