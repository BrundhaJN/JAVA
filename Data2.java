package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;

public class Data2 {
public static  void main(String args[]) {
	Collection collection=new ArrayList<>();
	Collection collection1=new ArrayList<>();
	collection.add("bangalore");
	collection.add("mysore");
	collection.add("tiptur");
	Object[] obj=collection.toArray();
	for(int i=0;i<obj.length;i++) {
		System.out.println(obj[i]);
	}
	collection1.addAll(collection);
	System.out.println(collection.size());
	
	collection1.remove("bangalore");
	System.out.println(collection.size());
	collection.removeAll(collection);
	System.out.println(collection.size());
	collection1.add(23);
	collection1.add(56);
	collection.add(89);
	collection.forEach(System.out::println);
	collection1.forEach(System.out::println);
	System.out.println(collection1.contains("tiptur"));
	System.out.println(collection1.containsAll(collection1));
	System.out.println(collection.equals(collection1));
}
}
