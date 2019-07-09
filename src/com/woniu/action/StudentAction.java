package com.woniu.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.woniu.po.Student;
import com.woniu.service.ServiceFactory;

/**
 * Servlet implementation class StudentAction
 */
@WebServlet("/Student.do")
public class StudentAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = request.getParameter("method");
		if("findAll".equals(method)||method==null){
			findAll(request,response);
		}else if("delStu".equals(method)){
			delStu(request,response);
		}else if("addStu".equals(method)){
			addStu(request,response);
		}else if("getStu".equals(method)){
			getStu(request,response);
		}else if("editStu".equals(method)){
			editStu(request,response);
		}
	}

	private void editStu(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		Student student = new Student(sid, sname);
		ServiceFactory.getStudentService().update(student);
		response.sendRedirect("Student.do?method=findAll");
	}

	private void getStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(request.getParameter("sid"));
		Student student = ServiceFactory.getStudentService().getStu(sid);
		request.setAttribute("student", student);
		request.getRequestDispatcher("editStu.jsp").forward(request, response);
	}

	private void addStu(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		Student stu = new Student();
		stu.setSid(sid);
		stu.setSname(sname);
		ServiceFactory.getStudentService().add(stu);
		response.sendRedirect("Student.do?method=findAll");
	}

	private void delStu(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(request.getParameter("sid"));
		Student stu = new Student();
		stu.setSid(sid);
		ServiceFactory.getStudentService().deleteStu(sid);
		response.sendRedirect("Student.do?method=findAll");
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Student>stulist = ServiceFactory.getStudentService().findAllStu();
		request.setAttribute("stulist", stulist);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
