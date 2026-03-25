package kh.com.chap03.model.vo.controller;

public class Pasta extends Cooking{
	
	private void pastaCooking() {
		System.out.println("나는 파스타다");
	}
	
	@Override
	public void cooking() {
		pastaCooking();
	}

}
