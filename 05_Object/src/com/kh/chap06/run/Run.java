package com.kh.chap06.run;

import com.kh.chap06.cnotroller.MethodController;
import com.kh.chap06.cnotroller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		//System.out.println(new MethodController().add(4, 6));
		//new MethodController().method1();
		//System.out.println(new MethodController().method2());
		OverloadingController oc = new OverloadingController();
		oc.method();
		oc.method(1);
		oc.method(3.0);
		oc.method("안녕");
		oc.method(1,1);
		oc.method(oc);
	}

}
