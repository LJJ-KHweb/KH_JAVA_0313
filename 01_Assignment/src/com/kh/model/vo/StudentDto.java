package com.kh.model.vo;

public class StudentDto {
	private String name;
	private String gender;
	private String password;
	private String id;
	private int score;
	private int age;
	
	public StudentDto(String name, String gender, String password, String id, int score, int age) {
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
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
