package com.kh.football.model.dto;

//DTO : Data Transfer Object
//-> 순수하게 데이터를 옮겨담을 용도로 만드는 클래스
//VO -> 불변(값의 변동이 일어나면 안됨 원래 final 키워드가 붙어야됨)
//필드, 기본생성자, 매개변수생성자, getter / setter
//		DTO					/			VO			
//	  값의 전송				/		값을 담음
//	  Setter O				/		Setter X(불면)
//	  코드 안넣음				/		equals(), hashCode(), 비즈니스로직
// 극단적으로 가면 필드를 public	/		필드를 final 로 선언

public class FootballPlayerDto {
	private String name;
	private String position;
	private int bakcNumber;
	
	public FootballPlayerDto() {
		
	}

	public FootballPlayerDto(String name, String position, int bakcNumber) {
		this.name = name;
		this.position = position;
		this.bakcNumber = bakcNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBakcNumber() {
		return bakcNumber;
	}

	public void setBakcNumber(int bakcNumber) {
		this.bakcNumber = bakcNumber;
	}
	
	
	
}
