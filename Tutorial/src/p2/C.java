package p2;

public class C {
	public static void main(String[] args) {
		C a1 = new C();
		a1.test(10, "sharan", true, 'a', 10.5);
	}

	public void test(int i,String s,boolean b,char c, double d ){
			System.out.println(i);
			System.out.println(s);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
}
