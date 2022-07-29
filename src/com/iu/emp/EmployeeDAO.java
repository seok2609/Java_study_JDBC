package com.iu.emp;

 

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import com.iu.util.DBConnector;

import oracle.jdbc.proxy.annotation.Pre;

 

public class EmployeeDAO {
	
	public void getSalaryInfo() throws Exception {
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. Query 작성
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) FROM EMPLOYEES";
		//3. Query 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 가 있으면 값 세팅
		
		//5. 최종 전송 후 결과처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			int sum = rs.getInt("SUM(SALARY)");
			double age = rs.getDouble("AVG(SALARY)");
			int max = rs.getInt(3);
			
			System.out.println(sum);
			System.out.println(age);
			System.out.println(max);
		}
		
		//6. 자원해제
		
		DBConnector.disConnect(rs, st, con);
	}
	
	public EmployeeDTO getDetail(int employee_id) throws Exception {
		
		EmployeeDTO employeeDTO = null;
		//1. DB연결
		Connection con = DBConnector.getConnection();
		//2. Query 작성
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID =?";
		//3. Query 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 값 세팅
		st.setInt(1, employee_id);
		//5. 최종 전송 후 출력
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			employeeDTO = new EmployeeDTO();
			int eid = rs.getInt(1);
			employeeDTO.setEmployee_id(eid);
			employeeDTO.setFirst_Name(rs.getString(2));
			employeeDTO.setLast_Name(rs.getString(3));
			employeeDTO.setEmail(rs.getString(4));
			employeeDTO.setPhone_Number(rs.getInt(5));
			employeeDTO.setHire_Date(rs.getDate(6));
			employeeDTO.setJob_id(rs.getString(7));
			employeeDTO.setSalary(rs.getInt(8));
			employeeDTO.setCommission_pct(rs.getDouble(9));
			employeeDTO.setManager_id(rs.getInt(10));
			employeeDTO.setDepartment_id(rs.getInt(11));
			
		}
		
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);
		
		return employeeDTO;
		
	}


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
		DBConnector.disConnect(rs, st, con);
		
	}
	
	

}
