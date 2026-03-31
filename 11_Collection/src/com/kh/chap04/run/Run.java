package com.kh.chap04.run;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Sandwich;

public class Run {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		Map<String, Sandwich> subway = new HashMap();
		
		subway.put("에그마요", new Sandwich("담백한맛", "에그랑 마요"));
		subway.put("K-바비큐", new Sandwich("자극적인맛", "풀드포크바비큐"));
		subway.put("스파이시쉬림프", new Sandwich("매콤한맛", "쉬림프"));
		System.out.println(subway);

		subway.put("매콤쉬림프", new Sandwich("매콤한맛", "쉬림프"));
		System.out.println(subway);
		subway.put("매콤쉬림프", new Sandwich("매운맛", "쉬림프"));
		System.out.println(subway);
		System.out.println(subway.get("매콤쉬림프"));
		System.out.println(subway.get("에그마요"));
		System.out.println(subway.get("없는거"));
		
		System.out.println(subway.size());
		System.out.println(subway.isEmpty());
		subway.replace("에그마요", new Sandwich("아주맛있는맛","에그랑마요"));
		System.out.println(subway);
		subway.remove("K-바비큐");
		System.out.println(subway);
		System.out.println("======================================");
		
		subway.forEach((key,value)-> {
			System.out.println(key + " : " + value);
		});
		Set<String> subSet = subway.keySet();
		Iterator<String> iter = subSet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + "===" + subway.get(key));
		}
		Set<Entry<String, Sandwich>> entryset = subway.entrySet();
		
		
		
	}

}
