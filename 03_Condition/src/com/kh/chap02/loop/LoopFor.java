package com.kh.chap02.loop;

import java.util.Scanner;

import com.kh.chap01.condition.ConditionIf;

public class LoopFor {

	public void method0() {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

	public void Test() {
		String sUserId = "User01";
		String sUserPassWord = "1234";
		String sSystemId;
		String sSystemPassWord;

		int iChoice;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("========================");
			System.out.println("안녕하세요 KH딜리버리입니다.");
			System.out.println("1.회원가입 2.로그인 3.종료(x)");
			System.out.println("========================");
			System.out.print("->");
			iChoice = sc.nextInt();
			sc.nextLine();
			switch (iChoice) {
			case 1:
				System.out.println("안녕하세요 회원가입 화면입니다.");
				System.out.print("아이디를 입력해주세요 >");
				sUserId = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요 >");
				sUserPassWord = sc.nextLine();
				break;
			case 2:
				System.out.println("안녕하세요 로그인 화면입니다.");
				System.out.print("아이디를 입력해주세요 >");
				sSystemId = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요 >");
				sSystemPassWord = sc.nextLine();
				if (sSystemId.equals(sUserId) && sSystemPassWord.equals(sUserPassWord)) {
					System.out.println("========================================");
					System.out.println("===============로그인 성공!================");
					System.out.println("=========================================");
				} else {
					System.out.println("========================================");
					System.out.println("===============로그인 실패!================");
					System.out.println("=========================================");
				}
				break;
			case 3:
				System.out.println("시스템 종료 바이바이");
				return;
			}
			i--;
		}
	}

	public void gugudan() {
		int iNum;
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까 > ");
		iNum = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(iNum + " * " + i + " = " + iNum * i);
		}
	}

	public void mainMenu() {

		for (;;) {
			int iMenuNo;
			Scanner sc = new Scanner(System.in);
			System.out.println("메인 메뉴입니다.");
			System.out.println("1. 구구단 놀이 시작하기");
			System.out.println("2. O/X퀴즈 시작하기");
			System.out.println("3. 프로그램 종료하기");
			iMenuNo = sc.nextInt();
			sc.nextLine();

			if (iMenuNo == 1) {
				ConditionIf ci = new ConditionIf();
				ci.quiz();
			} else if (iMenuNo == 2) {
				gugudan();
			} else if (iMenuNo == 3) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
			}

			/*
			 * switch(iMenuNo) { case 1: break; case 2: int iNum;
			 * System.out.print("몇 단을 출력하시겠습니까 > "); iNum = sc.nextInt(); for(int i = 1;
			 * i<10;i++) { System.out.println(iNum + " * " + i + " = " + iNum*i); } break;
			 * case 3: return;
			 * 
			 * }
			 */
		}

	}
}
