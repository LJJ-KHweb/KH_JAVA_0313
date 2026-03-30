package com.kh.chap01.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		
		File file = new File("abc.txt");
		try {
			file.createNewFile();
			File folder = new File("folder");
			folder.mkdir();
			File file2 = new File("folder/test.txt");
			file2.createNewFile();
			
			System.out.println("파일인가요 ?? : " + file2.isFile());
			System.out.println("파일명은 뭔가요 ?  : " + file2.getName());
			System.out.println("파일의 절대 경로는 뭔가요? " +file2.getAbsolutePath());
			System.out.println("파일의 크기는 얼만가요 ? : " +file2.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
