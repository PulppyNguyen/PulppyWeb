package com.pulppy.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pulppy.bean.MusicDTO;
import com.pulppy.connection.MysqlConnection;

public class MusicSinglePlay {
	public List<MusicDTO> getSingleSong(String ID){
		List<MusicDTO> lstmusic= new ArrayList<MusicDTO>();
		try {
			String soql = "Select * from Music__t where musicID =" + Integer.parseInt(ID);
			MysqlConnection sqlconn = new MysqlConnection();
			Connection conn = sqlconn.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(soql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("musicID");
				String musicName = rs.getString("musicName");
				String musicSinger = rs.getString("musicSinger");
				String musicDescription = rs.getString("musicDescription");
				String musicLink = rs.getString("muiscLink");
				String musicImage = rs.getString("musicImage");
				
				MusicDTO musicdto = new MusicDTO();
				musicdto.setMusicID(id);
				musicdto.setMusicName(musicName);
				musicdto.setMusicSinger(musicSinger);
				musicdto.setMusicDescription(musicDescription);
				musicdto.setMusicImage(musicImage);
				musicdto.setMusicLink(musicLink);
				
				lstmusic.add(musicdto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lstmusic;
	}
}
