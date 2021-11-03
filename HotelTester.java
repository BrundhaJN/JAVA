package com.xworkz.lightapp;

public class HotelTester {
	public static void main(String a[]) {
		IShop ishop=new HotelImp();
		ishop.serve();
		
		IShop ishop1=new Bakery();
		ishop1.serve();
		
		IShop ishop2=new MedicalShop();
		ishop2.serve();
		
		IShop ishop3=new Resturant();
		ishop3.serve();
		
		IShop ishop4=new BeautyParlor();
		ishop4.serve();
	}
}
