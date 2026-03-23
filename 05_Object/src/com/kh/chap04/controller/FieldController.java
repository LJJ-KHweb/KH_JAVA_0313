package com.kh.chap04.controller;
// 필드 == 멤버변수 == 인스턴스 변수 == 속성
public class FieldController {
	public static String str = "static";	
	public int global;
	
	public void checkVariable(int parameter) {
		
		int local = 1;
		System.out.println(global);
		System.out.println(local);
		System.out.println(parameter);
		
	}
	

}

/* 필드(멤버변수, 인스턴스 변수)
 * 
 * static 필드(클래스 변수)
 * 
 * 지역변수
 * 
 * 
 */