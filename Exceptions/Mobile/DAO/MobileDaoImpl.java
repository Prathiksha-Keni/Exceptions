package com.xworkz.Exceptions.Mobile.DAO;

import com.xworkz.Exceptions.Mobile.DTO.MobileDto;

public class MobileDaoImpl implements MobileDaoInterface {

	
	public MobileDaoImpl() {
		System.out.println("Inside DAO");
	}

	MobileDto mobile[]=new MobileDto[3];
	int index=0;
	@Override
	public void saveMobileDto(MobileDto obj) {
		System.out.println("SAVED");
		mobile[index]=obj;
		index++;
	}

	@Override
	public void displaAll() {
		for (int i = 0; i < mobile.length; i++) {
			if(mobile[i]!=null)
			{
				System.out.println(mobile[i].getBrand());
				System.out.println(mobile[i].getPrice());
				System.out.println(mobile[i].getRam());
			}
		}	
	}

	@Override
	public void updateByBrand(String brand, int newprice) {
		for (int i = 0; i < mobile.length; i++) {
			if(mobile[i].getBrand().equals(brand))
			{
				mobile[i].setPrice(newprice);
			}
		}	
	}

	@Override
	public void deleteByBrand(String brand) {
		for (int i = 0; i < mobile.length; i++) {
			if(mobile[i].getBrand().equals(brand)) {
				mobile[i]=null;
			}
		}	
	}

	@Override
	public void displayByBrand(String brand) {
		for (int i = 0; i < mobile.length; i++) {
			if(mobile[i].getBrand().equals(brand))
			{
			//	if(mobile[i]!=null) {
				System.out.println(mobile[i].getBrand());
				System.out.println(mobile[i].getPrice());
				System.out.println(mobile[i].getRam());
				//}
			}
		}
		
	}
}
