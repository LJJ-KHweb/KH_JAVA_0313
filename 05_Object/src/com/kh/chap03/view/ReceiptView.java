package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

public class ReceiptView {
	
	public void mainMenu() {
		
		
		Scanner sc = new Scanner(System.in);
		Receipt r = new Receipt();
		
		System.out.print("입력 > ");
		r.setDate(sc.nextLine());
		System.out.print("입력 > ");
		r.setPayment(sc.nextLine());
		System.out.print("입력 > ");
		r.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("입력 > ");
		r.setStoreName(sc.nextLine());
		
		System.out.println(r.info());
		
		
		sc.close();
		
	}

}
