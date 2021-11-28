package com.xworkz.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;





public class data {

	public static void main(String args[]) {
		Collection collection=new ArrayList<>();
		Collection collection1= new ArrayList<>();
		collection.add("abc");
		collection.add("xyz");
		collection.add("vbc");
		collection.add("ups");
		 Object[] obj=collection.toArray();
		 for(int i=0;i<obj.length;i++) {
			 System.out.println(obj[i]);
		 }
		 //utility cls
		 //sArrays.asList()
		
		collection1.addAll(collection);
		System.out.println(collection.size());
		
		collection1.removeAll(collection1);
		System.out.println(collection.size());
		collection.remove("abc");
		
		
		collection1.add(1);
		collection1.add(2);
	
		collection.forEach(System.out::println);
		collection1.forEach(System.out::println);
		//System.out.println(collection.size());
		System.out.println(collection1.contains(1));
		System.out.println(collection1.containsAll(collection1));
	    System.out.println(collection.retainAll(collection1));
	    System.out.println(collection.size());
	
	System.out.println(collection.equals(collection1));
		}
}