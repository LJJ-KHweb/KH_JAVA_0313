package com.kh.football.functional.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.kh.football.functional.model.service.BinFilter;
import com.kh.football.functional.model.service.RedFilter;
import com.kh.football.functional.model.vo.Material;

public class Run {

	public static void main(String[] args) {

		List<Material> bin = new ArrayList(List.of(new Material("건두부", 1000, "흰색"), new Material("새우완자", 3000, "빨간색"),
				new Material("청경채", 1500, "초록색"), new Material("분모짜", 4000, "흰색"), new Material("소고기", 4000, "빨간색"),
				new Material("옥수수면", 4000, "노란색")));
		BinFilter yellowFilter = new BinFilter() {
			@Override
			public boolean test(Material m) {
				return m.getColor().equals("노란색");
			}
		};

		/*
		 * BinFilter GreenFilter = new BinFilter() {
		 * 
		 * @Override public boolean test(Material m) { return
		 * m.getColor().equals("초록색"); } }; BinFilter GreenFilter = (Material m) -> {
		 * return m.getColor().equals("초록색"); };
		 * 
		 * BinFilter GreenFilter = (m) -> { return m.getColor().equals("초록색"); };
		 * BinFilter GreenFilter = m -> { return m.getColor().equals("초록색"); };
		 */
		BinFilter GreenFilter = m -> m.getColor().equals("초록색");

		BinFilter bf = new RedFilter();
		for (Material m : bin) {
			if (bf.test(m)) {
				System.out.println(m.getName());
			}
		}

		// 마라탕이 재료가 너무 많으니까 필터로 좀 걸러내기
		Predicate<Material> isRed = m -> m.getColor().equals("빨간색");
		Function<Material, String> getName = m -> m.getName();
		System.out.println(getName.apply(new Material("돼지고기",5000,"빨간색")));
		Consumer<Material> print = m -> System.out.println(m.getName());
		print.accept(new Material("양고기", 8000,"빨간색"));
		Supplier<Material> defaultM = () -> new Material("닭고기", 4000, "빨간색");
		Material chicken = defaultM.get();
		
		
	}

}
