package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

public class ReceiptView {
	
	public void mainMenu() {
		
		
		Scanner sc = new Scanner(System.in);
		Receipt r = new Receipt();
		
		System.out.print("가격은 얼마인가요 >");
		r.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("결제수단은 무엇인가요 >");
		r.setPayment(sc.nextLine());
		System.out.print("상점명은 무엇인가요 >");
		r.setStoreName(sc.nextLine());
		System.out.print("날짜는 언제 인가요 >");
		r.setDate(sc.nextLine());
		
		System.out.println(r.info());
		
		
		sc.close();
		
	}

}
