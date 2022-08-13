package ScannerClass;

import java.io.FileReader;

public class FileNotFoundException {
	public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("demo.txt");
	} catch (java.io.FileNotFoundException e) {
		System.out.println("file not found");
		
	}
	}

}
