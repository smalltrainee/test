package com.woniu.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.woniu.po.Teacher;
import com.woniu.service.ServiceFactory;

/**
 * Servlet implementation class TeacherAction
 */
@WebServlet("/TeacherAction.do")
public class TeacherAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String method=req.getParameter("method");
		 if(method==null){
			 findall(req,resp);
		 }else if(method.equals("add")){
			 add(req,resp);
		 }else if(method.equals("delete")){
			 delete(req,resp);
		 }else if(method.equals("getteacher")){
			 getteacher(req,resp);
		 }else if(method.equals("edit")){
			 edit(req,resp);
		 }
	}


	private void edit(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int tid=Integer.parseInt(req.getParameter("tid"));
		String tname=req.getParameter("tname");
		Teacher t=new Teacher(tid,tname);
		ServiceFactory.getTeacherService().edit(t);
		resp.sendRedirect("TeacherAction.do");
	}


	private void getteacher(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		int tid=Integer.parseInt(req.getParameter("tid"));
		Teacher t=ServiceFactory.getTeacherService().findone(tid);
		req.setAttribute("teacher", t);
		req.getRequestDispatcher("editTeacher.jsp").forward(req, resp);
	}


	private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int tid=Integer.parseInt(req.getParameter("tid"));
		ServiceFactory.getTeacherService().delete(tid);
		resp.sendRedirect("TeacherAction.do");
	}


	private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
         int tid=Integer.parseInt(req.getParameter("tid"));		
		 String tname=req.getParameter("tname");
		 Teacher t=new Teacher(tid,tname);
		 ServiceFactory.getTeacherService().add(t);
		 resp.sendRedirect("TeacherAction.do");
	}


	private void findall(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Teacher>teachers=ServiceFactory.getTeacherService().findall();
		req.setAttribute("teachers", teachers);
		req.getRequestDispatcher("teacherlist.jsp").forward(req, resp);
		
	}

}
