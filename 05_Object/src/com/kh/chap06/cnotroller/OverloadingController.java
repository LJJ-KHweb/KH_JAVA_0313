package com.kh.chap06.cnotroller;

public class OverloadingController {

	public void method() {
		System.out.println("메소드 오버로딩 1");
	}
	public void method(int num) {
		System.out.println("메소드 오버로딩 2");
	}
	public void method(double d) {
		System.out.println("메소드 오버로딩 3");
	}
	public void method(String str) {
		System.out.println("메소드 오버로딩 4");
	}
	public void method(int num, int num2) {
		System.out.println("메소드 오버로딩 5");
	}
	public void method(Object a) {
		System.out.println("메소드 오버로딩 6");
	}
	

}
