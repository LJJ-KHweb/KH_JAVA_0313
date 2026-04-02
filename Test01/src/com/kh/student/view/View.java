package com.kh.student.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.student.controller.Controller;
import com.kh.student.model.vo.Student;

public class View {
	private Scanner sc = new Scanner(System.in);
	private Controller c = new Controller();

	public void mainMenu() {

		while (true) {
			System.out.println("출석부 프로그램입니다.");
			System.out.println("1.학생전체 출력");
			System.out.println("2.학생 추가");
			System.out.println("3.학생 수정");
			System.out.println("4.학생 삭제");
			System.out.println("5.프로그램 종료");

			int menu;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요!!!");
				sc.nextLine();
				continue;
			}
			switch (menu) {
			case 1:
				selectAll();
				break;
			case 2:
				insert();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("프로그램 종료합니다");
				sc.close();
				return;
			default:
				System.out.println("메뉴에 없는 번호를 골랐습니다.");
				break;
			}

		}

	}
	
	private void selectAll() {
		List<Student> list = c.selectAll();
		if(!list.isEmpty()) {
			for(Student s : list) {
				System.out.println(s);
			}
		}
	}
	
	private void insert() {
		String name;
		String gender;
		int age;
		System.out.print("추가 할 학생의 이름을 입력하세요 >");
		name = sc.nextLine();
		System.out.print("학생의 성별을 입력해주세요 >");
		gender = sc.nextLine();
		System.out.println("학생의 나이를 입력해주세요 >");
		age = sc.nextInt();
		sc.nextLine();
		c.insert(name, gender, age);
	}
	
	private void update() {
		String name;
		String gender;
		int age;
		System.out.print("수정할 학생의 이름을 입력하세요 >");
		name = sc.nextLine();
		System.out.print("학생의 성별을 입력해주세요 >");
		gender = sc.nextLine();
		System.out.print("학생의 나이를 입력해주세요 >");
		age = sc.nextInt();
		sc.nextLine();
		c.update(name, gender, age);
	}
	private void delete() {
		String name;
		System.out.println("삭제하실 학생의 이름을 입력하세요 > ");
		c.delete(name = sc.nextLine());
	}

}
