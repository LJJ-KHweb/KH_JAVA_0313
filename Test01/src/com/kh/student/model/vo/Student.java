package com.kh.student.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private String Gender;
	private int age;
	public Student(String name, String gender, int age) {
		super();
		this.name = name;
		Gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return Gender;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Gender=" + Gender + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Gender, age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Gender, other.Gender) && age == other.age && Objects.equals(name, other.name);
	}
	
}
