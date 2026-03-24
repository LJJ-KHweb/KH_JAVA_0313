package com.kh.chap01.run;

import com.kh.chap01.model.vo.AosGame;
import com.kh.chap01.model.vo.FpsGame;
import com.kh.chap01.model.vo.RpgGame;

public class Run {

	public static void main(String[] args) {
		RpgGame rg = new RpgGame("와우", "블리자드", 120);
		FpsGame fg = new FpsGame("배틀 그라운드", "크래프톤", 100);
		AosGame ag = new AosGame("LOL","라이엇",172);
		
		System.out.println(rg.info());
		System.out.println(fg.info());
		System.out.println(ag.info());
		
	}
}
