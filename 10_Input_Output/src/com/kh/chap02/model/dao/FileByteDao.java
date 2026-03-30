package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//VO	(Value Object)

//DAO	(Data Access Object)
//-> 데이터가 보관되어있는 공간에 직접 접근해서 입력 또는 출력하는 메소드를 구현해줌

public class FileByteDao {
	// 파일에 프로그램에서 만들어진 데이터를 출력(ByteStream사용)
	public void outputToFile() {
		// 출력 : 프로그램내의 데이터를 밖으로 내보내겠다. 프로그램 -->외부(파일)
		// FileOutputStream : "파일"로 데이터를 풀력할 때, 파일과 연결하는 1Byte 단위의 스트림
		FileOutputStream fos = null;
		try {
			// 1. FileOutputStream 객체 생성
			fos = new FileOutputStream("a_byte.txt");
			// 생성자 호출시 파일명을 전달, 존재하지 않는 파일일 경우 해당 파일을 생성하면서 스트림 생성
			// 생성자 호출시 두번째 인자값으로 true를 전달하면 이어쓰기/ 안쓰면 덮어쓰기
			// 2. 스트림을 통해 데이터를 출력 : write() 호출

			fos.write(97);
			fos.write(98);
			fos.write(99);

			byte[] arr = { 101, 102, 103 };
			fos.write(arr);

			fos.write('A');
			fos.write('B');

			fos.write('철'); // �
			// 1bte범위를 넘어가서 깨져버림
			// 바이트스트림으로는 한글/일본어/중국어 해결이단됨
			// 문자스트림을 사용해야 해결이 가능

			// 3. 스트림의 사용이 끝남
			// 반드시 해줘야하는 약속이있음
			// 코드상에서 사용이 전부 종료되었다면 반드시 자원반납을 해주어야함

			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			if (fos != null) {
				fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 프로그램 <== 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	// FileInputStream : 파일로부터 데이터를 가져와서 입력을 받을건데 1Byte단위로 입력받겠다.
	public void inputFromFile() {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a_byte.txt"); // 입력 스트림 생성하기
			// 2. 데이터를 입력받기

			/*
			 * while(true) { int num = fis.read(); if(num != -1) {
			 * System.out.println((char)num); }else break; }
			 */
			int value = 0;
			while((value = fis.read())!= -1) {
				System.out.println((char)value);
			}
			System.out.println((char)fis.read());
			// 파일의 마지막 데이터를 입력받고 나서 read 호출시 -1를 반환

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
