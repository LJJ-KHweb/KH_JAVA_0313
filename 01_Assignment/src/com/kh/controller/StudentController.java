package com.kh.controller;

import java.util.List;

import com.kh.model.vo.Student;
import com.kh.model.vo.StudentDto;
import com.kh.model.vo.StudentService;

public class StudentController {
	private StudentService service = new StudentService();

	public boolean createStudent(StudentDto dto) {
		return service.createStudent(dto);

	}

	public List<Student> readStudent() {
		return service.readStudent();
	}

	public Student checkById(String id) {
		return service.checkById(id);

	}

	public boolean checkByPassword(String password) {
		return service.checkByPassword(password);

	}

	public boolean updateStudent(Student student, int score) {
		return service.updateStudent(student, score);
	}

	public void deleteStudent(Student student) {
		service.deleteStudent(student);
		
	}

	public Student searchStudent(String name) {
		
		return service.searchStudent(name);
	}

}
