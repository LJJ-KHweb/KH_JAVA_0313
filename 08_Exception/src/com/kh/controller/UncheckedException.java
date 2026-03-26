package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public void devZero() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("나누기 프로그램입니다.");
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 > ");
		num2 = sc.nextInt();
		try {
			System.out.println("결과 : " + num1 / num2);
			System.out.println("참 잘했어요");
		}catch(ArithmeticException e) {
			System.out.println("두 번째 정수에 0을 입력하시면 나눌수 없습니다.");
		}
		
		/*
		 * if (num2 != 0) { System.out.println("결과 : " + num1 / num2); } else {
		 * System.out.println("0은 나누기 연산을 수행할 수 없습니다."); }
		 */
		sc.close();
	}
	public void code() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int menu = 0;
			System.out.println("메뉴를 선택해주세요 .");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.print("1.번 또는 2번을 입력해주세요");
			try {
				menu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("잘못입력했음");
				menu = 3;
			}
			if(menu == 3) {
				break;
			}
			sc.nextLine();
			System.out.println(menu + "번 메뉴를 선택하셨습니다.");
			
			
		}
		sc.close();
	}
	
	public void multiCatch() {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		System.out.print("정수값을 하나 입력해주세요 > ");
		try {
			num = sc.nextInt();
			System.out.println("결과 : " + (100/num));
		}catch(InputMismatchException e) {
			System.out.println("숫자값을 입력해주세요.");
		}catch(ArithmeticException e) {
			System.out.println("0이외의 숫자를 입력해주세요");
		}finally {
			sc.close();
		}
		sc.nextLine();
		
	}
	
	public void orderByCatch() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("정수값을 입력해주세요 >");
		
		try {
			num = sc.nextInt();
			int[] arrys = new int[num];
			System.out.println("100번째 인덱스의 값은 : " + arrys[100]);
		}catch(InputMismatchException e) {
			System.out.println("정수값을 입력해주세요");	
		}catch(NegativeArraySizeException e) {
			System.out.println("양의 정수값을 입력해주세요");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("101이상의 정수값을 입력해주세요");
		}finally {
			sc.close();
		}
	}
	

}
