package com.kh.student.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.student.model.vo.Student;

public class Service {
	private List<Student> list = new ArrayList();
	{
		list.add(new Student("이재준", "남성", 29));
		list.add(new Student("박경환", "남성", 35));
		list.add(new Student("남인형", "남성", 37));
	}

	public List<Student> selectAll() {
		return list;
	}

	public void insert(String name, String gender, int age) {
		list.add(new Student(name, gender, age));
	}

	public void update(String name, String gender, int age) {
		int num = 0;
		for (Student s : list) {
			if (s.getName().equals(name)) {
				break;
			}
			num++;

		}
		list.set(num, new Student(name, gender, age));
	}

	public void delete(String name) {
		int num = 0;
		for (Student s : list) {
			if (s.getName().equals(name)) {
				break;
			}
			num++;

		}
		list.remove(num);
	}
}
