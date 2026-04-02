package com.kh.student.controller;

import java.util.List;

import com.kh.student.model.service.Service;
import com.kh.student.model.vo.Student;

public class Controller {
	private Service s = new Service();
	
	public List<Student> selectAll(){
		return s.selectAll();
	}
	
	public void insert(String name, String gender, int age) {
		s.insert(name,gender,age);
	}
	
	public void update(String name, String gender, int age) {
		s.update(name, gender, age);
	}
	public void delete(String name) {
		s.delete(name);
	}
}
