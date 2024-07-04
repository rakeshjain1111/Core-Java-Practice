package com.rakesh.app;

public class UserDefineException {
        public static void main(String[] args){
			try {
				//throw new MyException();
				throw new MyException("This is Exception");
			} catch (MyException e) {
				System.out.println("catch");
				System.out.println(e.getMessage());
			}
		}
}
