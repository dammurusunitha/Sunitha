package com.Char;

public class Chair implements Parent1,Parent2,Parent3{ //multiple inheritance

	public static void main(String[] args) {
		
	}

	@Override
	public void Asia() {
		System.out.println("Asia is Big Continent");
		
	}

	@Override
	public void America() {
		
		System.out.println("America is Cregi Country");
	}

	@Override
	public void India() {
		System.out.println("India is Trditional Country");
		
	}

}
