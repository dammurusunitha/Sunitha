package com.Char;

public class Ecommerce implements Demo1 {

	@Override
	public void Test() {
		
		System.out.println("Test is working good");
	}

	@Override
	public void login() {
		System.out.println("Login functionality working good");
		
	}

	@Override
	public void cart_functionality() {
		System.out.println("Cart functionality working  Good");
		
	}

	@Override
	public void wishlist() {
		System.out.println("Wish list working Good ");
		
	}

	@Override
	public void search() {
		System.out.println("Search functionality working Good");
		
	}
	
	public static void main(String[] args) {
		Ecommerce e=new Ecommerce();
		e.login();
		e.cart_functionality();
		e.search();
		e.Test();
		e.wishlist();
		
	}
	
}
