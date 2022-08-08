package com.xworkz.java_core.Array;

public class ArrayUsingForLoop {
	public static void main(String[] args) {
		int[] arr = new int[4];
		int num=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=num;
			num++;
		}
	//	arr[0]=1;
	//	arr[1]=2;
	//	arr[2]=3;
	//	arr[3]=4;
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
