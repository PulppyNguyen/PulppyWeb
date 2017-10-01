package com.pulppy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pulppy.bean.MusicDTO;
import com.pulppy.model.MusicDAO;

/**
 * Servlet implementation class LoadingIndex
 */
@WebServlet("/LoadingIndex")
public class LoadingIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadingIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AAAA");
		List<MusicDTO> lstmusic= new ArrayList<MusicDTO>();
		MusicDAO musicDAO= new MusicDAO();
		try {
			lstmusic = musicDAO.getAllSong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("musicList", lstmusic);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
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
