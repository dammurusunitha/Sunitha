package com.Char;

public class Marks {

	public static void main(String[] args) {
		int marks=98;
		if(marks<35) {
			System.out.println("pass");
		}
		else if(marks>35) {
			System.out.println("d grade");
		}
		else if(marks>45) {
			System.out.println("c grade");
		}
		else if(marks>67) {
			System.out.println("b grade");
		}
		else if(marks>89) {
			System.out.println("a grade");
		}
		else if(marks>90) {
			System.out.println("out standing");
		}
		else
			System.out.println("fail");

	}

}
