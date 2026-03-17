package com.kh.operator.run;
import com.kh.operator.controller.OperatorController;

public class Run {

	public static void main(String[] args) {
		OperatorController oc = new OperatorController();
		//oc.arithmetic();
		//oc.presentToStudent();
		//oc.inDecrease();
		//oc.compound();
		//oc.logicalNagation();
		//oc.comparison();
		//oc.logical();
		//oc.andOper();
		//oc.orOper();
		oc.triple();
	}

}


//증감연산자 	: 단항연사자로 한 번에 1증가하거나 / 1감소하는 연산
//전위 연산 	: ++값 , --값			--> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리
//후위 연산 	: 값++ , 값-- 			--> 먼저 값을 처리하고 나서 증가하거나 감소
// 관계 연산자(비교 연산자) ★★★
// 두 개의 값을 가지고 비교하는, 이항 연산자
// 비교연산을 한 결과 -> true, false
// 특정 조건을 제시할 수 있는 조건문에서 조건식으로 사용할 것
// 종류
// 1. 동등 비교 : 일치함을 비교
// ex) a == b : a와 b가 일치 합니까?
// ex) a != b : a와 b가 일치하지 않습니까?
// 2. 대소 비교 : 크고 작음을 비교
// ex) a < b  : a가 b보다 작습니까?
// ex) a <= b : a가 b보다 작거나 같습니까?

// 논리연산자 : 두개의 논리값을 연산하는 연산자

// 논리값 논리연산자 논리값 => 논리값
// 종류 
// 1 AND연산	: 논리값 	&&	 논리값
//			 	true  	&& 	true  	결과 : true
//			 	false 	&& 	true 	결과 : false
//			 	true  	&& 	false 	결과 : false
//			 	false	&& 	false   결과 : false
//
// 2 OR연산	: 논리값	||	논리값
//				true  	&&	true  	결과 : true
//				false 	&&	true 	결과 : true
//				true  	&& 	false 	결과 : true
//				false 	&& 	false   결과 : false
//
// 3 삼항 연산자 : 피 연산자가 3개
// -> 3개의 값과 1개의 연산자로 구성됨( 조건문의 형식으로 쓰임)
// [표현식]
// 조건식 ? 조건식이 true일 경울 결과값 : 조건식이 false일 경우 결과값
//
// String 에서 단일문자(char) 바꿔주는 메소드
// charAt(정수값)		정수값의 역활은 문자열의 몇번째를 가져올것인지를
// String sc = "abcdefgh";
// sc.charAt(0) -> a
// sc.charAt(3) -> d











