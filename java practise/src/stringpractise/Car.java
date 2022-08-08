package stringpractise;

public class Car {
	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car();
			
		//System.out.println(c);
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		System.out.println(c.equals(c2));
	}

}
