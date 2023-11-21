package settersandgetters;

public class Child extends Parent{
	
	public  String dog="lamb";
void display() {
	System.out.println(super.dog);
}
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		

	}

}
