package kh.com.chap01.run.model.vo;

public class Hang {
	private String name;
	
	
	public Hang(String name) {
		super();
		this.name = name;
	}
	public void cooking() {
		System.out.println(name + "이승철 요리 시작");
	}
	public void breakTime() {
		System.out.println(name + "이승철 쉬는 시간");
	}
}
