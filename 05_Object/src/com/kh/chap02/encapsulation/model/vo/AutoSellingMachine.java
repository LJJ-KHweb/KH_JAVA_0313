package com.kh.chap02.encapsulation.model.vo;
//멤버변수 == 필드 -> 객체들이 가져야할 공통적인 속석을 기술해 놓는 것

public class AutoSellingMachine {
	private String	sProduckName;
	private int		iProduckPrice;
	private int		iProduckAmount;
	
	public AutoSellingMachine() {
		this.sProduckName = "콜라";
		this.iProduckPrice = 1000;
		this.iProduckAmount = 10;
	}

	public void openMachine() {
		checkAmount();
		insertAmount();
		sellingProduct();
		checkAmount();
	}
	
	private void checkAmount() {
		System.out.println("재고는 총 " +iProduckAmount + "개 남았습니다." );
	}
	
	private void insertAmount() {
		this.iProduckAmount += 3;
	}
	private void sellingProduct() {
		this.iProduckPrice--;
	}
	public String printInfor() {
		String info = "자판기 = [제품명 : "+sProduckName+", 가격 : " + iProduckPrice + ", 재고 : " + iProduckAmount+ "] ";
		return info;
	}
	
	
	public String getsProduckName() {
		return sProduckName;
	}

	public void setsProduckName(String sProduckName) {
		this.sProduckName = sProduckName;
	}

	public int getiProduckPrice() {
		return iProduckPrice;
	}

	public void setiProduckPrice(int iProduckPrice) {
		this.iProduckPrice = iProduckPrice;
	}

	public int getiProduckAmount() {
		return iProduckAmount;
	}

	public void setiProduckAmount(int iProduckAmount) {
		this.iProduckAmount = iProduckAmount;
	}
	
}
