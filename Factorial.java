package com.rakesh.app;

public class Factorial {
 static int Fact(int n) {
	 if(n==1)
	 {
		 return 1;
	 }else {
		 return n*Fact(n-1);
	 }
 } 
 public static void main(String[] args) {
	int n=5;
	System.out.println("Factorial of " +n+" is "+Fact(n));
}
}
