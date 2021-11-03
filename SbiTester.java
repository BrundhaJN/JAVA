package com.xworkz.lightapp;

import java.util.Scanner;

public class SbiTester {
	public static void main(String a[])
	{
		Scanner type=new Scanner(System.in);
		System.out.println("enter the bank");
		
		Icard icard= BankFactory.getmoney(type.next());
		if(icard!=null) {
		
		icard.swipe();
		
	}
}

}
