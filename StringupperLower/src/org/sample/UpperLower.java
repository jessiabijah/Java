
package org.sample;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		System.out.println("enter the String");
		String str =S.next();

		char Ch;
		for (int i = 0; i < str.length(); i++) {
			Ch = str.charAt(i);
			if (Character.isUpperCase(Ch)) {
				System.out.print(Character.toLowerCase(Ch));
			} else {
				System.out.print(Character.toUpperCase(Ch));
			}

		}

	}
}
