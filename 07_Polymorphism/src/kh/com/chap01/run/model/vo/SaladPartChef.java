package kh.com.chap01.run.model.vo;

public class SaladPartChef extends Chef{

	public SaladPartChef(String name) {
		super(name);
	}
	@Override
	public void cooking() {
		System.out.println(getName() + "샐러드 만듭니다~");
	}

}
