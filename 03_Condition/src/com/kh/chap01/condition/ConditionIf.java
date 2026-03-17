package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionIf {
	
	public void method1(){
		if(0 < 1) {
			
		}
	}
	public void quiz() {
		String sEx1 = "문제1. 고양이는 호랑이과 일까요?";
		String sEx2 = "문제2. 여우는 개과 일까요?";
		String sQuestion = "정답을 O / X로 작성해주세요.";
		String sAnswer;
		int score = 0;
		int question = 0;
		char ch1;
		Scanner sc = new Scanner(System.in);
		System.out.print(sEx1+"\n"+sQuestion);
		question++;
		ch1 = sc.nextLine().charAt(0);
		
		if((ch1 == 'o')||(ch1 == 'O')) {
			System.out.println("오답");
		}
		if((ch1 == 'x')||(ch1 == 'X')) {
			System.out.println("정답");
			score++;
		}
		
		System.out.print(sEx2+"\n"+sQuestion);
		question++;
		ch1 = sc.nextLine().charAt(0);
		if((ch1 == 'o')||(ch1 == 'O')) {
			System.out.println("정답");
			score++;
		}
		if((ch1 == 'x')||(ch1 == 'X')) {
			System.out.println("오답");
		}
		if((ch1 != 'o')&& (ch1 != 'x') && (ch1 != 'O') && (ch1 != 'X')) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.printf("총 %d문제 풀었고 정답은 %d개 오답은 %d개입니다.",question,score,question-score);
		
	}

}
