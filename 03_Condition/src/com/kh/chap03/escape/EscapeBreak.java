package com.kh.chap03.escape;

import java.util.Scanner;

public class EscapeBreak {
	public void method1() {
		 
		String sText;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자열의 길이를 알려주는 프로그램입니다.");
			System.out.print("문자열을 입력해주세요(종료 : exit) >");
			sText = sc.nextLine();
			System.out.println(sText.length());
			if("exit".equals(sText)) {
				break;
			}
		}
	}
	
	public void checkId() {
		String sUserId;
		String sUserPassWord;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입 서비스입니다.");
		while(true) {
			System.out.println("아이디를 입력해주세요 (10글자이하) >");
			sUserId = sc.nextLine();
			
			if(10 < sUserId.length()) {
				System.out.println("아이디가 10글자 이상입니다.");
				continue;
			}else {
				System.out.println("사용가능한 아이디입니다.");
				System.out.println("비밀번호를 입력해주세요 >");
				sUserPassWord = sc.nextLine();
			}
			
			System.out.println("아이디 : " + sUserId + " 비밀번호 : " + sUserPassWord);
			
		}
		
	}
	
}
