package kh.com.chap01.model.vo;

public class Child2 extends Parent {

	private int z;

	public Child2() {
		super();
	}

	public Child2(int z) {
		super();
		this.z = z;
	}
	public void printChild2() {
		System.out.println("자식클래스2 메소드입니다.");
	}
	@Override
	public void print() {
		System.out.println("자식클래스2 print메소드");
	}
	
}
