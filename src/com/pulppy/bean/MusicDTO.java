package com.pulppy.bean;

public class MusicDTO {
	private int musicID;
	private String musicName;
	private String musicSinger;
	private String musicDescription;
	private String musicLink;
	private String musicImage;
	public MusicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MusicDTO(int musicID, String musicName, String musicSinger, String musicDescription, String musicLink,
			String musicImage) {
		super();
		this.musicID = musicID;
		this.musicName = musicName;
		this.musicSinger = musicSinger;
		this.musicDescription = musicDescription;
		this.musicLink = musicLink;
		this.musicImage = musicImage;
	}
	public int getMusicID() {
		return musicID;
	}
	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getMusicSinger() {
		return musicSinger;
	}
	public void setMusicSinger(String musicSinger) {
		this.musicSinger = musicSinger;
	}
	public String getMusicDescription() {
		return musicDescription;
	}
	public void setMusicDescription(String musicDescription) {
		this.musicDescription = musicDescription;
	}
	public String getMusicLink() {
		return musicLink;
	}
	public void setMusicLink(String musicLink) {
		this.musicLink = musicLink;
	}
	public String getMusicImage() {
		return musicImage;
	}
	public void setMusicImage(String musicImage) {
		this.musicImage = musicImage;
	}
	
	
	
}
