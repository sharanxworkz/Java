package practise;

public class B implements A{

	@Override
	public void test() {
		System.out.println("interface example");
		
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}

}
