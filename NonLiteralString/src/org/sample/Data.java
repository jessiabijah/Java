package org.sample;

public class Data {
	public static void main(String[] args) {
		String s = "Nisha";
		String s1= "Rengan";
		String s2 ="NishaRengan";
		System.out.println(" NonLiteral String");
		System.out.println("address of"+System.identityHashCode(s));
		System.out.println("address of"+System.identityHashCode(s1));
		System.out.println("address of"+System.identityHashCode(s2));
	}

}


