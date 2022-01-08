package org.sample;

public class Data {
	public static void main(String[] args) {
		String s = "Nisha";
		String s1 = "Nisha";
		
		System.out.println("Literal String");
		System.out.println("address of s:"+System.identityHashCode(s));
		System.out.println("address of s1:"+System.identityHashCode(s1));
		String s3 =new String( "Nisha");
		String s4  =new String("Nisha");
		System.out.println("Non Literal String");
		System.out.println("address of s3:"+System.identityHashCode(s3));
		System.out.println("address of s4:"+System.identityHashCode(s4));
		



	}

}
