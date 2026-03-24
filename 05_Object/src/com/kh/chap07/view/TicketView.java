package com.kh.chap07.view;

import java.util.Scanner;

import com.kh.chap07.controller.TicketController;
import com.kh.chap07.model.vo.Ticket;

public class TicketView {
	private Scanner sc = new Scanner(System.in);
	private TicketController tc = new TicketController();

	public void mainMenu() {
		int menunum;

		while (true) {
			System.out.println("티켓 발권 서비스입니다.~");
			System.out.println("원하시는 메뉴를 선택해주세요~");
			System.out.println("1. 티켓 추가하기");
			System.out.println("2. 티켓 발급하기");
			System.out.println("3. 프로그램 종료");
			System.out.println("4. 모두 출력하기");
			System.out.print("원하시는 메뉴를 선택해주세요 > ");
			menunum = sc.nextInt();
			sc.nextLine();

			switch (menunum) {
			case 1:
				saveView();
				break;
			case 2:
				printTicket();
				break;
			case 3:
				System.out.println("프로그램이 종료됩니다.......");
				sc.close();
				return;
			case 4:
				findAll();
				break;
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
		Ticket ticket = new Ticket(price, seatNumber, service, meal);

		if (tc.saveTicket(ticket) == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");

		}
	}

	private void printTicket() {

		Ticket ticket = tc.printTicket();
		if (ticket == null) {
			System.out.println("티켓이 하나도 존재하지 않습니다");
			return;
		}
			System.out.println(ticket.info());
		
	}
	private void findAll() {
		Ticket[] tickets = tc.findAll();
		for(int i =0; i< tickets.length; i++) {
			if(tickets[i] != null) {
				System.out.println(tickets[i].info());
			}
			
		}
	}

}
