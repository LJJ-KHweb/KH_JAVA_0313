package com.kh.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.controller.StudentController;
import com.kh.model.vo.Student;
import com.kh.model.vo.StudentDto;

public class StudentView {
	private Scanner sc = new Scanner(System.in);
	private StudentController controller = new StudentController();

	public void mainView() {

		while (true) {
			System.out.println("==== 학생 성적 관리 시스템입니다. =====");
			System.out.println("1. 학생 등록 ");
			System.out.println("2. 학생 전제 조회");
			System.out.println("3. 학생 성적 수정");
			System.out.println("4. 학생 삭제");
			System.out.println("5. 학생 개별 모든 정보 검색");
			System.out.println("6. 프로그램 종료");
			System.out.print("번호를 선택해 주세요 > ");
			int menuNum = 0;
			try {
				menuNum = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("번호를 입력해 주세요.");
				sc.nextLine();
				continue;
			}
			switch (menuNum) {
			case 1:
				createStudent();
				break;
			case 2:
				readStudent();
				break;
			case 3:
				updateStudent();
				break;
			case 4:
				deleteStudent();
				break;
			case 5:
				searchStudent();
				break;
			case 6:
				System.out.println("프로그램이 종료됩니다.");
				sc.close();
				return;
			default:
				continue;

			}
		}
	}

	private void createStudent() {
		System.out.println("===== 학생 등록 창입니다. =====");
		System.out.print("등록하실 학생 이름을 입력해주세요(두글자 이상) >");
		String name = sc.nextLine();
		if(checkByName(name)) {
			System.out.println("이름이 1자리 이하입니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
		System.out.print("아이디를 입력해주세요(4자리 이상) > ");
		String id = sc.nextLine();
		if(checkById(id)) {
			System.out.println("아이디가 4자리 미만입니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
		System.out.print("비밀번호를 입력해 주세요(4자리 이상) > ");
		String password = sc.nextLine();
		if(checkByPassword(password)) {
			System.out.println("비밀번호가 4자리 미만입니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
		System.out.print("성별을 입력해 주세요(남성or여성) > ");
		String gender = sc.nextLine();
		if(checkByGender(gender)) {
			System.out.println("성별은 남성 or 여성만 선택이 가능합니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
		
		System.out.print("나이를 입력해 주세요(1살이상) > ");
		try {
			int age = Integer.parseInt(sc.nextLine());
			if(checkByAge(age)) {
				System.out.println("나이는 1살이상이여야 합니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			System.out.print("점수를 입력해주세요(0점이상) > ");
			int score = Integer.parseInt(sc.nextLine());
			if(checkByScore(score)) {
				System.out.println("점수는 0점이상이여야 합니다.");
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			boolean result = controller.createStudent(new StudentDto(name, gender, password, id, score, age));
			if (result) {
				System.out.println("학생 등록에 성공하셨습니다.");
			} else {
				System.out.println("학생 등록에 실패했습니다.");
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("메뉴로 올라갑니다.");
			return;
		}

	}

	private void readStudent() {
		List<Student> list = controller.readStudent();
		if (list == null) {
			System.out.println("등록된 학생의 정보가 없습니다.");
			return;
		}
		for (Student s : list) {
			readOneStudent(s,false);
		}
	}

	private void updateStudent() {

		System.out.print("성적을 바꾸실 학생 아이디를 입력해주세요 >");
		Student student = checkLogIn();
		if (student == null) {
			return;
		}
		System.out.print("성적을 입력해 주세요 > ");
		int score = 0;
		try {
			score = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 값을 입력하셨습니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			sc.nextLine();
			return;
		}
		boolean result = controller.updateStudent(student, score);
		if (result) {
			System.out.println("학생의 정보가 수정되었습니다.");
		} else {
			System.out.println("학생의 정보가 수정에 실패했습니다.");
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		}
	}

	private void deleteStudent() {
		System.out.print("삭제하실 학생 아이디를 입력해주세요 >");
		Student student = checkLogIn();
		if(student == null) {
			return;
		}
		controller.deleteStudent(student);
	}

	private Student checkLogIn() {
		String id = sc.nextLine();
		Student checkStudent = controller.checkById(id);
		if (checkStudent == null) {
			System.out.println("일치하는 아아디정보를 가진 사용자가 없습니다.");
			System.out.println("메인 메뉴로 올라갑니다.");
			return null;
		}
		System.out.println(checkStudent.getName() + "님 안녕하세요");
		System.out.println("아이디 : " + checkStudent.getId());
		System.out.print("비밀번호를 입력해 주세요 > ");
		String password = sc.nextLine();
		boolean result = controller.checkByPassword(password);
		if (result) {
			System.out.println("로그인 성공");
			return checkStudent;
		} else {
			System.out.println("로그인 실패");
			return null;
		}

	}
	private void searchStudent() {
		System.out.print("개별 검색하실 학생의 이름을 알려주세요 > ");
		String name =sc.nextLine();
		Student student = controller.searchStudent(name);
		if(student == null) {
			return;
		}
		readOneStudent(student, true);
	}

	private void readOneStudent(Student s, boolean check) {
		System.out.println("===========================");
		System.out.println("학생 이름 : " + s.getName());
		System.out.println("학생 나이 : " + s.getAge());
		System.out.println("학생 성별 : " + s.getGender());
		System.out.println("학생 성적 : " + s.getScore());
		if(check) {
			System.out.println("학생 아이디 : " + s.getId());
			System.out.println("학생 비밀번호 : " + s.getPassword());
		}
		System.out.println("===========================");
	}
	public boolean checkByName(String name) {
		if(name.length() < 2) {
			return true;
		}
		return false;
	}
	
	public boolean checkById(String id) {
		if(id.length() < 4) {
			return true;
		}
		return false;
	}
	public boolean checkByPassword(String password) {
		if(password.length() < 4) {
			return true;
		}
		return false;
	}
	public boolean checkByGender(String gender) {
		if("남성".equals(gender)||"여성".equals(gender)) {
			return false;
		}
		return true;
	}
	public boolean checkByAge(int age) {
		if(age <= 1) {
			return true;
		}
		return false;
	}
	public boolean checkByScore(int score) {
		if(score < 0) {
			return true;
		}
		return false;
	}
}
