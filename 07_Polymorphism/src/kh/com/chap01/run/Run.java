package kh.com.chap01.run;

import kh.com.chap01.run.model.vo.Chef;
import kh.com.chap01.run.model.vo.Duil;
import kh.com.chap01.run.model.vo.Hang;
import kh.com.chap01.run.model.vo.Ko;
import kh.com.chap01.run.model.vo.Lee;
import kh.com.chap01.run.model.vo.MainChef;
import kh.com.chap01.run.model.vo.MainPartChef;
import kh.com.chap01.run.model.vo.SaladChef;
import kh.com.chap01.run.model.vo.SaladPartChef;

public class Run {
	public static void main(String[] args) {
		/*
		 * Child1 c11 = new Child1(); Child1 c12 = new Child1(); Child2 c21 = new
		 * Child2(); Child2 c22 = new Child2(); Parent p = new Parent();
		 * 
		 * c11.printChild1(); c12.printChild1(); c21.printChild2(); c22.printChild2();
		 */
		/*
		 * p.printParent(); c1.printChild1(); c1.printParent(); c2.printChild2();
		 * c2.printParent(); Parent p2 = new Child1(); p2.printParent(); ((Child1)
		 * p2).printChild1();
		 */
		/*
		 * Parent[] arry = new Parent[3]; arry[0] = new Child1(); arry[1] = new
		 * Child2(); arry[2] = new Parent();
		 * 
		 * for(int i= 0; i<arry.length; i++) { arry[i].printParent(); if(arry[i]
		 * instanceof Child1) { ((Child1)arry[i]).printChild1(); }else if(arry[i]
		 * instanceof Child2) { ((Child2)arry[i]).printChild2(); }else if(arry[i]
		 * instanceof Parent) { arry[i].printParent(); }else { return; } }
		 */
		/*
		 * Parent p = new Child1(); p.print(); System.out.println();
		*/
		
		System.out.println("빕스 오픈");
		Lee lee = new Lee("이승철");
		Hang hang = new Hang("홍길동");
		Ko ko = new Ko("고길동");
		Duil duil = new Duil("둘리");
		
		lee.cooking();
		hang.cooking();
		ko.cooking();
		duil.cooking();
		
		lee.breakTime();
		hang.breakTime();
		ko.breakTime();
		duil.breakTime();
		System.out.println("======================================================");
		/*
		 * MainChef mcHong = new MainChef("홍길동"); MainChef mcDuli = new MainChef("둘리");
		 * SaladChef scLee = new SaladChef("이승철"); SaladChef scKo = new
		 * SaladChef("고길동");
		 */
		/*
		 * MainChef[] mains = {new MainChef("홍길동"),new MainChef("둘리")}; SaladChef[]
		 * salads = {new SaladChef("이승철"), new SaladChef("고길동")};
		 * 
		 * for(int i=0; i<mains.length; i++) { mains[i].beefCooking();
		 * mains[i].breakTime(); } for(int i=0; i<salads.length; i++) {
		 * salads[i].saladCooking(); salads[i].breakTime(); }
		 */
		
		Chef[] chefs = {new MainPartChef("홍길동"),new MainPartChef("둘리") ,new SaladPartChef("이승철"), new SaladPartChef("고길동")};
		for(int i = 0; i<chefs.length;i++) {
			chefs[i].cooking();
			chefs[i].breakTime();
		}
	}

}
