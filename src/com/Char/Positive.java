package com.Char;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
         int num=sc.nextInt();
         if(num>0) {
        	 System.out.println("this is positive num");
         } 
         else 
        	 System.out.println("this is negitive num");
	}

}
