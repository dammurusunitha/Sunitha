package com.Char;
import java.util.Scanner;
public class Sssss {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter letter");
		String s=sc.nextLine();
		//String s="a,e,i,o,u";
		
		switch (s) {
		case "a":System.out.println("vowel a");break;
		case "e": System.out.println("vowel e");break;
		case "i": System.out.println("vowel i");break;
		case "o": System.out.println("vowel o");break;
		case "u": System.out.println("vowel u");break;
		default:System.out.println("Consonent");
		}
	}

}
