package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionSwitch {

	public void method0() {
		String sFloor;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("내리실 층 수를 입력해주세요 (B1/B2/B3)");
		sFloor = sc.nextLine();

		switch (sFloor) {
		case "B1":
			System.out.println("지하 1층입니다. 문이 열립니다.");
			break;
		case "B2":
			System.out.println("지하 2층입니다. 문이 열립니다.");
			break;
		case "B3":
			System.out.println("지하 3층입니다. 문이 열립니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}

	}
	
	public void findName() {
		String sName;
		String sFavorite;
		String sAddress;
		String sFemale;
		String sFindName;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등록하실 이름을 적어주세요 >");
		sName = sc.nextLine();
		System.out.print(sName+"님이 성별을 적어주세요 >");
		sFemale = sc.nextLine();
		System.out.print(sName+"님이 좋아하는것을 적어주세요 >");
		sFavorite = sc.nextLine();
		System.out.print(sName+"님의 주소를 적어주세요 >");
		sAddress = sc.nextLine();
		
		System.out.print("찾으실 이름을 적어주세요 > ");
		sFindName = sc.nextLine();
		if(sName.equals(sFindName)) {
			System.out.println("성함 : "+ sName);
			System.out.println("성별 : "+ sFemale);
			System.out.println("좋아 하는 것 : "+ sFavorite);
			System.out.println("주소 : "+ sAddress);
		}
		else {
			System.out.println("등록하신 이름을 찾을수 없습니다.");
		}
		
		String address = switch(sName) {
		
		case "고길동", "둘리" -> "서울특별시 도봉구 쌍문동";
		case "짱구" -> "서울특별시 초록구 떡잎마을";
		case "도라에몽" -> "도쿄도 네리마구 츠키미다이";
		default -> "주소지 없음";
		
		};
		System.out.println(address);
		String favorite = "";
		switch(sName) {
		case "고길동" : favorite = "술"; break;
		case "짱구" : favorite = "가족"; break;
		case "둘리" : favorite = "장난치기"; break;
		case "도라에몽" : favorite = "노진구"; break;
		}
		
		//System.out.println(name + " = " + "거주지 : "+address + "좋아하는것 : " + favorite);
		
		
	}
	
	public void login() {
		
		String sUserId;
		String sUserPassWord;
		String sMyId = "user01";
		String sMyPassWord = "1234";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("안녕하세요 배달의KH입니다.");
		System.out.println("========================================");
		System.out.println("로그인 서비스 입니다.");
		System.out.println("=========================================");
		System.out.print("아이디를 입력해주세요 >");
		sUserId = sc.nextLine();
		
		System.out.println("비밀번호를 입력해주세요 >");
		sUserPassWord = sc.nextLine();
		System.out.println(sUserPassWord);
		
		
		if(sUserId.equals(sMyId) && sUserPassWord.equals(sMyPassWord)) {
			System.out.println("========================================");
			System.out.println("===============로그인 성공!================");
			System.out.println("=========================================");
		}else {
			System.out.println("========================================");
			System.out.println("===============로그인 실패!================");
			System.out.println("=========================================");
		}
		
		
		
		
	}
	

}
