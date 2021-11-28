package com.xworkz.app;

import java.util.Arrays;

import java.util.Collections;


public class Decending {
  public static void main(String args[]) {
	  Integer  a[]= {1,6,2,3,4};
	  String s[]= {"a","c","d","l"};
	  Character c[]= {'v','t','z'};
	  Double f[]= {1.099,0.09,0.7988};
	  Byte b[]= {78,98,1};
	  Short t[]= {5000,600,9800};
	 
	  
	  
	  Arrays.sort(t,Collections.reverseOrder());
	  for(int n=0;n<t.length;n++) {
		  System.out.println(t[n]);
	  }
	  
	  
	  Arrays.sort(b,Collections.reverseOrder());
	  for(int m=0;m<b.length;m++) {
		  System.out.println(b[m]);
	  }
	  
	  
	  
	  
	  Arrays.sort(f,Collections.reverseOrder());
	  for(int l=0;l<f.length;l++) {
		  System.out.println(f[l]);
	  }
	  
	  Arrays.sort(c,Collections.reverseOrder());
	  for(int k=0;k<c.length;k++) {
		  System.out.println(c[k]);
	  }
	  Arrays.sort(s,Collections.reverseOrder());
	  for(int j=0;j<s.length;j++) {
		  System.out.println(s[j]);
	  }
	 
	  Arrays.sort(a,Collections.reverseOrder());
	  
	  for(int i=0;i<a.length;i++) {
		  System.out.println(a[i]);
	  }
	 
	 
  }
}
