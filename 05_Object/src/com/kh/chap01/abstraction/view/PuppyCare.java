package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.run.model.vo.Puppy;

public class PuppyCare {
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("🐶강아지 다마고치🐶");
		Puppy puppy = new Puppy();
		System.out.print("아이구 강아지가 귀여워요 이름이 뭐에요 >");
		puppy.setsName(sc.nextLine());
		System.out.print("아이구 무슨 종이예요? >");
		puppy.setsGender(sc.nextLine());
		System.out.print("아이구 암컷이에요? 수컷이에요? >");
		puppy.setsSpecies(sc.nextLine());
		System.out.print("몇살이에여?  >");
		puppy.setiWeight(sc.nextInt());
		System.out.print("아이구 몸무게기// >");
		sc.nextLine();
		puppy.setiAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("---------------------------------------------------------------------------	");	
	}

}
