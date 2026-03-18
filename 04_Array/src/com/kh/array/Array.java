package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public void method1() {
		
		int[] iNums = new int[5];
		int iSum= 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < iNums.length; i++) {
			System.out.print((5-i)+"번동안 정수를 입력해주세요> ");
			iNums[i] = sc.nextInt();
		}
		for(int i = 0; i <iNums.length; i++) {
			iSum += iNums[i];
		}
		
		System.out.println(iSum);
		
		
	}
	
	public void method2() {
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		for(int i = 0; i < 3; i++) {
			numbers1[i] = i*3;
			
		}
		numbers2 = numbers1;
		numbers2[0] = 21;
		
		for(int i = 0; i<3; i++) {
			System.out.println(numbers1[i]);
		}

	}
	public void createLotto(){
		int[] iNums = new int[6];
		for(int i = 0; i<6; i++) {
			
			iNums[i] = (int)(Math.random()*45)+1;
			if(i > 1) {
				if(iNums[i] == iNums[i-1]) {
					i--;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(iNums));
	}
	
	public void method3() {
		
		String[] sdans = new String[9];
		for(int i = 0; i < 9;i++) {
			sdans[i] = 2 + " * " + (i+1) + " = " + 2*(i+1) ;
		}
		System.out.println(Arrays.toString(sdans));
	}
	
	public void method4() {
		char[] love = new char[4];
		love[0] = 'L';
		love[1] = 'O';
		love[2] = 'V';
		love[3] = 'E';
		System.out.println(Arrays.toString(love));
		love[1] = 'I';
		System.out.println(Arrays.toString(love));
		love = new char[5];
		
	}
	public void method5() {
		int[] arr = {100,200,300};
		System.out.println(Arrays.toString(arr));
	}
	
	public void method6() {
		int[] origin = {1,2,3};
		int[] copy;
		int[] deepCopy = {0,0,0,0,0,0};
		copy = origin;			//얕은복사
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		for(int i = 0; i < origin.length ; i++) {
			deepCopy[i] = origin[i];
		}
		origin[2] = 100;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(deepCopy));
		
	}
	/*
	 * public void Test() { int[] iNum = new int[5]; int[] iSum = new int[5];
	 * 
	 * for(int i = 0; i <5; i++) { iNum[i] = i; } System.out.println("iSum = "+iSum
	 * + " iNum = " +iNum); iSum = iNum; System.out.println("iSum = "+iSum +
	 * " iNum = " +iNum);
	 * 
	 * for(int i = 0; i <5; i++) { System.out.println(iSum[i]); }
	 * 
	 * }
	 */
}

// 배열이 특징을 물어보면 배열은 논리구조와 물리구조가 동일하다
// 배열이 뭐냐구 물어보면 배열은 자료구조다
// ex) int array[];
// ex) int[] array;
// ex_ int[] array = new int[정수]; 정수-> 원하는 배열의 크기
// Arrays.toString(배열식별자) -> 배열의 요소들을 출력


/*
 * 
 * 
 * 
 * char형의 기본값은 '' 정수형의 기본값은 0, 실수형의 기본값은 0.0
 * 
 * 
 * 정보처리기사 
 * 외국어 점수 : 영어
 * 대회 많이 참가
 * 
 *연결이 끊긴 할당을 받은 메모리는 Garbage Collection이 일정시간 지나고 청소함
 * -> 참조하고 있던 연결이 끊겨야 garbage collection이 일을하기때문에 null값을 대입해 reference를 0으로 만들어준다.
 * 
 * 
 * */


