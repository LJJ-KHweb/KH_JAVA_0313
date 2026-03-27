package com.kh.sw.Util;

import com.kh.sw.exception.SwitchBoomException;
import com.kh.sw.model.vo.Switch;

public class SwitchUtilImpl implements SwitchUtil {

	@Override
	public boolean toggle(Switch s) {
		boom();
		s.setOn(!s.isOn());
		return s.isOn();
	}

	/**
	 * 이 예외 클래스는 RuntimeException을 상속받아 구현하고 있으며, 스위치를 눌렀을 때 10%확률로 폭발이 일어나기 떄문에 예외를
	 * 발생시키려고 구현하였음
	 * @author 종로 501강의실 이재준
	 * @since 2026-03-27
	 */
	private void boom() {
		int rand = (int) (Math.random() * 100 + 1);
		if (rand <= 10) {
			throw new SwitchBoomException("터졌다");
		}
	}
}
