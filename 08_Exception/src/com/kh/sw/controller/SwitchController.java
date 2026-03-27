package com.kh.sw.controller;

import com.kh.sw.Util.SwitchUtilImpl;
import com.kh.sw.model.vo.Switch;

public class SwitchController {
	private Switch s = new Switch(false);

	
	public boolean toggleSwitch() {
		return new SwitchUtilImpl().toggle(s);
	}
}
