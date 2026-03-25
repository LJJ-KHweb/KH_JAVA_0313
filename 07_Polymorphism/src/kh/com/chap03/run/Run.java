package kh.com.chap03.run;

import java.io.File;

import kh.com.chap03.model.vo.MainChef;
import kh.com.chap03.model.vo.SaladChef;
import kh.com.chap03.model.vo.controller.Cooking;
import kh.com.chap03.model.vo.controller.CookingController;
import kh.com.chap03.model.vo.controller.Pasta;

public class Run {

	public static void main(String[] args) {
		MainChef mc = new MainChef("이승철");
		SaladChef sc = new SaladChef("고길동");
		
		mc.cooking();
		sc.cooking();
		
		CookingController cc = new CookingController();
		cc.pastaCooking();
		
		Cooking cook = new Pasta();
		cook.cooking();
		
	}
}
