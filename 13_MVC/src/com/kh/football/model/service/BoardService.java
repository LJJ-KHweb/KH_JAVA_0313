package com.kh.football.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.vo.Board;

public class BoardService {

	private List<Board> boards = new ArrayList();
	private int id;
	{
		boards.add(
				new Board(++id, "처 글입니다", "재밌다", "관리자", "1234", new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		boards.add(new Board(++id, "또 글입니다", "하하호호", "관리자", "1234",
				new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
	}

	public List<Board> findAll() {

		return boards;

	}

	public Board findById(int boardNo) {

		return boards.stream().filter(b -> b.getBoardNo() == boardNo).findFirst().orElse(null);

	}

	public void saveBoard(BoardDto board) {
		boards.add(new Board(++id, board.getBoardTitle(), board.getBoardContent(), board.getBoardWriter(),
				board.getPassword(), new SimpleDateFormat("yyyy-MM-dd").format(new Date())));

	}

	public Board updateBoard(int boardNo, BoardDto board) {
		int index = 0;
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				index = i;

			}
		}
		Board b = boards.get(index);
		if (b.getBoardWriter().equals(board.getBoardWriter()) && b.getPassword().equals(board.getPassword())) {
			boards.set(index, new Board(boardNo, board.getBoardTitle(), board.getBoardContent(), board.getBoardWriter(),
					board.getPassword(), b.getCreateDate()));
			return boards.get(index);
		}
		return null;
	}

	public int deleteBoard(int menuNo) {
		if(menuNo < 0) {
			return 0;
		}
		Board board = boards.stream()
							.filter(b -> b.getBoardNo() == menuNo)
							.findFirst().orElse(null);
		if (board != null) {
			boards.remove(menuNo);
			return 1;
		}
		return 0;
	}

}
