package com.poll.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.poll.model.Candidate;
import com.poll.service.CandidateService;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Candidate c=new Candidate();
		c.setId(Long.parseLong(request.getParameter("id")));
		c.setName(request.getParameter("name"));
		c.setVotes(0);
		boolean status=CandidateService.register(c);
		if(status==true){
		  HttpSession session = request.getSession(true);	    
	      session.setAttribute("message","Candidate registered successfully"); 
	    }
		else {
			HttpSession session = request.getSession(true);	    
	        session.setAttribute("message","Candidate already registered"); 
		}
		response.sendRedirect("RegistrationStatus.jsp"); 
	}

	
}
