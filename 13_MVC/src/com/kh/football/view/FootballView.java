package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

//시각적인 부분, 화면 입/출력
public class FootballView {
	private Scanner sc = new Scanner(System.in);
	private FootballController fc = new FootballController();
	private	BoardView bv = new BoardView();

	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("축구 선수 관리 프로그램입니다.");
			System.out.println("1.축구선수 전체 조회 하기");
			System.out.println("2.축구선수 추가하기");
			System.out.println("3.축구선수 수정하기");
			System.out.println("4.축구선수 삭제하기");
			System.out.println("5.축구선수 정보 출력하기");
			System.out.println("6.축구선수 검색하기");
			System.out.println("7.축구 이야기 게시판");
			System.out.println("0.축구선수 종료하기");
			System.out.println();
			System.out.print("어떤 기능을 이용하시겠어요 > ");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.nextLine();
				continue;
			}

			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			case 1:
				selectAll();
				break;
			case 2:
				insertFootballPlayer();
				break;
			case 3:
				updateFootballPlayer();
				break;
			case 4:
				deleteFootballPlayer();
				break;
			case 5:
				fc.outputFootballPlayer();
				break;
			case 6:
				serachFootballPlayer();
				break;
			case 7:
				bv.boardMenu();
				break;
			default:
				System.out.println("없는 메뉴 입니다. 다시 선택해주세요");
				break;
			}

		}

	}

	private void serachFootballPlayer() {
		System.out.println("선수 검색 서비스입니다.");
		System.out.print("찾고 싶은 이름의 키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		List<FootballPlayer> searched = fc.searchByKeyword(keyword);
		if(searched.isEmpty()) {
			System.out.println("================================");
			System.out.println("검색결과가 존재하지 않습니다.");
			System.out.println("================================");
		}else {
			System.out.println();
			System.out.println("검색 결과 입니다.");

			for(FootballPlayer player : searched) {
				System.out.println("이름 : " + player.getName() + " 포지션 : " + player.getPosition() + " 등 변호 : " + player.getBackNumber());
			}
			System.out.println();
		}
		
		
	}

	private void selectAll() {
		List<FootballPlayer> list = fc.selectAll();
		if (!list.isEmpty()) {
			for (FootballPlayer fp : list) {
				System.out.println("===== 선수의 정보 =====");
				System.out.println("아이디 : " + fp.getId());
				System.out.println("====================");
				System.out.println("선수 이름 	: " + fp.getName());
				System.out.println("====================");
				System.out.println("포지션 	: " + fp.getPosition());
				System.out.println("====================");
				System.out.println("등 번호 	: " + fp.getBackNumber());
				System.out.println("====================");
				System.out.println();
				System.out.println();
			}
		} else {
			System.out.println("===================");
			System.out.println("선수 정보가 없습니다.");
			System.out.println("새로운 선수를 추가해보세요!");
			System.out.println("금액은 무료입니다!!");
			System.out.println("===================");

		}
	}

	private void insertFootballPlayer() {
		// 뷰가 해야할 일
		// 1.사용자의 입력값 받기
		// 2. 모델에서 만든 값 출력하기
		System.out.println("======축구 선수 추가 =======");
		System.out.print("선수 이름을 입력해 주세요 > ");
		String name = sc.nextLine();
		System.out.print("선수 포지션을 입력해 주세요 > ");
		String position = sc.nextLine();
		System.out.print("선수 등 번호를 입력해주세요 > ");
		int backNumber;
		try {
			backNumber = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("등 번호는 숫자만 입력이 가능합니다.");
			return;
		}

		// insertFootballPlayerInfo(fc.insertFootballPlayer(new FootballPlayerDto(name,
		// position, backNumber)));
		FootballPlayer fp = fc.insertFootballPlayer(new FootballPlayerDto(name, position, backNumber));

		if (fp == null) {
			System.out.println("정보 입력 실패");
			System.out.println("관리자에게 문의하세요");
			return;
		}
		System.out.println("==========================================");
		System.out.println("추가된 선수 이름 : " + fp.getName());
		System.out.println("추가된 선수 포지션 : " + fp.getPosition());
		System.out.println("추가된 선수 등번호 : " + fp.getBackNumber());
		System.out.println("==========================================");
	}

	private void insertFootballPlayerInfo(FootballPlayer fp) {
		if (fp == null) {
			System.out.println("정보 입력 실패");
			return;
		}

		System.out.println("==========================================");
		System.out.println("추가된 선수 이름 : " + fp.getName());
		System.out.println("추가된 선수 포지션 : " + fp.getPosition());
		System.out.println("추가된 선수 등번호 : " + fp.getBackNumber());
		System.out.println("==========================================");
	}

	private void updateFootballPlayer() {
		// fc.updateFootballPlayer();
		selectAll();
		System.out.println("어떤 선수의 정보를 갱신하겠습니까? ");
		System.out.print("선수의 아이디를 숫자로 입력해주세요 > ");
		try {
			int id = Integer.parseInt(sc.nextLine());
			if (!fc.findById(id)) {
				return;
			}
			System.out.println("변경하실 이름을 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.println("변경하실 포지션을 입력해주세요 > ");
			String position = sc.nextLine();
			System.out.println("변경하실 등번호를 입력해주세요 > ");
			int backNumber = Integer.parseInt(sc.nextLine());
			fc.updateFootballPlayer(id, new FootballPlayerDto(name,position, backNumber));

		} catch (NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		}

	}

	private void deleteFootballPlayer() {
		// fc.deleteFootballPlayer();
		System.out.println("등록된 축구선수를 해지하겠습니다.");
		selectAll();
		System.out.println("어떤 선수의 정보를 삭제하시겠습니까?");
		System.out.print("선수의 아이디를 숫자로 입력해주세요");
		int id = 0;
		try {
			id = sc.nextInt();
			sc.nextLine();
		}catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요");
			System.out.println("메인 메뉴로 돌아갑니다");
			sc.nextLine();
			return;
		}
		if (!fc.findById(id)) {
			System.out.println("잘못된 ID값입니다.");
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		}
		String result = fc.deleteFootballPlayer(id);
		if(result != null) {
			System.out.println(result + "선수의 정보가 삭제되었습니다.");
		}else {
			System.out.println("id를 찾을 수 없습니다.");
		}
	}
}
