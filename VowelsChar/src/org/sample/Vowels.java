package org.sample;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st =s.next();
		System.out.println(st.replaceAll("[aeious]", "@"));
	

		
	}
}
