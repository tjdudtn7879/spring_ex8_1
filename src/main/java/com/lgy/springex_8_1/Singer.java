package com.lgy.springex_8_1;

public class Singer {
	String name,song;
	int member;
	
	public void getSingerInfo() {
		System.out.println("이름 : "+getName());
		System.out.println("멤버 : "+getMember());
		System.out.println("노래 : "+getSong());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	
}
