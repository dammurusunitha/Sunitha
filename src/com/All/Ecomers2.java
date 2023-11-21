package com.All;

public class Ecomers2 implements Ecomers {

	@Override
	public void Login() {
		System.out.println("Wel come to login functinality");

	}

	@Override
	public void signup() {
		System.out.println("Wel come to sign up functinality");

	}

	@Override
	public void Logout() {
		System.out.println("Wel come to logout functinality");
	}

	@Override
	public void Serch() {
		System.out.println("Wel come to serch functinality");
	}

	@Override
	public void Menu() {
		System.out.println("Wel come to menu functinality");

	}

	@Override
	public void Pay() {
		System.out.println("Wel come to pay functinality");

	}

	public static void main(String args[]) {
		Ecomers2 e=new Ecomers2();
		e.Login();
		e.Logout();
		e.Serch();
		e.signup();
	    e.Menu();
	    e.Pay();
		
	}
}