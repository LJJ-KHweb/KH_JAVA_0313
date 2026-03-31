package com.kh.chap03.model.vo;

import java.util.Objects;

public class Shop {
	private String name;
	private String menu;
	private int price;
	public Shop(String name, String menu, int price) {
		this.name = name;
		this.menu = menu;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shop [menu=" + menu + ", name=" + name + ", price=" + price + "]";
	}
	/*
	 * @Override public int hashCode() { return (name + menu + price).hashCode(); }
	 * 
	 * @Override public boolean equals(Object obj) { Shop shop = (Shop)obj;
	 * if(this.price == shop.price &&
	 * this.name.equals(shop.name)&&this.menu.endsWith(shop.menu)) { return true; }
	 * return false; }
	 */
	@Override
	public int hashCode() {
		return Objects.hash(menu, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		return Objects.equals(menu, other.menu) && Objects.equals(name, other.name) && price == other.price;
	}
	public String getName() {
		return name;
	}
	public String getMenu() {
		return menu;
	}
	public int getPrice() {
		return price;
	}
	
	
}
