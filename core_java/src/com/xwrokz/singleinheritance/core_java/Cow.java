package com.xwrokz.singleinheritance.core_java;

public class Cow {
	void cowdetails() {
		System.out.println("cow gives milk");
		
	}

}
class Calf extends Cow{
	void play() {
		System.out.println("calf likes to play");
		
	}
}
class SingleInheritanceAssignment{
	public static void main(String args[]) {
		Cow cow = new Cow ();
		Calf calf = new Calf ();
		calf.cowdetails();
		calf.play();
	
		
		
	}
}