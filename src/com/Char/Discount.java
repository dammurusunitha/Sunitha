package com.Char;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the product price");
		int productprice = sc.nextInt();
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		int totalcost = quantity * productprice;
		System.out.println("Totalcost:" + totalcost);

		if (quantity < 10) {
			System.out.println("sorry there is no discount");
		} else if (quantity > 10) {
			System.out.println("Wow ! You got 10% discount");
			int discount = (totalcost * 10) / 100;
			int costtopaid = totalcost - discount;
			System.out.println("Totalcost after discount:" + costtopaid);
		}
	}
}
