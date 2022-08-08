package ScannerClass.scannerdemo;

public class ArrayOutOfBondException {
	public static void main(String[] args) {
		System.out.println("start");
		//int[] a = new int[3];
		//a[0]=10;
	//	a[1]=20;
	//	a[2]=30;
		int[] a = {10,20,30};
		try {
		System.out.println(a[99]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
		System.out.println("end");
	}

}
