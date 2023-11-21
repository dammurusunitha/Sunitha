package com.Char;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:=");
		int no=sc.nextInt();
		
		//int num=7;
		
		
		for(int i=1;i<=no;i++) {
			if((no%1==0)||(no%7==0)){
			System.out.println("it is prime number");
		}else {
			System.out.println("It is not prime number");
		}
	}
	}
}
