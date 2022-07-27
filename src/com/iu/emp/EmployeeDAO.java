package com.iu.emp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class EmployeeDAO {
	public void getList() throws Exception{
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. Query 작성
		String sql = "SELECT * FROM EMPLOYEES";
		//3. Query 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. 최종 전송후 출력
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			int eid = rs.getInt("Employee_id");
			String fname = rs.getString("First_name");
			String lname = rs.getString("Last_name");
			String email = rs.getString("Email");
			//phone number 
			Date date = rs.getDate("YY/MM/DD");
			int sal = rs.getInt("Salary");
			double pct = rs.getDouble("Commission_pct");
			int mid = rs.getInt("Manager_id");
			int did = rs.getInt("Department_id");
			
			System.out.println(eid);
			System.out.println(fname);
			System.out.println(lname);
			System.out.println(email);
			System.out.println(date);
			System.out.println(sal);
			System.out.println(pct);
			System.out.println(mid);
			System.out.println(did);
		}
		DBConnector.disConnect(rs, st, con);
		
	}
	
	

}
