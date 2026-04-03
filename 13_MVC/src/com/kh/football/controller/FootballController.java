package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.service.FootballService;
import com.kh.football.model.vo.FootballPlayer;

public class FootballController {
	private FootballService fs = new FootballService();
	
	public List<FootballPlayer> selectAll(){
		return fs.selectAll();
	}
	
	public FootballPlayer insertFootballPlayer(String name, String position, int backNumber) {
		return fs.insertFootballPlayer(name, position, backNumber);
	}
	public FootballPlayer insertFootballPlayer(FootballPlayerDto player) {
		return fs.insertFootballPlayer(player);
	}
	
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		fs.updateFootballPlayer(id, player);
		
	}
	
	public boolean findById(int id) {
		return fs.findById(id);
	}

	public String deleteFootballPlayer(int id) {
		return fs.deleteFootballPlayer(id);	
	}
	
	public void outputFootballPlayer() {
		fs.outputFootballPlayer();
	}

	public List<FootballPlayer> searchByKeyword(String keyword) {
		return fs.searchByKeyword(keyword);
		
	}
}
