package com.poll.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poll.model.Candidate;
import com.poll.service.CandidateService;

@WebServlet("/WinnerServlet")
public class WinnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public WinnerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Candidate> c=CandidateService.showWinner();
		if(c!=null) {
			response.sendRedirect("showWinner.jsp");
		}
	}

}
