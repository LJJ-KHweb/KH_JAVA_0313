package kh.com.chap04.model.service;

public interface CookingSkill {

	
	void makeDopbap();
	
	default void close() {
		System.out.println("가게 문 닫습니다.");
	}

}
