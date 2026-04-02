package com.kh.model.vo;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private List<Student> list = new ArrayList();

	public boolean createStudent(StudentDto dto) {
		if (dto == null) {
			return false;
		}
		list.add(new Student(dto.getName(), dto.getGender(), dto.getPassword(), dto.getId(), dto.getScore(),
				dto.getAge()));
		return true;
	}

	public List<Student> readStudent() {
		return list;
	}

	public Student checkById(String id) {
		if (id == null) {
			return null;
		}

		for (int i = 0; i < list.size(); i++) {
			if (id.equals(list.get(i).getId())) {
				return list.get(i);
			}
		}
		return null;
	}

	public boolean checkByPassword(String password) {
		if (password == null) {
			return false;
		}
		for (int i = 0; i < list.size(); i++) {
			if (password.equals(list.get(i).getPassword())) {
				return true;
			}
		}
		return false;
	}

	public boolean updateStudent(Student student, int score) {
		int num = list.size();
		for (int i = 0; i < list.size(); i++) {
			if (student.getId() == list.get(i).getId()) {
				list.set(i, new Student(student.getId(), student.getGender(), student.getPassword(), student.getId(),
						score, student.getAge()));
				return true;
			}
		}
		return false;
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (student.getId() == list.get(i).getId()) {
				list.remove(i);

			}
		}
	}

	public Student searchStudent(String name) {
		for (int i = 0; i < list.size(); i++) {

			if (name.equals(list.get(i).getName())) {
				return list.get(i);
			}
		}
		return null;
	}
}