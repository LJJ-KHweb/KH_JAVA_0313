package com.kh.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private String gender;
	private String password;
	private String id;
	private int score;
	private int age;
	public Student(String name, String gender, String password, String id, int score, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.password = password;
		this.id = id;
		this.score = score;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getPassword() {
		return password;
	}
	public String getId() {
		return id;
	}
	public int getScore() {
		return score;
	}
	public int getAge() {
		return age;
	}
	

	
	
	

}
