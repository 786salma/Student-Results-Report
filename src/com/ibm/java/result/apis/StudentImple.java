package com.ibm.java.result.apis;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.java.result.connection.Connection;
import com.ibm.java.result.entity.Students;




public class StudentImple {
	

	
	public List<Students> fetchStudents() throws SQLException {
		String query = "SELECT sname FROM Students";
		ResultSet results = Connection.conn.createStatement().executeQuery(query);
		List<Students> stud = new ArrayList<Students>();
		while (results.next()) {
			stud.add(new Students(results.getString("sname")));
		}
		return stud;
	}
	public void UpdateStudent(String sname,int maths,int english,int science) throws SQLException {
		PreparedStatement stmt = Connection.conn.prepareStatement
				   ("UPDATE students SET maths=?,english=?,science=? where sname=?");
					stmt.setInt(1, maths);
					stmt.setInt(2, english);
					stmt.setInt(3, science);
					stmt.setString(4, sname);
					stmt.executeUpdate();
	}
	
	public List<Students> fetchdetails() throws SQLException {
		String query = "SELECT * FROM students";
		ResultSet results = Connection.conn.createStatement().executeQuery(query);
		List<Students> detail = new ArrayList<Students>();
		while (results.next()) {
			detail.add(new Students(results.getString("sname"),results.getInt("maths"),results.getInt("english"),
					results.getInt("science")));
		}
		return detail;
	}
	
}