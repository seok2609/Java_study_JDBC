package com.iu.test;

import java.util.ArrayList;
 

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.emp.EmployeeDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;


public class TestMain {

	

	public static void main(String[] args) {

		DBConnector dbConnector = new DBConnector();
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		EmployeeDAO employeeDAO = new EmployeeDAO();

		

		try {

			ArrayList<RegionsDTO> ar = new ArrayList();
//			employeeDAO.getSalaryInfo();
//			employeeDAO.getList();
//			regionsView.view(ar);
//			regionsView.view(regionsDTO);
//			DBConnector.getConnection();
//			regionsDAO.getList();
//			regionsDAO.getDetail(2);
//			countriesDAO.getList();
//			countriesDAO.getDetail("AU");
			
			RegionsDTO regionsDTO = new RegionsDTO();
			regionsDTO.setRegion_id(5);
			regionsDTO.setRegion_name("South America");
			int result = regionsDAO.setRegion(regionsDTO);
			
			if(result > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
//			CountriesDTO countriesDTO = new CountriesDTO();
//			countriesDTO.setCountry_id("UR");
//			countriesDTO.setCountry_name("Ukraine");
//			countriesDTO.setRegion_id(6);
//			int result = countriesDAO.setCountry(countriesDTO);
//			
//			if(result > 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		//------------------------------------------

	}
}