package string;
import java.util.Scanner;
public class Polindrum {
	

	public static void main(String[] args) {
		//String st1 = "dad";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String st1=sc.next();
		
		
		int len = st1.length();
		String rev = " ";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + st1.charAt(i);

		}
		System.out.println("revers string:" + " " + rev);

		if (st1.equals(rev)) {
			System.out.println(rev + "This is polindrum:");
		}
		else {
			System.out.println(rev + "This is not polindrum:");
		}
	}
}
