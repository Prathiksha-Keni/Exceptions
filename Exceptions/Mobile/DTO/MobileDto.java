package com.xworkz.Exceptions.Mobile.DTO;

public class MobileDto {

	private String brand;
	private int price;
	private int ram;
	public MobileDto(String brand, int price, int ram) {
		System.out.println("Inside DTO");
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
	
}
