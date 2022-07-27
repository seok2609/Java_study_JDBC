package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
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
		RegionsDTO regionsDTO = new RegionsDTO();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		try {
			ArrayList<RegionsDTO> ar = new ArrayList();
			employeeDAO.getList();
//			regionsView.view(ar);
//			regionsView.view(regionsDTO);
//			DBConnector.getConnection();
//			regionsDAO.getList();
//			regionsDAO.getDetail(2);
//			countriesDAO.getList();
//			countriesDAO.getDetail("AU");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//------------------------------------------
		
		
	}

}
