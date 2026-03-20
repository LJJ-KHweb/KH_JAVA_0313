package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {

	public static void main(String[] args) {
		AutoSellingMachine asm = new AutoSellingMachine();
		asm.setsProduckName("신라면");
		asm.setiProduckPrice(1100);
		asm.setiProduckAmount(3);
		
		System.out.println(asm.getsProduckName());
		System.out.println(asm.getiProduckPrice());
		System.out.println(asm.getiProduckAmount());
		
		asm.setsProduckName("삼양라면");
		asm.setiProduckPrice(900);
		asm.setiProduckAmount(5);

		/*
		 * String name = asm.getsProduckName(); int amount = asm.getiProduckAmount();
		 * int price = asm.getiProduckPrice();
		 * 
		 * System.out.println(name); System.out.println(price);
		 * System.out.println(amount);
		 */
		String info = asm.printInfor();
		System.out.println(info);
	}

}
