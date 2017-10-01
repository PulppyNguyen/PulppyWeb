package com.pulppy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pulppy.bean.MusicDTO;
import com.pulppy.model.MusicSinglePlay;

/**
 * Servlet implementation class SingelPlay
 */
@WebServlet("/SingelPlay")
public class SingelPlay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingelPlay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idSelect=request.getParameter("id");
		MusicSinglePlay singplay = new MusicSinglePlay();
		List<MusicDTO> lstmusic= new ArrayList<MusicDTO>();
		lstmusic = singplay.getSingleSong(idSelect);
		request.setAttribute("musicList", lstmusic);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/page/SingelSong.jsp");
		dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
