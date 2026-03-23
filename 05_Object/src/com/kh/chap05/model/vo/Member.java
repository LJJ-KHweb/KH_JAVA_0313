package com.kh.chap05.model.vo;

public class Member {
	private String userId;
	private String userPwd;
	private String nickName;
	private int num;
	public Member() {
		System.out.println("생성자 호출");
		this.userId = "이재준";
		this.userPwd = "123456789";
		this.nickName = "학생";
	}
	public Member(String userId) {
		this.userId = userId;
	}
	public Member(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String info() {
		return "사용자 아이디 : " + userId + ", 사용자 비밀번호 : " + userPwd + ", 사용자 별명 : " + nickName;
	}

}
