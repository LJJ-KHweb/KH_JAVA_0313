package com.kh.chap01.abstraction.run.model.vo;

public class Puppy {
	private String 	sName;
	private String 	sSpecies;
	private String 	sGender;
	private int		iWeight;
	private int		iAge;
	
	public Puppy() {
		this.sName = "루이";
		this.sSpecies = "말티즈";
		this.sGender = "수컷";
		this.iWeight = 15;
		this.iAge = 10;
		
	}
	
	public Puppy(String name, String species, String gender, int weight, int age ) {
		this.sName = name;
		this.sSpecies = species;
		this.sGender = gender;
		this.iWeight = weight;
		this.iAge = age;
	}
	
	public void PrintInfor() {
		System.out.println("강아지 이름 : " + this.sName + "/ 성별 : " + this.sSpecies + "/ 종 : " + this.sGender + "/  몸무게 : " + this.iWeight + "kg/ 나이 : " + this.iAge + "살");
		
		
	}
	
	public void bark() {
		System.out.println("왈왈 "+ this.sName + "이(가) 짖고 있습니다.");
	}
	
	public void sit() {
		System.out.println(this.sName + "이(가) 앉습니다.");
		iWeight--;
	}
	
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsSpecies() {
		return sSpecies;
	}

	public void setsSpecies(String sSpecies) {
		this.sSpecies = sSpecies;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

	public int getiWeight() {
		return iWeight;
	}

	public void setiWeight(int iWeight) {
		this.iWeight = iWeight;
	}

	public int getiAge() {
		return iAge;
	}

	public void setiAge(int iAge) {
		this.iAge = iAge;
	}
	

}
