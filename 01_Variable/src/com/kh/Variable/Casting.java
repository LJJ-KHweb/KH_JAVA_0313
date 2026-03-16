package com.kh.Variable;

// Type Casting (자료형변환/ 형변환) ★★★★★
// JAVA에서 값을 처리하는 규칙
// 1.	=(대입 연산자)를 기준으로 왼쪽 = 오른쪽이 같은 자료형이여야 한다
// 		같은 자료형에 해당하는 리터럴값만 대입할 수 있음
//		자료형이 다를 경우 -> 값을 바꿔서 대입해야 함
// 2.	같은 자료형들끼리만 연산이 가능함
// 		자료형이 다른데 연산을 하려면 둘중 하나를 형변환을 해서 맞춰줘야 한다.
// 3.	연산의 결과물도 동일한 자료형이여야 한다.
//		
//[표현법] (바꾸고싶은자료형)값;
// () -> 형변환연산자 / cast연산자
//
//	1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨
//		작은 크기의 자료형이 큰 크기의 자료형이 되야 할때
//      되는 이유 : 표현할수 있는 값의 범위가 더 넓기 때문
//	2. 강제형변환(Type Casting) : 자동형변환이 이루어지지 않는 경우 진행
//		직접 형변환을 해야할 때 -> (자료형)을 통해 진행
//	boolean = 1byte char = 2byte byte =1byte short = 2byte int = 4byte long = 8byte 
// 	float = 4byte double = 8byte
//  3. long -> float 특이케이스 
//  
//	번외. byte 또는 shor형 간의 연산
//	byte b2 = 126;
// 	byte b3 = 3;
//  System.out.println(b2 + b3); 결과값은 129
//  결과값은 int형 -> 연산장치가 값을 처리하는 크기가 int형임


public class Casting {

	public void autoCasting() {
		//int inum1 = 1;
		//double dnum1 = (double)inum1;
		//int bigNum = 120;
		//long smallLong = bigNum;
		//long lNum = 10000000000000L;
		//int iNum2 = (int)lNum;
		//float fNum = lNum;
		
		//System.out.println(fNum);
		//System.out.println(iNum2);
		
		//System.out.println("===============================");
		char ch = 'a';
		int iNum3 = ch;
		char ch2 = 97;
		//System.out.println(iNum3);
		//System.out.println(ch2);
		//System.out.println('a'+'3');
		//System.out.println((char)('a' + 3));
		//System.out.println((char)'3'+ (char)3);
		
		System.out.println('a' == 97);
		
		double dNum3 = 10.123456789;
		float fNum3 = (float)dNum3;
		System.out.println(dNum3);
		System.out.println(fNum3);
		
		//System.out.println(smallLong);
		//System.out.print(inum1 +" "+ dnum1);
		
		//System.out.println("이 내용을 콘솔창에 출력해 보세요");
	}
	
	
	

}
