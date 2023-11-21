package Pooooooo;
       
public class Sai { 
	
	
	public void vasu() {                                   //static non static method application
		System.out.println("Good morning vasu");
	}
	
	public static void test1() {
		System.out.println("Welcome to the test1:");
	}
	public void test2() {
		System.out.println("wel come to the test2");
	}

	public static void main(String[] args) {
	test1();
	Sai s=new Sai();
	s.test2();
	Sai v=new Sai();
	v.vasu();
	
	
	
	}

}
