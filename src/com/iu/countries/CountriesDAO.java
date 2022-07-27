package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	//getDetail : countries_id
	public CountriesDTO getDetail(String country_id) throws Exception{
		
		CountriesDTO countriesDTO = null;
		
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		//2. Query 작성
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		//3. Query 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 값 세팅
		st.setString(1, country_id);
		//5. 최종 전송 후 결과 출력
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString("country_id"));
			countriesDTO.setCountry_name( rs.getString("country_name"));
			countriesDTO.setRegion_id(rs.getInt("region_id"));
			
		}
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
		
		return countriesDTO;
	}
	
	//1. Countries의 모든 데이터 가져오기
	public ArrayList<CountriesDTO> getList() throws Exception {
		
		ArrayList<CountriesDTO> ar = new ArrayList();
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query 문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()) {
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString("country_id"));
			countriesDTO.setCountry_name( rs.getString("country_name"));
			countriesDTO.setRegion_id(rs.getInt("region_id"));
			
			
		}
		
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
		
		return ar;
		
	}

}
