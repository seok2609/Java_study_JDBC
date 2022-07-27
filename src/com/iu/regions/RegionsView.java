package com.iu.regions;
import java.util.ArrayList;

public class RegionsView {
	
	public void view(RegionsDTO regionsDTO) {
		System.out.println("REGION_ID\t Region_name");
		System.out.println("-------------------------------");
		System.out.println(regionsDTO.getRegion_id()+"\t\t ");
		System.out.println(regionsDTO.getRegion_name());
		System.out.println("-------------------------------");
	}
	


	public void view(ArrayList<RegionsDTO> ar) {
		System.out.println("REGION_ID\t Region_name");
		System.out.println("-------------------------------");
		for(RegionsDTO regionsDTO:ar) {
			System.out.println(regionsDTO.getRegion_id()+"\t\t ");
			System.out.println(regionsDTO.getRegion_name());
			System.out.println("-------------------------------");
		}
	}
}