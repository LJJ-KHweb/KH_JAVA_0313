package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {

	public void method1() {
		String sIntro = "안녕하세요 경품당첨 안내입니다.\n핸드폰 번호 뒷자리4자리를 입력해주세요";
		String sPhoneNumber;
		Scanner sc = new Scanner(System.in);

		System.out.print(sIntro);
		sPhoneNumber = sc.nextLine();

		if (sPhoneNumber.equals("7777")) {
			System.out.println("1등 당첨되었습니다.");
		} else if (sPhoneNumber.equals("6666")) {
			System.out.println("2등 당첨되었습니다.");
		} else if (sPhoneNumber.equals("5555")) {
			System.out.println("3등 당첨되었습니다.");
		} else {
			System.out.println("아쉽게도 낙첨되었습니다. 다음기회에 도전하세요.");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		String sPhoneNumber;
		String sMent = "등 당첨 되셨습니다.";
		int iScore = 0;
		System.out.print("핸드폰 번호 뒷자리를 입력주세요 > ");
		sPhoneNumber = sc.nextLine();
		if (sPhoneNumber.equals("7257")) {
			System.out.println("축하드립니다. 1"+sMent+" 상금 1억");
		} else if (sPhoneNumber.equals("7777")) {
			System.out.println("축하드립니다. 2"+sMent+" 상금 2천만원");
		} else if (sPhoneNumber.equals("6666")) {
			System.out.println("축하드립니다. 3"+sMent+" 상금 500마원");
		} else {
			System.out.println("아쉽게도 낙첨되셨습니다. 다음기회에 도전해주세요.");
		}
	}
	
	public void ageCheck() {
		int iAge;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 >");
		iAge = sc.nextInt();
		
		if(iAge < 0) {
			System.out.println("올바른 나이를 입력해주세요");
		} else if(iAge >= 18) {
			System.out.println("성인 입니다.");
		} else if(iAge <= 12) {
			System.out.println("어린이 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}
		
	}
	
	
}
