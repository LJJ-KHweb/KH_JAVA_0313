package kh.com.chap01.run.model.vo;

public class SaladChef {
	private String name;

	public SaladChef(String name) {
		super();
		this.name = name;
	}
	public void saladCooking() {
		System.out.println(name + "셀러드 요리합니다 .");
	}
	public void breakTime() {
		System.out.println(name + "쉬는시간 ");
	}
	

}
