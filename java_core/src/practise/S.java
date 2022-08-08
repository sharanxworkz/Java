package practise;

public class S {
	int x = 10; // non static example
	public static void main(String[] args) {
		S s = new S();//new keyword send request to class and class creates object once object is created new keyword will get object adress in the refernce variable
		System.out.println(s.x);
	}

}
