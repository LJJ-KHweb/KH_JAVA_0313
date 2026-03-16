package com.kh.Variable;

import java.util.Scanner;

//next() : 사용자가 입력한 값 중 공백문자가 있을 경우 공백문자 이전까지만 입력받음
//nextLine(): 사용자가 입력한 값을 공백과 무관하게 개행문자 이전까지 전체를 다 읽어오는 기능
// 				입력버퍼에 존재하는 개행문자를 없애주는 역활도 한다.

public class InputKeyBoard {

	public void inputTest() {

		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하십니까 피자헛 입니다 환영합니다.");
		System.out.println("=============================");
		System.out.println("1. 치즈/페페로니 핏자");
		System.out.println("2. 블랙 BBQ 스테이크 뇨끼 핏자");
		System.out.println("3. 이재모 핏자");
		System.out.println("=============================");
		System.out.print("주문하실 메뉴를 선택해주세요 >> ");

		String select = sc.next();
		System.out.println(select + "을(를) 주문하셨습니다.");
		System.out.println("몇 판 주문하시겠습니까(숫자로 입력해주세요) > ");
		int pizzaNumber = sc.nextInt();
		System.out.println(select + "를 " + pizzaNumber + "판 주문하셨습니다.");
		System.out.println("주소를 입력해주세요 > ");
		sc.nextLine();
		String sAddress = sc.nextLine();
		System.out.println(sAddress + "로 배달합니다.");

		/*
		 * String sMenu1 = "1. 치즈/페페로니 핏자"; String sMenu2 = "2. 블랙 BBQ 스테이크 뇨끼 핏자";
		 * String sMenu3 = "3. 이재모 핏자"; int Oder; String sAnswer; Oder = sc.nextInt();
		 * switch (Oder) { case 1: System.out.printf("주문하신 메뉴가 %s 가 맞습니까?", sMenu1);
		 * break; case 2: System.out.printf("주문하신 메뉴가 %s 가 맞습니까?", sMenu2); break; case
		 * 3: System.out.printf("주문하신 메뉴가 %s 가 맞습니까?", sMenu3); break; default:
		 * System.out.println("잘못 입력하셨습니다."); break; } sAnswer = sc.next(); if
		 * (sAnswer.equals("yes")) { System.out.printf("주문하신 %s  준비해드리겠습니다.", sMenu2); }
		 * else { System.out.println("초기 화면으로 돌아갑니다"); }
		 */
	}
}
