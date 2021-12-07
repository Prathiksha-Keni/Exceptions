package com.xworkz.Exceptions.Mobile.Service;

import com.xworkz.Exceptions.Mobile.DAO.MobileDaoImpl;
import com.xworkz.Exceptions.Mobile.DTO.MobileDto;
import com.xworkz.Exceptions.Mobile.Exception.InvalidBrandException;
import com.xworkz.Exceptions.Mobile.Exception.InvalidPriceException;
import com.xworkz.Exceptions.Mobile.Exception.InvalidRamException;

public class MobileServiceImpl implements MobileServiceInterface {

	MobileDaoImpl mobile = new MobileDaoImpl();
	boolean status=true;
	@Override
	public void ValidateSave(MobileDto obj) throws InvalidBrandException {
//		if(obj.getBrand().isEmpty())
//		{
//			status=false;
//			return status;
//		}
//		if(obj.getPrice()<10000)
//		{
//			status=false;
//			return status;
//		}
//		if(obj.getRam()<2)
//		{
//			status=false;
//			return status;
//		}if(status==true) {
//			mobile.saveMobileDto(obj);
//			return status;
//		}
//		else
//		{
//			System.out.println("invalid");
//			return status;
//		}
		
		if (obj.getBrand()==null || obj.getBrand().length()<2)  {
			InvalidBrandException invalidBrandException = new InvalidBrandException("INVALID BRAND NAME");
		throw invalidBrandException;
		}
		
		if (obj.getPrice()==0) {
			InvalidPriceException invalidPriceException = new InvalidPriceException("INVALID PRICE");
			throw invalidPriceException;
		}
		if(obj.getRam()<=2) {
			InvalidRamException invalidRamException = new InvalidRamException("RAM SIZE SHOULD BE GREATER THAN 2");
			throw invalidRamException;
		}
		else
		{
			mobile.saveMobileDto(obj);
		}
	}
}
