package kh.com.chap01.run.model.vo;

public class Chef {
	private String name;

	public Chef(String name) {
		super();
		this.name = name;
	}
	public void cooking() {
		System.out.println("요리 시작");
	}
	public void breakTime() {
		System.out.println("쉬는 시간");
	}
	public String getName() {
		return name;
	}
	

}
