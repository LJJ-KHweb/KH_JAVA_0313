package com.kh.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {

	public void method1() {
		String abc = "abc";
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(abc + str1 + str2.toString());
		str1.hashCode();
		Run run = new Run();
		run.hashCode();
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}

	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		// equals()
		System.out.println(str1.equals(str2));
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

	public void method3() {
		String str1 = new String("hello");
		String str2 = "hello";
		str2 += "bye";
		System.out.println(str1 + str2);
	}

	public void method4() {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);

		StringBuilder sr = new StringBuilder();
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
	}

	public void method5() {
		String str = "은총알은 없다";
		System.out.println("Str의 길이 : " + str.length());
		String[] emails = { "hong@kh.com", "kim@kh.com", "lee@kh.com", "hahahaho@kh.com" };
		System.out.println(emails[0].substring(0, 4));
		for (int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		}
		String fileName = "sdasdasdasdasd.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));

		String fileName2 = "sd.sd.sd.sd.sd.sd.png";
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".")));
		String str2 = "배열로 만들 문자열";
		char[] chArr = str2.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		for (char a : chArr) {
			System.out.println(a);
		}
		String str3 = String.valueOf(chArr);
		System.out.println(str3);
	}

	public void method6() {
		String replaceStr = "KH아카데미";
		System.out.println(replaceStr.replace("KH", "더좋은"));
		String str1 = "abcd";
		String str2 = "ABCD";
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
	}

	public void method7() {
		String split = "갈비,갈비찜,곽만금갈비찜,곽만근얼큰갈비탕";
		String[] galubi = split.split(",");
		System.out.println(Arrays.toString(galubi));

		StringTokenizer stn = new StringTokenizer(split, ",");
		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextElement());
		}
	}
}
