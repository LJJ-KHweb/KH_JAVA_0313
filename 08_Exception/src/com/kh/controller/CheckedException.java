package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {

	public void readString() {
		// 임시저장공간(Buffer)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		try {
			String str = br.readLine();
			System.out.println(str.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void method() throws IOException {

		System.out.println("아주아주아주아주아주아주아주위험한코드");
		throw new RuntimeException("예와 발생");
	}
	
	
}
