package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.run.model.vo.Puppy;
import com.kh.chap01.abstraction.run.model.vo.Test;

public class Run {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		Puppy p = new Puppy("나폴레옹", "푸들", "암컷", 8, 5);
		Puppy p2 = new Puppy("징기스칸", "방하르", "수컷", 15, 5);
		p.PrintInfor();
		puppy.PrintInfor();
		p2.PrintInfor();
		System.out.println(puppy.getiWeight());
		//puppy.bark();
		//puppy.sit();
		//puppy.sit();
		//puppy.sit();
		//System.out.println(puppy.getiWeight());

		Scanner sc = new Scanner(System.in);
		//Test t = new Test("루이");
		/*
		 * int iNum = 0; System.out.println("고양이 다마고치에 오신것을 환영합니다.");
		 *
		 * while(true) { System.out.print("1. 고양이 상태보기 2.밥주기 3.쓰다듬기 4.종료"); iNum =
		 * sc.nextInt(); switch(iNum) { case 1: t.PrintInfor(); break; case 2:
		 * System.out.println("우걱우걱"); if(t.getHungry() >=10) {
		 * System.out.println("고양이가 배가불러 배가 터졌습니다."); t.setLove(-1); t.setHp(-5); } else
		 * { System.out.println("고양이가 만족해합니다."); t.setHungry(1); if(t.getLove() <10){
		 * t.setLove(1); } } t.PrintInfor(); break; case 3: if(t.getLove() <10) {
		 * t.setLove(1); } t.PrintInfor(); break; case 4: return;
		 * 
		 * } if(t.getHp() <= 0) { System.out.println("고양이가 죽었습니다."); return; }
		 * 
		 * 
		 * 
		 * }
		 */

		while (true) {
			System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●");
			System.out.println(puppy.getsName() + "의 정보 !");
			System.out.println("나이 : " + puppy.getiAge());
			System.out.println("성별 : " + puppy.getsGender());
			System.out.println("종 : " + puppy.getsGender());
			System.out.println("몸무게 : " + puppy.getiWeight());
			System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●");
			System.out.println();
			System.out.println("메뉴를 선택해 주세여!");
			if (puppy.getiWeight() > 10) {
				System.out.println("* 운동을 위해 앉기를 추천드립니다.");
			}
			System.out.println("1. 짖기 / 2.앉기 / 3.프로그랩 종료 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch(menuNo) {
			case 1: puppy.bark(); break;
			case 2: puppy.sit(); break;
			case 3: return;
			default: System.out.println("잘못 눌렀습니다.");
			}
		}

	}

}
