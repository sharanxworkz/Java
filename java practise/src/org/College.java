package org;

public class College {
	String name;
	int id;

	College(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
//	public String toString() {
//		return name +" " + id;
//	}
	
	public static void main(String[] args) {
		College c1 = new College("sharan",20);
		College c2 = new College("manoj",21);
		College c3 = new College("dharma",20);
	//	System.out.println(c2);
		
		College[] c = {c1,c2,c3};
	//	College[] c = new College[3];
	//	c[0]=c1;
	//	c[1]=c2;
	//	c[2]=c3;
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			System.out.println(c[i].name+" "+c[i].id);
			
		}
	}
	
	

}
