package com.Array;

import java.util.Scanner;

public class polindrum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the name:");
		String n=sc.nextLine();
		String rev=" ";
		int len=n.length();
	
		
		for(int i=n.length()-1;i>=0;i--) {
			 rev=rev+n.charAt(i);
		}
			System.out.println(rev);
	if(n.equals(rev)){
		System.out.println("it is polindrum");
	}
	else {
		System.out.println("it's not polindrum");
	}
		
			
}	
	}

