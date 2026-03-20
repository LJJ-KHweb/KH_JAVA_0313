package com.kh.chap03.model.vo;

public class Receipt {
	private String payment;
	private String date;
	private String storeName;
	private int price;
	
	public String info() {
		String info = "상품 : " + storeName + ", 금액 : " + price + ", 결재수단 : " + payment + ", 결재일시 : " + date;
		return info;
	}

	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStoreNmae() {
		return storeName;
	}
	public void setStoreName(String storename) {
		this.storeName = storename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
