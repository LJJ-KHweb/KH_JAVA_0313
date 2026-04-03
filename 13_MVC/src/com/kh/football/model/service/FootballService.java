package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dao.FootballPlayerDao;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

public class FootballService {
	private List<FootballPlayer> list = new ArrayList();
	private int id;

	{
		list.add(new FootballPlayer(++id, "손흥민", "공격수", 7));
		list.add(new FootballPlayer(++id, "호날도", "공격수", 7));
		list.add(new FootballPlayer(++id, "메시", "미드필더", 7));
	}

	public List<FootballPlayer> selectAll() {
		return list;
	}

	public FootballPlayer insertFootballPlayer(String name, String position, Integer backNumber) {
		list.add(new FootballPlayer(++id, name, position, backNumber));
		return list.get(id);
	}

	public FootballPlayer insertFootballPlayer(FootballPlayerDto player) {
		/*
		 * if (player.getName().length() >= 2) {
		 * 
		 * if (fpd.getPosition().equals("공격수") || fpd.getPosition().equals("미드필더") ||
		 * fpd.getPosition().equals("수비수") || fpd.getPosition().equals("골키퍼")) {
		 * 
		 * }
		 * 
		 * // 값에 대한 유효성 검증 if ("공격수".equals(player.getPosition()) ||
		 * "미드필더".equals(player.getPosition()) || "수비수".equals(player.getPosition()) ||
		 * "골키퍼".equals(player.getPosition())) {
		 * 
		 * if (player.getBakcNumber() >= 0) { list.add(new FootballPlayer(++id,
		 * player.getName(), player.getPosition(), player.getBakcNumber())); return
		 * list.get(list.size() - 1); } }
		 * 
		 * }
		 */
		if (validateFootballPlayer(player)) {
			list.add(new FootballPlayer(++id, player.getName(), player.getPosition(), player.getBakcNumber()));
			return list.get(list.size() - 1);
		}

		return null;
	}

	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		int index = indexOf(id);
		boolean result = validateFootballPlayer(player);
		if (result) {
			list.set(index, new FootballPlayer(id, player.getName(), player.getPosition(), player.getBakcNumber()));
		}

	}

	public boolean findById(int id) {
		if(id < 0) {
			return false;
		}
		for (FootballPlayer fp : list) {
			if (fp.getId() == id) {
				return true;
			}
		}
		return false;
	}

	private boolean validateFootballPlayer(FootballPlayerDto player) {
		if (player.getName().length() >= 2) {

			if ("공격수".equals(player.getPosition()) || "미드필더".equals(player.getPosition())
					|| "수비수".equals(player.getPosition()) || "골키퍼".equals(player.getPosition())) {

				if (player.getBakcNumber() >= 0) {

					return true;
				}
			}

		}

		return false;
	}

	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		if(index != -1) {
			return list.remove(index).getName();
		}
		return null;
	}
	
	private int indexOf(int id) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
	public void outputFootballPlayer() {
		new FootballPlayerDao().outputFootballPlayer(list);
		
	}

	public List<FootballPlayer> searchByKeyword(String keyword) {
		List<FootballPlayer> searched = new ArrayList()
				;
		
		for(FootballPlayer player : list) {
			if(player.getName().contains(keyword)) {
				searched.add(player);
			}
		}
		
		List<FootballPlayer> search = list.stream()
									//.filter(f->f.getName().contains(keyword))
									//.filter(f->f.getPosition().contains(keyword))
									//.filter(f->f.getBackNumber() == keyword)
									.toList();
		
		return searched;
		
	}
}
