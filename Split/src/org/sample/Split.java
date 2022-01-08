package org.sample;

public class Split {
	public static void main(String[] args) {
		String s = "Welcome to java class";
		String[] sp = s.split(" ");
		for (String string : sp) {
			System.out.println(string);
			
		}
		String s1 = "Welcome to java class";
		String[] sp2=s1.split("l");
		for (String string : sp2) {
			System.out.println(string);
		}
	}

}
