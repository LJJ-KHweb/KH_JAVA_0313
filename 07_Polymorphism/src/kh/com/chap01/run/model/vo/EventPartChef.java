package kh.com.chap01.run.model.vo;

public class EventPartChef extends Chef{

	public EventPartChef(String name) {
		super(name);
	}

	@Override
	public void cooking() {
		System.out.println("이벤트");
	}
	
}
