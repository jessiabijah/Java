package org.sample;

public class Data {
	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		boolean b = s1.equals(s2);
		System.out.println(b);
		String s3 = "Java";
		String s4 = "java";
		boolean b2 = s3.equals(s4);
		System.out.println(b2);
		String s5 = " Green Technology";
		String s6 = " GreenTechnology";
		boolean b3 = s5.equals(s6);
		System.out.println(b3);
		String s7 = "Java";
		String s8 = "java";
		boolean b4 = s7.equalsIgnoreCase(s8);
		System.out.println(b4);
		String s9 = "Nisha";
		String s10 = "nisha";
		boolean b5 = s9.equalsIgnoreCase(s10);
		System.out.println(b5);
	}

}
