package com.xworkz.lightapp;

public class LightFactory {
	
	public static ISwitch getLight(String type) {
		if(type.equals("tubelight")) {
			return new TublightImp();
		}
		else if(type.equals("cflbulb")) {
			return new CflBulbImp();
		}else {
			System.out.println("light not found");
		}
		return null;
				
	}

}

