package nonprimitve;

public class Test {
	public static void main(String[] args) {
		Father f =new Son(); //upcasting
		System.out.println(f.age);
		
		/* down casting*/
		Son s = (Son) f;
		System.out.println(s.age+" "+s.name);
	}

}
