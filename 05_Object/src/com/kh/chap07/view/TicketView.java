package com.kh.chap07.view;

import java.util.Scanner;

import com.kh.chap07.model.vo.Ticket;

public class TicketView {
	private Scanner sc = new Scanner(System.in);
	private Ticket t;

	public void mainMenu() {
		int num;

		while (true) {
			System.out.println("티켓 발권 서비스입니다.~");
			System.out.println("원하시는 메뉴를 선택해주세요~");
			System.out.println("1. 티켓 추가하기");
			System.out.println("2. 티켓 발급하기");
			System.out.println("3. 프로그램 종료");
			System.out.print("원하시는 메뉴를 선택해주세요 > ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				saveView();
				break;
			case 2:
				if(t == null) {
					System.out.println("아직 저장된 티켓이 없습니다.");
					break;
				}
				System.out.println(t.info());
				break;
			case 3:
				System.out.println("프로그램이 종료됩니다.......");
				sc.close();
				return;
			default:
				System.out.println("잘 못 누르셨습니다 ");
				break;
			}

		}

	}

	private void saveView() {
		int price;
		String seatNumber;
		String meal;
		String service;
		System.out.print("티켓 가격을 입력해주세요 >");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("기내식을 입력해주세요 > ");
		meal = sc.nextLine();
		System.out.print("좌석 번호를 입력해 주세요 >");
		seatNumber = sc.nextLine();
		System.out.print("서비스를 입력해주세요 > ");
		service = sc.nextLine();
		t = new Ticket(price, seatNumber, service,meal);
	}

}
