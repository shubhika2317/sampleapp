package org.cap.demo;

public class Bootclass {

	public static void main(String[] args) {
		System.out.println("hello! from sts!");
		show();// TODO Auto-generated method stub

	}
	public static void show() {
		int[] arr= {1,2,3,4,4};
		int sum=0;
		for(int n:arr) {
			sum+=n;
			System.out.println(n);
		
		}
		System.out.println("show method here");
	}

}
