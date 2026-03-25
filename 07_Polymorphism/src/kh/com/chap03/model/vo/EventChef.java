package kh.com.chap03.model.vo;

public class EventChef extends Chef {

	public EventChef(String name) {
		super(name);
	}
	@Override
	public void cooking() {
		System.out.println("이벤트 받아라~");
	}
}
