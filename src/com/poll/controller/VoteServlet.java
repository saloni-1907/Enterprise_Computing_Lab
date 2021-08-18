package com.poll.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.poll.model.Student;
import com.poll.service.StudentService;



@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	  
    public VoteServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student u=new Student();
		u.setStudentId(Long.parseLong(request.getParameter("id")));
		boolean userPresent=StudentService.register(u);
		String message="";
		if(userPresent==true) {
			 HttpSession session = request.getSession(true);	    
			 message="Your vote has already been casted!";
			 session.setAttribute("message",message); 
		}
		else {
			String name=request.getParameter("candidateName");
			boolean voteCasted=StudentService.castVote(name);
			if(voteCasted==true)
			{
				 HttpSession session = request.getSession(true);	    
				 message="Your vote has been casted successfully!";
				 session.setAttribute("message",message); 
			}
		}
		response.sendRedirect("VotingStatus.jsp");
	}

}
