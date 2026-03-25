package com.kh.chap03.run;

import com.kh.chap03.model.vo.KakaoWebtoon;
import com.kh.chap03.model.vo.NateWebtoon;
import com.kh.chap03.model.vo.NaverWebtoon;
import com.kh.chap03.model.vo.Webtoon;

public class Run {
	public static void main(String[] args) {
		Webtoon webtoon= new Webtoon("화산귀환","LICO","수요일");
		NaverWebtoon naverWebtoon = new NaverWebtoon("전지적독자시점","UMI","수요일","회차당 200원");
		KakaoWebtoon kakaoWebtoon = new KakaoWebtoon("수린당성군전", "일링스", "수요일", false);
		System.out.println(webtoon);
		System.out.println(naverWebtoon);
		System.out.println(kakaoWebtoon);
		System.out.println(webtoon);
		System.out.println(webtoon.toString());
		
		NateWebtoon nwt = new NateWebtoon("재미있는 웹툰", "작가");
		System.out.println(nwt);
		
		
		
	}
	
}

