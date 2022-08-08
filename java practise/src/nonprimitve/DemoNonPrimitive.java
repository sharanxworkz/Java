package nonprimitve;

public class DemoNonPrimitive {
	public static void main(String[] args) {
		Vehicle v =new Car();
		System.out.println(v.name);
		v.run();
		Car c= (Car)v;
		c.run();
		c.Stop();
		System.out.println(c.fuel);
	System.out.println(c.name);	
	}

}
