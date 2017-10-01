package com.pulppy.bean;

public class MusicDTO {
	private int ID;
	private String musicName;
	private String musicLink;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getMusicLink() {
		return musicLink;
	}
	public void setMusicLink(String musicLink) {
		this.musicLink = musicLink;
	}
	public MusicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MusicDTO(int iD, String musicName, String musicLink) {
		super();
		ID = iD;
		this.musicName = musicName;
		this.musicLink = musicLink;
	}
	
}
