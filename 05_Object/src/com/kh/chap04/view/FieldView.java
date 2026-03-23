package com.kh.chap04.view;

import com.kh.chap04.controller.FieldController;


public class FieldView {
	

	public void check() {
		FieldController fc = new FieldController();
		fc.checkVariable(5);
		
		
	}
	
	
}
// 함수 파라미터는 함수가 메모리에 올라갈때 같이 올라간다.
