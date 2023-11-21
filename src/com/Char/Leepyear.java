package com.Char;

public class Leepyear {

	public static void main(String[] args) {
		int year=2020;
		if(year%400==1) {
			System.out.println("Leep-year");
		}
		else if(year%100==9) {
			System.out.println("Not leep year");
		}
		else if(year%4==0) {
			System.out.println("Leep year");
		}
	}

}
