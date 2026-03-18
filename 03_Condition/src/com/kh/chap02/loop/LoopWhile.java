package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopWhile {
	
	public void method1() {
		int i= 1;
		int iSum = 0;
		int iNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 합을 구하고 싶은 수를 적으시오 >");
		iNum = sc.nextInt();
		while(i <= iNum) {	
			iSum += i;	
			i++;
		}
		System.out.println("1 ~ " + (i-1) + " 까지의 합은 : " + iSum);

		
	}
	
	public void method3() {
		
		double dRandom = Math.random();
		System.out.println(dRandom);
		int iNum = (int)(dRandom*10)+1;
		int i = 1;
		int iSum = 0;
	
		while(i <= iNum) {	
			iSum += i;	
			i++;
		}
		System.out.println("1 ~ " + iNum + " 까지의 합은 : " + iSum);
		
	}
	
	public void lotto() {
		int num1 = (int)(Math.random()*45+1);
		int num2 = (int)(Math.random()*45+1);
		int num3 = (int)(Math.random()*45+1);
		int num4 = (int)(Math.random()*45+1);
		int num5 = (int)(Math.random()*45+1);
		int num6 = (int)(Math.random()*45+1);
		int num7 = (int)(Math.random()*45+1);
		
		System.out.printf("%d, %d, %d, %d, %d, %d, %d",num1,num2,num3,num4,num5,num6,num7);
	}
}
