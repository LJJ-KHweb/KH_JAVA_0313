package com.kh.sw.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.sw.controller.SwitchController;
import com.kh.sw.exception.SwitchBoomException;

public class SwitchView {
	private SwitchController controller = new SwitchController();

	public void menu() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("불 켰다껐다 프로그램에 오신것을 환영합니다.");
			System.out.println("1. 스위치 누르기");
			System.out.println("2. 종료 하기");
			System.out.print("번호를 골라 주세요 > ");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정확한 메뉴번호를 입력해주세요.");
				continue;
			} finally {
				sc.nextLine();
			}
			switch (menuNo) {
			case 1:
				toggleSwitch();
				break;
			case 2:
				System.out.println("다음에 또 봐요!");
				sc.close();
				return;
			default:
				System.out.println("잘못된 번호를 누르셨습니다.");
				break;
			}
		}
	}

	private void toggleSwitch() {
		boolean check = false;
		try {
			controller.toggleSwitch();
		} catch (SwitchBoomException e) {
			System.out.println("도망가자");
			return;
		}
		if (controller.toggleSwitch()) {
			System.out.println("스위치를 켠 후 불이 켜졌습니다.");
		} else {
			System.out.println("스위치를 끈 후 불이 꺼졌습니다");
		}
	}

}
