package com.kh.chap01.run;

import com.kh.chap01.condition.ConditionElse;
import com.kh.chap01.condition.ConditionSwitch;
import com.kh.chap02.loop.LoopFor;

public class Run {

	public static void main(String[] args) {
		
		//ConditionIf ci = new ConditionIf();
		//ci.method1();
		//ci.quiz();
		//ConditionElse ce = new ConditionElse();
		//ce.method1();
		//ce.method2();
		//ce.ageCheck();
		
		//ConditionSwitch cs = new ConditionSwitch();
		//cs.method0();
		
		//cs.findName();
		//cs.login();
		LoopFor lf = new LoopFor();
		lf.method0();
	}

}

/*
 * if ~else 문 
 * if(조건식){
 * 		실행코드 
 * }
 * switch(동등비교할 값){
 * case 값1 : 실행할 코드; break; 
 * default : 실행할 코드; break;
 * 
 * 
 * return 현재 메소드를 벗어남
 * 
 * 
 * 구현한다
 * 기획/ 설계
 * 기획 뭘 만들지
 * 설계 어떻게 만들지
 * 
 * 
 * 참조자료형 : 기본자료형을 제외한 JAVA에서 제공해주는 자료형
 * 			-> 동등비교연산자(==, !=)를 통해서 값을 비교하는것이 불가능!
 * 			-> 문자열 값을 비교 : equals() -> true/false
 * 			-> 실제 변수에 담기는 값이 '주소값'이기 때문
 * 
 * 
 * (구현할때)
 * 1. 무슨값을?
 * 2. 무슨연산을
 * 
 * for( 초기식; 조건식; 증감식;)
 */ 
