package kh.com.chap04.run;

import java.util.Scanner;

import kh.com.chap04.model.service.CookingSkill;
import kh.com.chap04.model.service.HitTheBab;
import kh.com.chap04.model.service.HongkongHouse;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CookingSkill cs = null;
		System.out.println("덮밥 주문 서비스에 오신것을 환영합니다.");
		System.out.println("주문하실 덮밥 브랜드를 선택하시기 바랍니다.");
		System.out.println("1. 청킹미미");
		System.out.println("2. 힛또밥");
		System.out.println("메뉴를 선택해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1:
			cs = new HongkongHouse();
			break;
		case 2:
			cs = new HitTheBab();
			break;
		default:
			System.out.println("잘못눌렀어요");
			break;
		}
		cs.makeDopbap();
		
	}

}
