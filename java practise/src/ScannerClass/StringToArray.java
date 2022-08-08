package ScannerClass;

public class StringToArray {
	public static void main(String[] args) {
		String s = "java";
		char [] c =s.toCharArray();
		//for(int i=0;i<c.length;i++) {
			//System.out.println(c[i]);
			
		//}
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}
	}

}
