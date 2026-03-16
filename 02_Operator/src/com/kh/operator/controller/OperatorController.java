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
}

