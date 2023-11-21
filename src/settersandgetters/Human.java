package settersandgetters;

public class Human extends Organisation {
	
	void display() {
		//System.out.println(h.getEmpid());
		//System.out.println(h.getEmpname());
	}
	

	public static void main(String[] args) {
		Human h=new Human();
		//h.getEmpid();
		h.setEmpid(11);
		//h.getEmpname();
		h.setEmpname("Sunitha");
		System.out.println(h.getEmpid());
		System.out.println(h.getEmpname());
	}

}
