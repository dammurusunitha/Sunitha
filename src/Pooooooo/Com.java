package Pooooooo;

public class Com {
	
	int a;
	int b;
	int c;
	

	public void intrest() {
System.out.println("See the interst:");
	}

	public void intrest(int a, int b) {                                //Method over loading
System.out.println(a+b);                                                // methods are same parameters are different.
	}

	public void intrest(int a,long b) {
		System.out.println("a*b");
	}

	public void intrest(int a,int b,int c) {
		System.out.println("a+b+c");
	}
	
	public static void main(String[] args) {

		Com c=new Com();
		c.intrest();
		c.intrest(29, 40);
		c.intrest(50, 50);
		c.intrest(90, 40, 70);
		
		
	}

}
