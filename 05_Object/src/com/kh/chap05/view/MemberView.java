package com.kh.chap05.view;

import java.util.Scanner;

import com.kh.chap05.model.vo.Member;

public class MemberView {

	public void memberMenu() {
		Member m = new Member();
		Scanner sc = new Scanner(System.in);
		Member m2 = new Member(sc.nextLine(),sc.nextLine(),sc.nextLine());
		System.out.println(m.info());
		System.out.println(m2.info());
		
	}
}
