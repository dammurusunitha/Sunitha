package com.Char;

public class Child3 extends Child1 {

	public void BesicCalsi() {
		System.out.println("Used for General:");
	}

	public static void main(String[] args) {
		Child3 ch = new Child3();
		ch.BesicCalsi();
		ch.BesicCalsi();
		ch.BusinessCalsi();

	}
}
