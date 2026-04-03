package com.kh.football.model.vo;

import java.util.Date;
import java.util.Objects;

public class Board {
	private final int boardNo;			//각 게시글을 식별할 용도의 필드
	private final String boardTitle;		// 게시글의 제목을 저장할 필드
	private final String boardContent;	// 게시글 내용을 저장할 
	private final String boardWriter; 
	private final String password;
	private final String createDate;
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, String password,
			String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.password = password;
		this.createDate = createDate;
	}
	public int getBoardNo() {
		return boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	
	public String getBoardWriter() {
		return boardWriter;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", password=" + password + ", createDate=" + createDate + "]";
	}
	
	
	
	
}
