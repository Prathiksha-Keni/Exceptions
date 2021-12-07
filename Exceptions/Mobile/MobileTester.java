package com.xworkz.Exceptions.Mobile;


import com.xworkz.Exceptions.Mobile.DTO.MobileDto;
import com.xworkz.Exceptions.Mobile.Service.MobileServiceImpl;


public class MobileTester {

	public static void main(String[] args) {
		MobileDto mi = new MobileDto("mi",25000,8);
		MobileServiceImpl mobileServiceImpl = new MobileServiceImpl();
		mobileServiceImpl.ValidateSave(mi);
		
		
//		MobileDto samsung = new MobileDto("mi2",25000,2);
//		mobileServiceImpl.ValidateSave(samsung);
//		MobileDto apple = new MobileDto("mi3",25000,6);
//		mobileServiceImpl.ValidateSave(apple);
	//	System.out.println("-----------------");
		
	
		

	}

}
