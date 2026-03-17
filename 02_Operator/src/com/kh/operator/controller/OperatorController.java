package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {

	public void arithmetic() {
		int num1 = 10;
		int num2 = 3;
		int sum = num1 + num2;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		System.out.println("num1 + num2 : " + num1 + num2);
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.print("num1 + num2 : " + sum);
		System.out.println();
		System.out.printf("num1 + num2 : %d", num1 + num2);
		System.out.println();
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));

	}

	public void presentToStudent() {
		int iPerson;
		int iNum;

		Scanner sc = new Scanner(System.in);

		System.out.print("나눠줄 학생수를 입력해주세요 : ");
		iPerson = sc.nextInt();
		System.out.print("보유하고 있으신 사탕 개수를 입력하세요 : ");
		iNum = sc.nextInt();

		System.out.printf("한 사람당 받을수 있는 사탕의 갯수는 %d개입니다.", (iNum / iPerson));
		System.out.println();
		System.out.printf("남은 사탕의 갯수는 %d개입니다.", (iNum % iPerson));
	}

	public void inDecrease() {
		int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		int num1 =10;
		int number = num1++;
		
		System.out.println(num1);
		System.out.println(number);
	}
	
	public void compound() {
		int endDay = 128;
		System.out.println(endDay);
		endDay -= 1;
	}
	public void logicalNagation() {
		System.out.println(!true);
	}
	public void comparison() {
		int firstNumber = 10;
		int secondNumber = 25;
		System.out.println(firstNumber < secondNumber);
		System.out.println(firstNumber == secondNumber);
		System.out.println((firstNumber%2)== 0);
		System.out.println((secondNumber%2)== 0);
	}
	public void logical() {
		int iNum;
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 정수값을 입력해주세요 : ");
		iNum = sc.nextInt();
		System.out.println((iNum > 0) && ((iNum%2)==0));
	}
	public void andOper() {
		int iNum;
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 정수값을 입력해주세요 : ");
		iNum = sc.nextInt();
		System.out.println(iNum);
		boolean bCheck = ((1 <= iNum) && (iNum <=10));
		System.out.println("입력하신 정수값이 1~ 10사이인가요? "+bCheck);
		
	}
	
	public void orOper() {
		char letter;
		Scanner sc = new Scanner(System.in);
		System.out.print("한글자를 입력해주세요 : ");
		letter = sc.nextLine().charAt(0);
		boolean bCheck = (('A' == letter )|| (letter == 'a')) ;
		//System.out.println(letter);
		System.out.println(bCheck);
		
		
	}
	
	public void triple() {
		String sIntro = "깐부치킨에 오신것을 환영합니다";
		String sMenu1 = "1. 회장님의 입맛 그대로 AI치킨";
		String sMenu2 = "2. 바삭한 식스팩 치킨";
		String sMenu3 = "3. 치킨의 근본 후라이드 치킨";
		String sGuide = "주문하실 메뉴를 선택해주세요(메뉴 번호를 입력해주세요)";
		String sSelect1 = "회장님의 입맛 그래도 AI치킨을 주문하셨습니다";
		String sSelect2 = "바삭한 식스팩치킨을 주문하셨습니다";
		String sSelect3 = "치킨의 근본 후라이드치킨을 주문하셨습니다";
		String sSelectX = "없는 메뉴를 주문하셨습니다";
		String sSelect;
		Scanner sc = new Scanner(System.in);
		int menuNo;
		boolean bCheck;
		
		System.out.print(sIntro + "\n" + sMenu1 + "\n" + sMenu2 + "\n"+ sMenu3+"\n"+sGuide);
		menuNo = sc.nextInt();
		
		sSelect = (menuNo == 1) ? "회장님의 입맛 그래도 AI치킨을 주문하셨습니다" 
				: (menuNo == 2) ? "바삭한 식스팩치킨을 주문하셨습니다."
				: (menuNo == 3) ? "치킨의 근본 후라이드 치킨을 주문하셨습니다."
				: "없는 메뉴를 주문하셨습니다.";
		
		if(menuNo == 1) {
			System.out.println("회장님의 입맛 그래도 AI치킨을 주문하셨습니다,");
		}
		else if(menuNo == 2) {
			System.out.println("바삭한 식스팩치킨을 주문하셨습니다,");
		}
		else if(menuNo == 3) {
			System.out.println("치킨의 근본 후라이드치킨을 주문하셨습니다,");
		}
		else {
			System.out.println("없는 메뉴를 주문하셨습니다.");
		}
		
		
		switch(menuNo) {
		case 1:
			System.out.println("회장님의 입맛 그래도 AI치킨을 주문하셨습니다,");
			break;
		case 2:
			System.out.println("바삭한 식스팩치킨을 주문하셨습니다,");
			break;
		case 3:
			System.out.println("치킨의 근본 후라이드치킨을 주문하셨습니다,");
			break;
		default:
			System.out.println("없는 메뉴를 주문하셨습니다.");
			break;
		
		}
		
		while(true) {
			System.out.print(sIntro + "\n" + sMenu1 + "\n" + sMenu2 + "\n"+ sMenu3+"\n"+sGuide);
			menuNo = sc.nextInt();
			
			if(menuNo == 6) {
				break;
			}
			
		}
		
		
		
	}
	
}

