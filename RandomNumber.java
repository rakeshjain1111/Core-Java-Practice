package com.rakesh.app;

public class RandomNumber {
  public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		System.out.println((int)(Math.random()*100+1));
	}
}
}
