package com.Char;
import java.util.Scanner;

public class Aaaa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("The Person is elegible for vote");
		}
		else {
			System.out.println("The Person is Not elegible for vote");
		}
	}

}
