package com.kh.chap01.abstraction.run.model.vo;

public class Test {
	private String sName;
	private int iHp = 10;
	private int iHungry = 0;
	private int iLove = 0;
	
	public Test(String name) {
		this.sName = name;
	}
	
	public void PrintInfor() {
		System.out.println("고양이 상태");
		System.out.println("고양이 HP : " + this.iHp + "/10");
		System.out.println("고양이 포만감 : "+this.iHungry+"/10");
		System.out.println("고양이 하트 : " + this.iLove +"/10");
		
	}
	public void setHp(int i) {
		this.iHp += i;
		if(this.iHp <0) {
			this.iHp = 0;
		}
	}
	public void setHungry(int i) {
		this.iHungry += i;
		if(this.iHungry <0) {
			this.iHungry = 0;
		}
	}
	public void setLove(int i ) {
		this.iLove += i;
		if(this.iLove <0) {
			this.iLove = 0;
		}
	}
	public int getHp() {
		return this.iHp;
	}
	public int getHungry(){
		return this.iHungry;
	}
	public int getLove() {
		return this.iLove;
	}
	
	

}
