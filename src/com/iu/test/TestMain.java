package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
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
		
		
		try {
			ArrayList<RegionsDTO> ar = new ArrayList();
			regionsView.view(ar);
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
