package ScannerClass;

public class PrintStackTraceGetMessage {
	public static void main(String[] args) {
		//try {
	//	System.out.println(10/0);
	//	}
		//catch(Exception e) {
			//System.out.println("It is giving arithmetic exception");
		//	e.printStackTrace();
			
	//	}
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
