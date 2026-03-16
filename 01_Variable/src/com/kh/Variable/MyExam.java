package com.kh.Variable;
import java.util.Scanner;

public class MyExam {
	public void Test() {
		String 	sMenu1 = "1.핫 크리스피 버거	(단품 : 6000원 세트 : 9000원)";
		String 	sMenu2 = "2.불고기 버거		(단품 : 4000원 세트 : 7000원)";
		String 	sMenu3 = "3.새우 버거			(단품 : 5000원 세트 : 8000원)";
		String	sAddress;
		int 	iOder;
		int		iSelect = 0;
		int		iCheck = 0;
		int		iMenu1Money = 6000;
		int 	iMenu1MoneySet = 9000;
		int		iMenu2Money = 4000;
		int 	iMenu2MoneySet = 7000;
		int		iMenu3Money = 5000;
		int 	iMenu3MoneySet = 8000;
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 롯데리아입니다.");
		System.out.println(sMenu1+"\n"+sMenu2+"\n"+sMenu3);
		System.out.print("주문하실 메뉴를 선택해주세요(번호로 입력해주세요) : ");
		iOder = sc.nextInt();
		switch(iOder) {
		case 1:
			System.out.print(sMenu1+"1.단품 2.세트 선택해주세요 : ");
			iSelect = sc.nextInt();
			iCheck = 1;
			break;
		case 2:
			System.out.print(sMenu2+"1.단품 2.세트 선택해주세요 : ");
			iSelect = sc.nextInt();
			iCheck = 2;
			break;
		case 3:
			System.out.print(sMenu3+"1.단품 2.세트 선택해주세요 : ");
			iSelect = sc.nextInt();
			iCheck = 3;
			break;
		default:
			System.out.println("잘못누르셨습니다.");
			break;
		}
		
		switch(iOder) {
		case 1:
			if(iSelect == 1) {
				System.out.printf("주문하신 %d번 메뉴 단품 %d원 입니다.",iCheck,iMenu1Money);
			}
			else if(iSelect == 2) {
				System.out.printf("주문하신 %d번 메뉴 세트 %d원 입니다.",iCheck,iMenu1MoneySet);
			}
			break;
		case 2:
			if(iSelect == 1) {
				System.out.printf("주문하신 %d번 메뉴 단품 %d원 입니다.",iCheck,iMenu2Money);
			}
			else if(iSelect == 2) {
				System.out.printf("주문하신 %d번 메뉴 세트 %d원 입니다.",iCheck,iMenu2MoneySet);
			}
			break;
		case 3:
			if(iSelect == 1) {
				System.out.printf("주문하신 %d번 메뉴 단품 %d원 입니다.",iCheck,iMenu3Money);
			}
			else if(iSelect == 2) {
				System.out.printf("주문하신 %d번 메뉴 세트 %d원 입니다.",iCheck,iMenu3MoneySet);
			}
			break;
		default:
			System.out.println("잘못누르셨습니다.");
			break;
		}
		
		System.out.print("배달 주소를 알려주세요 : ");
		sc.nextLine();
		sAddress = sc.nextLine();
		System.out.println(sAddress + "로 배달해드리겠습니다. 감사합니다.");
		
		
		
		
		
		
	}
}
