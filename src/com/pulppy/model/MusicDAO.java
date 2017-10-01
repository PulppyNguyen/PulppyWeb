package com.pulppy.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pulppy.bean.MusicDTO;
import com.pulppy.connection.MysqlConnection;


public class MusicDAO {
	public static MusicDTO musicDTO;
	MusicDTO music = new MusicDTO();
	
	public List<MusicDTO> getAllSong(){
		List<MusicDTO> lstmusic= new ArrayList<MusicDTO>();
		try {
			String soql = "Select * from Music__t ";
			MysqlConnection sqlconn = new MysqlConnection();
			Connection conn = sqlconn.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(soql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("musicName");
				String songLink = rs.getString("muiscLink");

				MusicDTO musicdto = new MusicDTO();
				musicdto.setID(id);
				musicdto.setMusicName(name);
				musicdto.setMusicLink(songLink);
				lstmusic.add(musicdto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(MusicDTO music : lstmusic){
			System.out.println(music.getMusicName());
		}
		return lstmusic;
	}
	
	public static void main(String[] args) {
		MusicDAO a = new MusicDAO();
		System.out.println(a.getAllSong());
		List<MusicDTO> lstmusic= new ArrayList<MusicDTO>();
		lstmusic = a.getAllSong();
		for(MusicDTO music : lstmusic){
			System.out.println(music.getMusicName());
		}
		
	}
}
