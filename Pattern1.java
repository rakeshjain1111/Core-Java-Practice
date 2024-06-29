package com.rakesh.app;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
		  for (int j = 0; j <6; j++) {
		      if(i==j) {System.out.print("*");}
		      if((i==0||j==5)&&(j!=i)){System.out.print("$");}
		      if(i<j&&i!=0&&j!=5) {System.out.print(1);}
		      if(i>j&&i!=5&&j!=0) {System.out.print(2);}
		      if((j==0||i==5)&&(i!=j)) {System.out.print(0);}
		  }  
		  System.out.println();
		}
		
	}
}
