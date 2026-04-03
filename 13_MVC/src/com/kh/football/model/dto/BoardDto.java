package com.kh.football.model.dto;

import java.util.Objects;

public class BoardDto {
	private int boardNo;			//각 게시글을 식별할 용도의 필드
	private String boardTitle;		// 게시글의 제목을 저장할 필드
	private String boardContent;	// 게시글 내용을 저장할 
	private String boardWriter; 
	private String password;
	private String createDate;
	
	
	
	public BoardDto() {
		super();
	}
	public BoardDto(int boardNo, String boardTitle, String boardContent, String boardWriter, String password,
			String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.password = password;
		this.createDate = createDate;
	}
	public BoardDto(String boardTitle, String boardContent, String boardWriter, String password) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.password = password;
	}
	public final String getBoardTitle() {
		return boardTitle;
	}
	public final void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public final String getBoardContent() {
		return boardContent;
	}
	public final void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public final String getBoardWriter() {
		return boardWriter;
	}
	public final void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "BoardDTo [boardContent=" + boardContent + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardTitle, boardWriter, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardDto other = (BoardDto) obj;
		return Objects.equals(boardContent, other.boardContent) && Objects.equals(boardTitle, other.boardTitle)
				&& Objects.equals(boardWriter, other.boardWriter) && Objects.equals(password, other.password);
	}
	
	
	
}
