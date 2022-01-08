package org.data;

public class Reverse1 {
	public static void main(String[] args) {
		String s ="jessi";
		String n = "";
		for(int i=s.length()-1;i>=0;i--) {
			n= n+s.charAt(i);
			System.out.println(n);
		}
	}
}