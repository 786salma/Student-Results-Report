package com.ibm.java.result;



import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.java.result.apis.StudentImple;
import com.ibm.java.result.entity.Students;


/**
 * Servlet implementation class GetStudents
 */
@WebServlet("/getstudents")
public class GetStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pass","MARKS DETAILS");
		String stu=request.getParameter("student");
		String math=request.getParameter("maths");
		int a=Integer.parseInt(math);
		String eng=request.getParameter("english");
		int b=Integer.parseInt(eng);
		String sci=request.getParameter("science");
		int c=Integer.parseInt(sci);
		
		StudentImple st=new StudentImple();
		try {
			st.UpdateStudent(stu,a,b,c);
			List<Students> fetch=st.fetchdetails();
			request.setAttribute("fetch",fetch);
			request.getRequestDispatcher("WEB-INF/view/first.jsp").forward(request, response);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
		
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
