package com.xworkz.app;

import java.util.Arrays;
import java.util.Collections;

public class Ascending {
	public static void main(String args[]) {
		  int  a[]= {9,7,0,5,54,6,493};
		  String s[]= {"z","f","w","o"};
		  char c[]= {'x','a','b'};
		 double f[]= {90.099,0.09,8.7988};
		  byte b[]= {88,87,14};
		  short t[]= {9000,500,9000,987,89};
		 
		  
		  
		  Arrays.sort(t);
		  for(int n=0;n<t.length;n++) {
			  System.out.println(t[n]);
		  }
		  
		  
		  Arrays.sort(b);
		  for(int m=0;m<b.length;m++) {
			  System.out.println(b[m]);
		  }
		  
		  
		  
		  
		  Arrays.sort(f);
		  for(int l=0;l<f.length;l++) {
			  System.out.println(f[l]);
		  }
		  
		  Arrays.sort(c);
		  for(int k=0;k<c.length;k++) {
			  System.out.println(c[k]);
		  }
		  Arrays.sort(s);
		  for(int j=0;j<s.length;j++) {
			  System.out.println(s[j]);
		  }
		
		  Arrays.sort(a);
		  
		  for(int i=0;i<a.length;i++) {
			  System.out.println(a[i]);
		  }
		 
		 
	  }
	}

