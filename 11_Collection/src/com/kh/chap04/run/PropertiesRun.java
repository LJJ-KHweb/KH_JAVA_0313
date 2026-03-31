package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		Date n = new Date();
		System.out.println(n);
		Properties prop = new Properties();
		//prop.put("sread", new Sandwich("맛있음", "에그마요"));
		prop.setProperty("List", "LinkedList");
		try {
			prop.store(new FileOutputStream("test.properties"), "하이");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
