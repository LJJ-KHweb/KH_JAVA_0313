package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList(); Date now = new Date();
		 * System.out.println(now); list.add("하하"); list.add("123"); list.add("true");
		 * 
		 * String text = (String)list.get(0); String text2 = (String)list.get(1);
		 */
		Date now = new Date();
		System.out.println(now);
		/*
		 * StringBox sb = new StringBox(); sb.set("하하"); System.out.println(sb.get());
		 * IntegerBox ib = new IntegerBox(); ib.set(123); System.out.println(ib.get());
		 * Box<String> b = new Box(); b.set("dkdkdk"); System.out.println(b.get());
		 * Box<Integer> ib1 = new Box(); ib1.set(123); System.out.println(ib1);
		 * Box<Plant> pb = new Box(); pb.set(new Plant("금전수", "동양화"));
		 * System.out.println(pb.get());
		 */
		
		List<Plant> plants = new ArrayList();
		plants.add(new Plant("관엽","폴리샤스"));
		plants.add(new Plant("관엽","산세베리아"));
		
		Plant p = plants.get(0);
		
		for(Plant plant: plants) {
			System.out.println(plant);
		}
		
		
 	}

}
/*	E -> Element --> 요소로 사용할때 땐 E로 적자
 * 	T -> Type	 --> 아무타입이나 OK 
 * 	K -> Key	 --> Map 의 Key 타입
 * 	V -> Value 	 --> Map 의 Value 값
 * 	N -> Number  --> 숫자타입
 * 	R -> Return  --> 반환타입
 * 
 * 
 * 
 * */
