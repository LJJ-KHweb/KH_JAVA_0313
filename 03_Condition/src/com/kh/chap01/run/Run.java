package com.kh.chap01.run;

import com.kh.chap02.loop.LoopFor;
import com.kh.chap02.loop.LoopWhile;
import com.kh.chap03.escape.EscapeBreak;

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
		//lf.method0();
		//lf.gugudan();
		//lf.mainMenu();
		LoopWhile lw = new LoopWhile();
		//lw.method1();
		//lw.method3();
		//lw.lotto();
		EscapeBreak eb = new EscapeBreak();
		//eb.method1();
		eb.checkId();
		
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
 * 
 * 
 * for while 차이점 
 * for 개발자가 반복을 몇 번 해야할지 명학하게 알고 있을 때
 * while 개발자가 반복을 몇 번 해야할지 가늠할 수 가 없을 때
 * random() 의 결과 값은 : 0.0 ~0.9999999999999999
 * 
 * break;
 * 주의 사항 switch문 내부에 작성하는 break; 문과는 구분을 해야함
 * 		   switch문 내부에 있는 break는 switch문을 빠져나가는 용도로 사용
 * break : break문을 만나는 순간 "가장 가까운 반복문"dmf Qkwuskrka
 * 		   break문이 속해 있는 반복문 "한 겹"을 빠져나감
 * 
 * continue : 반복문안에서 사용하는 문법
 * 반복문안에서 continue를 만나면 이후에 모든 코드를 pass
 * 반복문 최상단 scope로 이동
 */ 
