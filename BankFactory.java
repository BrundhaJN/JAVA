package com.xworkz.lightapp;

public class BankFactory {
	public static Icard getmoney(String type) {
		if(type.equals("sbi")) {
			return new SbiImp();
		}
		else if(type.equals("Icici")) {
			return new IcicImp();
		}else {
			System.out.println("bank not foud");
		}
		return null;
				
	}
}
