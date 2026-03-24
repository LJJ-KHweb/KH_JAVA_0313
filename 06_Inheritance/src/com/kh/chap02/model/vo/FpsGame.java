package com.kh.chap02.model.vo;

public class FpsGame extends Game{
	private int stress;
	
	public FpsGame(String gameName, String publisher, int stress) {
		super(gameName, publisher);
		this.stress = stress;
	}

	public FpsGame(int stress) {
		super();
		this.stress = stress;
	}

	public FpsGame() {
		super();
	}
	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}
	public String info() {
		return super.info() + ", 스트레스 지수 : " + stress + "]";
	}

}
