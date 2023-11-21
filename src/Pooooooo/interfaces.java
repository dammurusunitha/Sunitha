package Pooooooo;

//public interface {
interface add {
	int a = 23;
	int b = 49;

	void add();
}

interface mul {
	int c = 12;
	int d = 13;

	void mul();

}

class Venu implements add, mul {
	@Override
	public void add() {
		System.out.println(a + b);
	}

	@Override
	public void mul() {

		System.out.println(c * d);
	}

	public static void main(String[] args) {
		Venu v = new Venu();
		v.add();
		v.mul();
	}
}
