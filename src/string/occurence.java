package string;
import java.util.Scanner;
public class occurence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String len3=sc.next();
		
		int len1=len3.length();
		int len2=len3.replace("d"," ").length();
		int count=len1-len2;
		System.out.println("After replace length of sentence:"+count);

		

	}

}
