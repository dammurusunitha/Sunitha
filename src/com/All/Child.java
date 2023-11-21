package com.All;

public class Child implements Parent1,Parent2,Parent3 {

	@Override                                // multiple inheritance 
	public void Austrelia() {
		System.out.println( "Austrelia");
		
	}

	@Override
	public void America() {
		System.out.println("Amerika");
		
	}

	@Override
	public void India() {
		System.out.println("India");
		
		
	}public static void main(String[] args) {
		
		Child c=new Child();
		c.America();
		c.Austrelia();
		c.India();
		
	}

}

