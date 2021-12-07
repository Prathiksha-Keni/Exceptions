package com.xworkz.Exceptions.Mobile.DAO;

import com.xworkz.Exceptions.Mobile.DTO.MobileDto;

public interface MobileDaoInterface {

	public void saveMobileDto(MobileDto obj);
	public void displaAll();
	public void displayByBrand(String brand);
	public void updateByBrand(String brand,int newprice);
	public void deleteByBrand(String brand);

	
}
