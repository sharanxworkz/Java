package ScannerClass;

public class FinallyBlockDemo {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("invalid entry");
		}
		finally {
			System.out.println("irrespective of any exception finally block get executed all the time");
			
			
		}
		
		System.out.println("end");
	}

}
