package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;
import com.kh.chap03.model.vo.Shop2;

public class Run {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);		
		
		Set<String> set = new HashSet();
		set.add("안녕하세요~");
		set.add("반갑습니다~");
		set.add("날이 더워요");
		set.add("안녕하세요~");
		set.add(new String("반갑습니다~"));
		set.add(new String("안녕하세요~"));
		
		System.out.println(set);
		System.out.println(set.size());
		
		Set<Shop> shops = new HashSet();
		shops.add(new Shop("이리오너라", "닭볶음탕",9000));
		shops.add(new Shop("굿모닝", "돼지국밥", 7000));
		shops.add(new Shop("공평동꼼장어", "꼼장어",15000));
		shops.add(new Shop("최고기","고기고기",18000));
		shops.add(new Shop("맥주이마트","라면",5000));
		System.out.println(shops);
		Shop2 s = new Shop2("최고기", " ㅇㅁㄴㅇ", 1000);
		
		System.out.println("================================");
		for(Shop shop : shops) {
			System.out.println(shop);
		}
		
		System.out.println("=======================================");
		/*
		 * List list = new ArrayList(); list.addAll(shops);
		 */
		List list = new ArrayList(shops);
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------------------");
		
		Iterator iter = shops.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}

}
