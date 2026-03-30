package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		
		String str1 = "10";
		String str2 = "1.1";
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);

		System.out.println(i+d);
	}

}
