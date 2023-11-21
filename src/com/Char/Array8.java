package com.Char;

public class Array8 {
	

	public static void main(String[] args) {

		String s[] = { "sunitha", "supriya", "mourya", "sunitha" };
		for (int i = 0; i < s.length; i++) {
			for (int v = i+1; v < s.length; v++) {
				if (s[i] == s[v]) {
					System.out.println("duplicate name:=" + s[i]);
				}
			}
			

		}
	}
}