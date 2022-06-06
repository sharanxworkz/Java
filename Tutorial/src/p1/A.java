package p1;

public class A {
	 int x = 10;
	 static int y = 20;
	public static void main(String[] args) {
		A a = new A ();
		System.out.println(a.x);
		System.out.println(A.y);
		a.test();
		
	}
	public void test(){
		int z = 30;
		System.out.println(z);
		System.out.println(A.y);
		
	}

}
