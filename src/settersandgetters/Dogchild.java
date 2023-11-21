package settersandgetters;

public class Dogchild extends Dogparent {
	
	
  public void car() {
	System.out.println("Honda");
}
  
  public void display() {
	  super.car();
  }


	public static void main(String[] args) {
		Dogchild ch=new Dogchild();
		ch.display();
		ch.car();

	}

}
