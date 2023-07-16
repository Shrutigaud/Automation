package com.demo.practice;
public class PracticeProgm {
	int x=10;
	public void m1() {
		System.out.println("hi");
		}
}
class PracticeProgm2 extends PracticeProgm{
	int x= 100;
	public void m1() {
		System.out.println("hello");
	}
	public  void m2() {
		int x = 1000;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	//public void m3(){
		super.m1();
	}
}
class Demo {		
	public static void main(String[] args) {
		PracticeProgm2  c = new PracticeProgm2 ();
		c.m2();
		//t.m3();
	}
}
