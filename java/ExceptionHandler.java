package com.demo;


//exception is some unexpected and unknown behaviour that causes the system to crash
//necessary to find them during runtime else system crashes

public class ExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a = 100/0;
			int[] arr = {1};
			System.out.println(arr[2]);
		} 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("arithmetic exception" + e);
		}
		finally {
			System.out.println("always running");
		}
	}

}
