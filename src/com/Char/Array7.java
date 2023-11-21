package com.Char;

public class Array7 {

	public static void main(String[] args) {
		// Multi-dimenctional Array
		int a[][] = new int[3][3];
		a[0][0] = 0;
		a[0][1] = 1;
		a[0][2] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;
		a[2][0] = 6;
		a[2][1] = 7;
		a[2][2] = 8;
		for (int i=0;i<=2;i++) { // for row incrementation
			for (int s=0;s<=2;s++) {
				System.out.print(a[i][s] + "   ");// remove ln in print stetment
		}
		System.out.println();
	}
	}
}
