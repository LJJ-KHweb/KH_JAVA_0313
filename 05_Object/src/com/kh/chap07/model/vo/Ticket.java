package com.kh.chap07.model.vo;

public class Ticket {
	private int price;
	private String seatNumber;
	private String service;
	private String meal;
	
	public Ticket(int price, String seatNumber, String service, String meal) {
		this.price = price;
		this.seatNumber = seatNumber;
		this.service = service;
		this.meal = meal;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber =seatNumber;
	}
	public void setService(String service) {
		this.service =service;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String info() {
		return "기내식 : " + meal +", 서비스 : "+service+", 좌석 : " + seatNumber + ", 가격 : " + price;
	}
}
